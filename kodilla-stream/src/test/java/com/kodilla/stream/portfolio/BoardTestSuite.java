package com.kodilla.stream.portfolio;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class BoardTestSuite {

    public Board prepareTestData(){
        //users
        User user1 = new User("developer1" , "John Smith");
        User user2 = new User("projectmanager1", "Nina White");
        User user3 = new User("developer2", "Emilia Stephanson");
        User user4 = new User("developer3", "Konrad Bridge");
        //tasks
        Task task1 = new Task("Microsevice for taking temperature",
                "Write and test the microsevice taking\n the temperaure from exter al service",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30));
        Task task2 = new Task("HQLs for analysis",
                "Prepare some HQL quaries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));
        Task task3 = new Task("Temperatures entity",
                "Prepare entity for temperatures",
                user3,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(15));
        Task task4 = new Task("Own logger",
                "Refactor company logger to meet our needs",
                user3,
                user2,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(25));
        Task task5 = new Task("Oprimize searching",
                "Archive data searching has to be oprimized",
                user4,
                user2,
                LocalDate.now(),
                LocalDate.now().plusDays(5));
        Task task6 = new Task("Use Streams",
                "use Streams rather thsn for-loops in predictions",
                user4,
                user2,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2));
        //taskLists
        TaskList taskListToDo = new TaskList("To do");
            taskListToDo.addTask(task1);
            taskListToDo.addTask(task3);
        TaskList taskListInProgress = new TaskList("In progress");
            taskListInProgress.addTask(task5);
            taskListInProgress.addTask(task4);
            taskListInProgress.addTask(task2);
        TaskList taskListDone = new TaskList("Done");
            taskListDone.addTask(task6);
        //board
        Board project = new Board("Project Weather Prediction");
            project.addTaskList(taskListToDo);
            project.addTaskList(taskListInProgress);
            project.addTaskList(taskListDone);
            return project;


    }

    @Test
    public void testAddTaskList(){
        //Given
        Board project = prepareTestData();
        //When
        //then
        Assert.assertEquals(3,project.getTaskLists().size());
    }

    @Test
    public void testAddTaskListFindUsersTasks(){
        //Given
        Board project = prepareTestData();
       User user = new User("developer1", "John Smith");
        //When
       List<Task> list =project.getTaskLists().stream()
                .flatMap(s -> s.getTasks().stream())
                .filter(s -> s.getAssignedUser().equals(user))
                .collect(toList());


      //Then
        Assert.assertEquals(2, list.size());
        Assert.assertEquals(user, list.get(0).getAssignedUser());
        Assert.assertEquals(user, list.get(1).getAssignedUser());

    }

    @Test
    public void testAddTaskListFindOutdatedTasks(){
        Board project = prepareTestData();

        //When
        List<TaskList> undoneTasks = new ArrayList<>();
        undoneTasks.add(new TaskList("To do"));
        undoneTasks.add(new TaskList("In progress"));
        List<Task> tasks = project.getTaskLists().stream()
                .filter(undoneTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .filter(t -> t.getDeadline().isBefore(LocalDate.now()))
                .collect(toList());

        //Then
        Assert.assertEquals(1, tasks.size());
        Assert.assertEquals("HQLs for analysis", tasks.get(0).getTitle());
    }

    @Test
    public void testAddTaskListFindLongTasks(){
        Board project = prepareTestData();

        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));
        long longTasks = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(s -> s.getTasks().stream())
                .map(s -> s.getCreated())
                .filter(s -> s.compareTo(LocalDate.now().minusDays(10))<=0)
                .count();

        Assert.assertEquals(2, longTasks);
    }

    @Test
    public void testAddTaskListAverageWorkingOnTask(){
        Board project = prepareTestData();


        //When
        List<TaskList> list = new ArrayList<>();
        list.add(new TaskList("In progress"));

       List<Integer> days = project.getTaskLists().stream()
                .filter(list::contains)
                .flatMap(s -> s.getTasks().stream())
                .map(s ->  LocalDate.now().getDayOfMonth()-s.getCreated().getDayOfMonth())
                .collect(toList());
                //.reduce(0, (sum,current) -> sum = sum+current);


        double a= IntStream.range(0, days.size())
                .map(s -> s=days.get(s))
                .average().getAsDouble();

           //Then
             Assert.assertEquals(10.00, a, 0.001);

    }












}
