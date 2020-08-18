package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<String> task ;

    public TaskList(){
        task = new ArrayList<>();
    }

    public void addTask(String zadanie){
        task.add(zadanie);
    }
    public void printTaskList(){
       for(int i=0; i<task.size();i++) {
           System.out.println(task.get(i));
       }
    }

}
