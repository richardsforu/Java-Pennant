package com.wipro.twitter.dao;

import java.util.List;

import com.wipro.twitter.beans.Counter;
import com.wipro.twitter.entities.Person;
import com.wipro.twitter.entities.Tweet;

public interface TwitterDao {

	public abstract boolean loginCheck(Person person);
	public abstract List<Tweet> findTweets(String userId);
	public abstract boolean registerUser(Person person);
	public abstract void saveTweet(Tweet tweetMessage);
	public abstract Person findPerson(String userId);
	public abstract void updatePerson(Person person);
	public abstract Counter getCounts(String userId);

}