package com.kodilla.hibernate.task.dao;

//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class TaskDaoTestSuite {
//    @Autowired
//    private TaskDao taskDao;
//    private static final String DESCRIPTION = "Test: Learn Hibernate";
//
//    @Test
//    public void testTaskDaoSave() {
//        //Given
//        Task task = new Task(DESCRIPTION, 7);
//
//        //When
//        taskDao.save(task);
//
//        //Then
//        int id = task.getId();
//        Optional<Task> readTask = taskDao.findById(id);
//        Assert.assertTrue(readTask.isPresent());
//
//        //CleanUp
//        taskDao.deleteById(id);
//    }
//    @Test
//    public void testTaskDaoFindByDuration() {
//        //Given
//        Task task = new Task(DESCRIPTION, 7);
//        taskDao.save(task);
//        int duration = task.getDuration();
//
//        //When
//        List<Task> readTasks = taskDao.findByDuration(duration);
//
//        //Then
//        Assert.assertEquals(1, readTasks.size());
//
//        //CleanUp
//        int id = readTasks.get(0).getId();
//        taskDao.deleteById(id);
//    }
//    @Test
//    public void testTaskDaoSaveWithFinancialDetails() {
//        //Given
//        Task task = new Task(DESCRIPTION, 30);
//        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(100), true));
//        //When
//        taskDao.save(task);
//        int id = task.getId();
//        //Then
//        Assert.assertNotEquals(0,id);
//        //CleanUp
//        taskDao.deleteById(id);
//    }
//}