package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {


    @Bean
    public TaskList createToDoList(){
        return new TaskList();
    }
    @Bean
    public TaskList createInProgresList(){
        return new TaskList();
    }
    @Bean
    public TaskList createDoneList(){
        return new TaskList();
    }

    @Bean
    public Board getBoard(){
        return new Board(createToDoList(),createInProgresList(),createDoneList());
    }

}
