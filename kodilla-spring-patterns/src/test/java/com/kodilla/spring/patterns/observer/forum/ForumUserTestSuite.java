package com.kodilla.spring.patterns.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {

	@Test
	public void testUpdate() {
		//Given
		ForumTopic javaHelp = new JavaHelpForumTopic();
		ForumTopic javaTools = new JavaToolsForumTopic();
		ForumUser user1 = new ForumUser("Johnny Bravo");
		ForumUser user2 = new ForumUser("San Escobar");
		ForumUser user3 = new ForumUser("Ryszard Swetru");

		javaHelp.registerObserver(user1);
		javaHelp.registerObserver(user2);
		javaTools.registerObserver(user2);
		javaTools.registerObserver(user3);
		
		//When
		javaHelp.addPost("This is post 1");
		javaHelp.addPost("This is post 2");
		javaTools.addPost("This is post 1 on javaTools");
		javaTools.addPost("This is post 2 on javaTools");
		javaHelp.addPost("5");
		
		//Then
		Assert.assertEquals(3, user1.getUpdateCount());
		Assert.assertEquals(2,  user3.getUpdateCount());
		Assert.assertEquals(5,  user2.getUpdateCount());
	}
	
}
