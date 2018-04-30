package com.wipro.twitter.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.twitter.beans.Counter;
import com.wipro.twitter.dao.TwitterDao;
import com.wipro.twitter.entities.Person;
import com.wipro.twitter.entities.Tweet;

@Controller
@SessionAttributes("per")
public class TwitterController {

	@Autowired
	private TwitterDao twitterDao;

	@RequestMapping(value = "/loginCheck.htm",method=RequestMethod.POST)
	public ModelAndView loginCheck(@ModelAttribute Person person, @ModelAttribute("userId") Person per) {
		//System.out.println("User Name: "+person.getUserId());
		
		ModelAndView mav = new ModelAndView();
		String viewName = "";

		String userName=new String(person.getUserId());
		
		boolean status = twitterDao.loginCheck(person);

		if (status) {
			mav.addObject("user", userName.toUpperCase() );
			viewName = "forward:/Welcome.jsp";
			List<Tweet>  tweets= twitterDao.findTweets(person.getUserId());
			Counter c= twitterDao.getCounts(person.getUserId());
			
			//System.out.println("----> Size is "+tweets.size());
			//mav.addObject("userName", userName.toUpperCase());
			mav.addObject("tweets", tweets);
			mav.addObject("counts", c);

		} else {
			viewName = "forward:/index.jsp";
			mav.addObject("message", "Invalid User Name/Password");
		}

		mav.setViewName(viewName);
		mav.addObject("per", person);
		return mav;

	}
	
	
	@RequestMapping(value="/registerUser.htm",method=RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute Person person){
		
		ModelAndView mav=new ModelAndView();
		String viewName="";
		person.setActive(1);
		person.setJoined(new Date());
		
		boolean status= twitterDao.registerUser(person);
		
		if(status){
			viewName="forward:/index.jsp";
			mav.addObject("message", "Registartion Success. Login to Continue");
		}else{
			
			viewName="forward:/Register.jsp";
			mav.addObject("message", "Registartion failed. User Name already taken");
			
		}
		
		mav.setViewName(viewName);
			
		return mav;
		
	}
	
	@RequestMapping(value="/tweet.htm",method=RequestMethod.POST)
	public String tweet(@RequestParam("tweetMessage") String tweetMessage,@ModelAttribute("per") Person per){
		
		Tweet t=new Tweet();
		t.setCreated(new Date());
		t.setMessage(tweetMessage);
		t.setPerson(per);
		twitterDao.saveTweet(t);
		return "forward:/find.htm";
		
	}
	
	@RequestMapping(value="/editProfile.htm")
	public ModelAndView editProfile(@RequestParam("userId")String userId){
		//System.out.println("Edit Profile--> User Id: "+userId);
		ModelAndView mav=new ModelAndView();
		Person person= twitterDao.findPerson(userId);
	
		mav.addObject("person",person);
		mav.setViewName("forward:/EditProfile.jsp");
		return mav;
	}
	
	@RequestMapping(value="/updatePerson.htm",method=RequestMethod.POST)
	public String updatePerson(@ModelAttribute Person person){
		
		Person p=twitterDao.findPerson(person.getUserId());
		/*System.out.println("Person Name: "+p.getFullName());
		System.out.println("Active Count: "+p.getActive());
		System.out.println("Email: "+p.getEmail());*/
		person.setActive(p.getActive());
		person.setJoined(p.getJoined());
		person.setFollowing(p.getFollowing());
		twitterDao.updatePerson(person);
		
		return "forward:/find.htm";
	}
	
	@RequestMapping(value="/logout.htm")
	public ModelAndView logOut(){
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("message", "Sucessfuly loged out");
		mav.setViewName("forward:/index.jsp");
		return mav;
	}
	
	@RequestMapping(value="/counts.htm")
	public ModelAndView counts(@ModelAttribute("per") Person per){
		ModelAndView mav=new ModelAndView();
		Counter c= twitterDao.getCounts(per.getUserId());
		mav.setViewName("forward:/Follow.jsp");
		mav.addObject("counts", c);
		return mav;
		
	}
	
	
	
	
	@RequestMapping(value="/find.htm")
	public ModelAndView findTweets(@ModelAttribute("per") Person per){
		ModelAndView mav = new ModelAndView();
		//System.out.println("------> User Name:  "+per.getUserId());
		List<Tweet>  tweets= twitterDao.findTweets(per.getUserId());
		mav.setViewName("forward:/Welcome.jsp");
		mav.addObject("tweets", tweets);
		Counter c= twitterDao.getCounts(per.getUserId());
		mav.addObject("counts", c);
		//System.out.println("Size: "+tweets.size());
		
		/*for(Tweet t:tweets){
			System.out.println("--> Id: "+t.getTweetId());
			System.out.println("--> Message: "+t.getMessage());
			System.out.println("--> Created Date: "+t.getCreated());
			System.out.println("--> User: "+t.getPerson().getUserId());
		}*/
		
		
		
		
		/*for(int i=0;i<tweets.size();i++){
			Object obj[]=tweets.get(i);
			//Object ooo[]=
			Tweet t=new Tweet();
			
			
			for(Object o:obj){
				
				System.out.println("----> "+o);
			}
			
		}*/
		
		
		
		return mav;
		
	}

}
