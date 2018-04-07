package com.kodilla.testing.com.kodilla.testing.forum.statistics;
import com.kodilla.testing.forum.statistics.ForumStats;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;
import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateAdvStatistics0(){
        //Given
        ForumStats stats = new ForumStats();
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> uNames = new ArrayList<String>();

        when(statisticsMock.userNames()).thenReturn(uNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        stats.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue((0==stats.getUserCount() && 0==stats.getPostsNo() && 0==stats.getCommentsNo() && 0== stats.getAverageCommentPerPost() && 0== stats.getAverageCommentPerUser() && 0 == stats.getAveragePostPerUser()));

    }

    @Test
    public void testCalculateAdvStatistics1000(){
        //Given
        ForumStats stats = new ForumStats();
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> uNames = new ArrayList<String>();
        for (int i = 0; i<1000; i++){
            uNames.add("A");
        }
        when(statisticsMock.userNames()).thenReturn(uNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        stats.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue((1000==stats.getUserCount() && 1000==stats.getPostsNo() && 1000==stats.getCommentsNo() && 1== stats.getAverageCommentPerPost() && 1== stats.getAverageCommentPerUser() && 1 == stats.getAveragePostPerUser()));
    }

    @Test
    public void testCalculateAdvStatisticsUneven(){
        //Given
        ForumStats stats = new ForumStats();
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> uNames = new ArrayList<String>();
        for (int i = 0; i<1000; i++){
            uNames.add("A");
        }
        when(statisticsMock.userNames()).thenReturn(uNames);
        when(statisticsMock.postsCount()).thenReturn(4000);
        when(statisticsMock.commentsCount()).thenReturn(9000);

        //When
        stats.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue((1000==stats.getUserCount() && 4000==stats.getPostsNo() && 9000==stats.getCommentsNo() && ((double) 9000/4000)== stats.getAverageCommentPerPost() && (9000/1000)== stats.getAverageCommentPerUser() && 4 == stats.getAveragePostPerUser()));
        stats.showStatistics();
    }
}
