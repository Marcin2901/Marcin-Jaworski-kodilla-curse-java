package com.kodilla.testing.statistics;




import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuice {

    @Test
    public void testFor0Post(){
        Statistics statisticsMock = mock(Statistics.class);

       when(statisticsMock.postsCount()).thenReturn(0);
       when(statisticsMock.commentsCount()).thenReturn(5);
       List<String> names = new ArrayList<>();
       names.add("aaa");
       when(statisticsMock.usersNames()).thenReturn(names);


        StatisticDependence statisticDependence = new StatisticDependence(statisticsMock);
        statisticDependence.calculateAdvStatistics(statisticsMock);

       assertEquals(0,statisticDependence.liczbaPostow);

    }
    @Test
    public void testFor1000Post(){
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(5);
        List<String> names = new ArrayList<>();
        names.add("aaa");
        when(statisticsMock.usersNames()).thenReturn(names);


        StatisticDependence statisticDependence = new StatisticDependence(statisticsMock);
        statisticDependence.calculateAdvStatistics(statisticsMock);

        assertEquals(1000,statisticDependence.liczbaPostow);

    }
    @Test
    public void testFor0Comment(){
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        List<String> names = new ArrayList<>();
        names.add("aaa");
        when(statisticsMock.usersNames()).thenReturn(names);


        StatisticDependence statisticDependence = new StatisticDependence(statisticsMock);
        statisticDependence.calculateAdvStatistics(statisticsMock);

        assertEquals(0,statisticDependence.liczbaComment);

    }
    @Test
    public void testForComPost(){
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(5);
        List<String> names = new ArrayList<>();
        names.add("aaa");
        when(statisticsMock.usersNames()).thenReturn(names);


        StatisticDependence statisticDependence = new StatisticDependence(statisticsMock);
        statisticDependence.calculateAdvStatistics(statisticsMock);

        assertTrue(statisticDependence.liczbaComment<statisticDependence.liczbaPostow);

    }
    @Test
    public void testForPostCom(){
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(5);
        List<String> names = new ArrayList<>();
        names.add("aaa");
        when(statisticsMock.usersNames()).thenReturn(names);


        StatisticDependence statisticDependence = new StatisticDependence(statisticsMock);
        statisticDependence.calculateAdvStatistics(statisticsMock);

        assertTrue(statisticDependence.liczbaComment>statisticDependence.liczbaPostow);

    }
    @Test
    public void testFor0User(){
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(5);
        List<String> names = new ArrayList<>();
       // names.add("aaa");
        when(statisticsMock.usersNames()).thenReturn(names);


        StatisticDependence statisticDependence = new StatisticDependence(statisticsMock);
        statisticDependence.calculateAdvStatistics(statisticsMock);

        assertEquals(0,statisticDependence.liczbaUsers);

    }
    @Test
    public void testFor100User(){
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(5);
        List<String> names = new ArrayList<>();

        names=name();
        when(statisticsMock.usersNames()).thenReturn(names);


        StatisticDependence statisticDependence = new StatisticDependence(statisticsMock);
        statisticDependence.calculateAdvStatistics(statisticsMock);

        assertEquals(100,statisticDependence.liczbaUsers);

    }

public List<String> name (){
    List<String> n = new ArrayList<>();
        for(int i=0;i<100;i++){
            n.add("as");
        }
        return n;
}


}
