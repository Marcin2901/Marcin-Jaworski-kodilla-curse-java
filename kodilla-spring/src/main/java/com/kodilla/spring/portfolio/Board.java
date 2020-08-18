package com.kodilla.spring.portfolio;

public class Board {
  public TaskList toDoList;
    public TaskList inProgresList;
    public TaskList doneList;

  public Board(TaskList toDoList, TaskList inProgresList, TaskList doneList) {
    this.toDoList = toDoList;
    this.inProgresList = inProgresList;
    this.doneList = doneList;
  }

}
