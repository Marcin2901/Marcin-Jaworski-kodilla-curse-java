package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Give
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When & Then

       board.toDoList.addTask("to do +1");
       board.inProgresList.addTask("in progres +1");
       board.doneList.addTask("done +1");

       board.toDoList.printTaskList();
        board.inProgresList.printTaskList();
        board.doneList.printTaskList();

    }
}
