package com.kodilla.testing.forum.statistics;
import java.util.*;

public class ForumStats {
    private int userCount;
    private int postsNo;
    private int commentsNo;
    private double averagePostPerUser;
    private double averageCommentPerUser;
    private double averageCommentPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.userCount = statistics.userNames().size();
        this.postsNo = statistics.postsCount();
        this.commentsNo = statistics.commentsCount();

        if (statistics.userNames().size() == 0) {
            this.averagePostPerUser = 0;
            this.averageCommentPerPost = 0;
        } else {
            this.averagePostPerUser = statistics.postsCount() / statistics.userNames().size();
            this.averageCommentPerUser = statistics.commentsCount()/ statistics.userNames().size();
        }
        if (statistics.postsCount() == 0){
            this.averageCommentPerPost = 0;
        } else {
            this.averageCommentPerPost = (double) statistics.commentsCount() / (double )statistics.postsCount();
        }
    }
    public void showStatistics(){
        System.out.println("Number of users = " + this.userCount);
        System.out.println("Number of posts = " + this.postsNo);
        System.out.println("Number of comments = " + this.userCount);
        System.out.println("Number of average posts per user = " + this.averagePostPerUser);
        System.out.println("Number of average comments per user = " + this.averageCommentPerUser);
        System.out.println("Number of average comments per post = " + this.averageCommentPerPost);
    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostsNo() {
        return postsNo;
    }

    public int getCommentsNo() {
        return commentsNo;
    }

    public double getAveragePostPerUser() {
        return averagePostPerUser;
    }

    public double getAverageCommentPerUser() {
        return averageCommentPerUser;
    }

    public double getAverageCommentPerPost() {
        return averageCommentPerPost;
    }
}
