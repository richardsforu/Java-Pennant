package com.wipro.twitter.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.twitter.beans.Counter;
import com.wipro.twitter.entities.Person;
import com.wipro.twitter.entities.Tweet;


@Repository(value = "twitterDao")
class TwitterDaoImpl implements TwitterDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public boolean loginCheck(Person person) {

		boolean status = false;
		Session ses = sessionFactory.getCurrentSession();
		Person obj = (Person) ses.get(Person.class, person.getUserId());

		if (obj == null)
			return false;

		if (obj.getPassword().equals(person.getPassword())) {
			status = true;
		}

		return status;

	}
	
	@Transactional
	public boolean registerUser(Person person){
		
		boolean status=true;
		Session ses = sessionFactory.getCurrentSession();
		
		Person obj = (Person) ses.get(Person.class, person.getUserId());

		if (obj != null)
			return false;
		
		ses.save(person);
				
		
		return status;
	}
	
	
	@Transactional
	public Person findPerson(String userId){
		Session ses = sessionFactory.getCurrentSession();
		Person person=(Person)ses.get(Person.class, userId);
		return person;
	}
	
	@Transactional
	public void updatePerson(Person person){
		Session ses = sessionFactory.getCurrentSession();
		ses.merge(person);	
	}
	
	@Transactional
	public void saveTweet(Tweet tweetMessage){
		Session ses = sessionFactory.getCurrentSession();
		
		ses.save(tweetMessage);
		
	}
	

	@Transactional
	public Counter getCounts(String userId){
		Session ses = sessionFactory.getCurrentSession();
		
		int tweetsCount = ((Long)ses.createQuery("select count(*) from Tweet t where t.person.userId='"+userId+"'").uniqueResult()).intValue();
		String followers= ses.createSQLQuery("select count(following_id) from following f where f.user_id='"+userId+"'").uniqueResult().toString();
		String followingCount= ses.createSQLQuery("select count(following_id) from following f where f.following_id='"+userId+"'").uniqueResult().toString();
		//System.out.println("--- QQ Value is "+qq);
		
		
		
		//ses.createCriteria("Tweet").setProjection(Projections.rowCount()).uniqueResult();
		Counter c=new Counter();
		c.setTweetsCount(tweetsCount);
		c.setFollowingCount(Integer.parseInt(followingCount));
		c.setFollowersCount(Integer.parseInt(followers));
		return c;
		
	}
	
	@Transactional
	public List<Tweet> findTweets(String userId) {

		Session ses = sessionFactory.getCurrentSession();

		 Query qry=ses.createSQLQuery("SELECT * FROM tweet t WHERE t.user_id in (SELECT f.following_id FROM following f WHERE f.user_id ='"+userId+"')OR t.user_id ='"+userId+"'").addEntity(Tweet.class);
		 
		List<Tweet> tweets = qry.list();

		
		return tweets;
	}

}
