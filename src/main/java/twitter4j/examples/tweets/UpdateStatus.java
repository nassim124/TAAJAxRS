package twitter4j.examples.tweets;

import twitter4j.Status;
import twitter4j.*;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.conf.ConfigurationBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Example application that uses OAuth method to acquire access to your account.<br>
 * This application illustrates how to use OAuth method with Twitter4J.<br>
 *
 * @author Yusuke Yamamoto - yusuke at mac.com
 */
public final class UpdateStatus {
	/**
	 * Usage: java twitter4j.examples.tweets.UpdateStatus [text]
	 *
	 * @param args message
	 */
	public static void main(String[] args) {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		.setOAuthConsumerKey("DFYXzuAheTdD191DjCAxCyE6y")
		.setOAuthConsumerSecret("I6V9ZCiVxJayxrWHlGXwEdTNOBG9RFUOUNm6Cebx7lwI1eOvlw")
		.setOAuthAccessToken("854592445-V9o77DIISqsftm65lbE6zN3TcXsaIEgc81sq8qrh")
		.setOAuthAccessTokenSecret("6AGU2FhJSArfFjxBMxnnyO7s1ajY9UhaxP0njeKx6zxgL");
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		
		
		
	    
	    
	}
}