/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.istic.taa.jaxrs;

import java.io.IOException;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import fr.istic.taa.jaxrs.domain.Person;
import twitter4j.DirectMessage;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

@Path("/status")
public class StatusEndpoint {

	private static final Logger logger = Logger.getLogger(StatusEndpoint.class.getName());

	@GET
	public Response getStatus() {

		return Response.status(Response.Status.OK).entity("JO").build();
	}

	@GET
	@Path("/test")
	public String helloWorld() {

		return "hello";
	}

	@GET
	@Path("/person")
	@Produces(MediaType.APPLICATION_JSON)
	public Person getPerson() {
		Person p = new Person();
		p.setName("test");
		p.setFirstName("t");
		return p;
	}

	@POST
	@Path("/person")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addPerson(Person p) {
		System.err.println(p.getName());
	}

	@GET
	@Path("/swipi")
	@Produces(MediaType.APPLICATION_JSON)
	public void getSwipi() throws IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet("http://swapi.co/api/planets/1/");
		CloseableHttpResponse response = httpclient.execute(httpget);
		System.out.println(response);

		try {

		} finally {
			response.close();
		}
	}


	@GET
	@Path("/tweet")
	@Produces(MediaType.APPLICATION_JSON)
	public void tweet() throws IOException, TwitterException {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		.setOAuthConsumerKey("DFYXzuAheTdD191DjCAxCyE6y")
		.setOAuthConsumerSecret("I6V9ZCiVxJayxrWHlGXwEdTNOBG9RFUOUNm6Cebx7lwI1eOvlw")
		.setOAuthAccessToken("854592445-V9o77DIISqsftm65lbE6zN3TcXsaIEgc81sq8qrh")
		.setOAuthAccessTokenSecret("6AGU2FhJSArfFjxBMxnnyO7s1ajY9UhaxP0njeKx6zxgL");
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();

		String latestStatus = "test #twitter4j #TPTAA";
	    Status status = twitter.updateStatus(latestStatus);
	    System.out.println("Successfully updated the status to [" + status.getText() + "].");
	   
		
	}

	@GET
	@Path("/SendMessage")
	@Produces(MediaType.APPLICATION_JSON)
	public void sendMessage() throws IOException, TwitterException {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		.setOAuthConsumerKey("DFYXzuAheTdD191DjCAxCyE6y")
		.setOAuthConsumerSecret("I6V9ZCiVxJayxrWHlGXwEdTNOBG9RFUOUNm6Cebx7lwI1eOvlw")
		.setOAuthAccessToken("854592445-V9o77DIISqsftm65lbE6zN3TcXsaIEgc81sq8qrh")
		.setOAuthAccessTokenSecret("6AGU2FhJSArfFjxBMxnnyO7s1ajY9UhaxP0njeKx6zxgL");
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		
	  
		String recipientId = "@AladinBagh";
		String message = "Hello world";
		DirectMessage messageT = twitter.sendDirectMessage(recipientId , message);
		
	}

}

