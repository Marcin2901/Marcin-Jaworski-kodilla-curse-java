package com.kodilla.hibernate.mamytomany.dao;

//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class CompanyDaoTestSuite {
//    @Autowired
//    CompanyDao companyDao;
//    @Autowired
//    EmployeeDao employeeDao;
//
//    @Test
//    public void testSaveManyToMany() {
//        //Given
//        Employee johnSmith = new Employee("John", "Smith");
//        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
//        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
//
//        Company softwareMachine = new Company("Software Machine");
//        Company dataMaesters = new Company("Data Maesters");
//        Company greyMatter = new Company("Grey Matter");
//
//        softwareMachine.getEmployees().add(johnSmith);
//        dataMaesters.getEmployees().add(stephanieClarckson);
//        dataMaesters.getEmployees().add(lindaKovalsky);
//        greyMatter.getEmployees().add(johnSmith);
//        greyMatter.getEmployees().add(lindaKovalsky);
//
//        johnSmith.getCompanies().add(softwareMachine);
//        johnSmith.getCompanies().add(greyMatter);
//        stephanieClarckson.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(greyMatter);
//
//        //When
//        companyDao.save(softwareMachine);
//        int softwareMachineId = softwareMachine.getId();
//        companyDao.save(dataMaesters);
//        int dataMaestersId = dataMaesters.getId();
//        companyDao.save(greyMatter);
//        int greyMatterId = greyMatter.getId();
//
//        //THen
//        Assert.assertNotEquals(0, softwareMachineId);
//        Assert.assertNotEquals(0, dataMaestersId);
//        Assert.assertNotEquals(0, greyMatterId);
//
//        //CleanUp
//        try {
//            companyDao.deleteById(softwareMachineId);
//            companyDao.deleteById(dataMaestersId);
//            companyDao.deleteById(greyMatterId);
//        } catch (Exception e) {
//            //do nothing
//        }
//
//
//
//    }
//    @Test
//    public void testTaskDaoFindByLastname() {
//        Employee johnSmith = new Employee("John", "Smith");
//        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
//        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
//
//        Company softwareMachine = new Company("Software Machine");
//        Company dataMaesters = new Company("Data Maesters");
//        Company greyMatter = new Company("Grey Matter");
//
//        softwareMachine.getEmployees().add(johnSmith);
//        dataMaesters.getEmployees().add(stephanieClarckson);
//        dataMaesters.getEmployees().add(lindaKovalsky);
//        greyMatter.getEmployees().add(johnSmith);
//        greyMatter.getEmployees().add(lindaKovalsky);
//
//        johnSmith.getCompanies().add(softwareMachine);
//        johnSmith.getCompanies().add(greyMatter);
//        stephanieClarckson.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(greyMatter);
//
//        companyDao.save(softwareMachine);
//        int softwareMachineId = softwareMachine.getId();
//        companyDao.save(dataMaesters);
//        int dataMaestersId = dataMaesters.getId();
//        companyDao.save(greyMatter);
//        int greyMatterId = greyMatter.getId();
//
//        //When
//        List<Employee> nameEmployee = employeeDao.retrieveEmployeeForName("Smith");
//        List<Company> companies = companyDao.findThreeLeters("Gre");
//
//        //Then
//      Assert.assertEquals(1, nameEmployee.size());
//      Assert.assertEquals(1, companies.size());
//
//        try {
//            companyDao.deleteById(softwareMachineId);
//            companyDao.deleteById(dataMaestersId);
//            companyDao.deleteById(greyMatterId);
//            employeeDao.deleteAll();
//        } catch (Exception e) {
//            //do nothing
//        }
//    }
//}
