package com.kodilla.patterns2.observer.forum;

import com.kodilla.patterns2.observator.forum.ForumTopic;
import com.kodilla.patterns2.observator.forum.ForumUser;
import com.kodilla.patterns2.observator.forum.JavaHelpForumTopic;
import com.kodilla.patterns2.observator.forum.JavaToolsForumTopic;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ForumUserTestSuite {

    @Test
            public void testUpdate() {

        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser user1 = new ForumUser("John");
        ForumUser user2 = new ForumUser("Smith");
        ForumUser user3 = new ForumUser("Ivona");

        javaHelpForum.registerObserver(user1);
        javaToolsForum.registerObserver(user2);
        javaHelpForum.registerObserver(user3);
        javaToolsForum.registerObserver(user3);

        //When
        javaHelpForum.addPost("Hello");
        javaHelpForum.addPost("Hello");
        javaToolsForum.addPost("Hello");
        javaHelpForum.addPost("Hello");
        javaToolsForum.addPost("Hello");
        //Then
        Assert.assertEquals(5, user3.getUpdateCount());
        Assert.assertEquals(2, user2.getUpdateCount());
        Assert.assertEquals(3, user1.getUpdateCount());
    }
}
