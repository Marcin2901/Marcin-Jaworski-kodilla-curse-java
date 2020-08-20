package com.kodilla.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class BoardTestSuite {
    @Test
    public void testToString(){
        //given
        //creating the TasksList for ToDoList
        TasksList listToDo = new TasksList("To Do Task");
        IntStream.iterate(1, n -> n +1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("To Do Task number: " + n)));
        //creating the TasksList for InProgres
        TasksList listInProgres = new TasksList("In Progress Tasks");
        IntStream.iterate(1, n -> n +1)
                .limit(10)
                .forEach(n -> listInProgres.getTasks().add(new Task("In Progress Task number: " + n)));
        //creating the TasksList for DoneTask
        TasksList listDoneTask = new TasksList("Done Tasks");
        IntStream.iterate(1, n ->n +1)
                .limit(10)
                .forEach(n -> listDoneTask.getTasks().add(new Task("Done Task number: " + n)));
        //creating the board and assigning the lists
        Board board = new Board("Project nr 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgres);
        board.getLists().add(listDoneTask);

        //creating clone Board
        Board clonedBoard = null;
        try {
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project nr 2");
        }
        catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //making a deep copy of object board
        Board deepClonedBoard = null;
        try{
            deepClonedBoard = board.deepCopy();
            deepClonedBoard.setName("Project nr 3");
        }
        catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        board.getLists().remove(listToDo);

        //Then
        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepClonedBoard);


        Assert.assertEquals(2, board.getLists().size());
        Assert.assertEquals(2, clonedBoard.getLists().size());
        Assert.assertEquals(3, deepClonedBoard.getLists().size());
        Assert.assertEquals(board.getLists(), clonedBoard.getLists());
        Assert.assertNotEquals(board.getLists(), deepClonedBoard.getLists());
    }
}
