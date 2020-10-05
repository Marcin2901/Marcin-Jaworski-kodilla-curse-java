package com.kodilla.hibernate.tasklist;


import com.kodilla.hibernate.task.Task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TASKLIST")
public class TaskList {
    private int id;
    private String listName;
    private String descrioption;
    private List<Task> tasks = new ArrayList<>();

    public TaskList(String listName, String descrioption) {
        this.listName = listName;
        this.descrioption = descrioption;
    }

    public TaskList() {
    }
     @OneToMany(
             targetEntity = Task.class,
             mappedBy = "taskList",
             cascade = CascadeType.ALL,
             fetch = FetchType.LAZY
     )
    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }
    @Column(name = "DESCRIPTION")
    public String getDescrioption() {
        return descrioption;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setListName(String listName) {
        this.listName = listName;
    }

    private void setDescrioption(String descrioption) {
        this.descrioption = descrioption;
    }
}
