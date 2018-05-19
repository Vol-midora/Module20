package com.kodilla.testing.forum.statistics;
import java.util.*;

public interface Statistics {
    List<String> userNames(); //list of user names
    int postsCount(); //total quantity of forum posts
    int commentsCount(); //total quantity of forum comments
}
