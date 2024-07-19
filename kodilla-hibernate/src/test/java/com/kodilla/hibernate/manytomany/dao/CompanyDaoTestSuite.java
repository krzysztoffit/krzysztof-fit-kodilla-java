package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        // given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        // when
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        // then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        // cleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    void testEmployeesWithLastname() {
        // given
        Employee employee1 = new Employee("Jan", "Nowak");
        Employee employee2 = new Employee("Ewa", "Nowak");
        Employee employee3 = new Employee("Łukasz", "Kowalski");
        Employee employee4 = new Employee("Ilona", "Kowalska");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        employeeDao.save(employee4);

        // when
        List<Employee> nowaksList = employeeDao.employeesWithExactlyLastname("Nowak");
        int size = nowaksList.size();

        // then
        assertEquals(2, size);

        // cleanUp
        try {
            employeeDao.deleteById(employee1.getId());
            employeeDao.deleteById(employee2.getId());
            employeeDao.deleteById(employee3.getId());
            employeeDao.deleteById(employee4.getId());
        } catch (Exception e) {
            // do nothing
        }
    }

    @Test
    void testCompanyNamesStartedBy() {
        // given
        Company company1 = new Company("Polskie Meble");
        Company company2 = new Company("Polskie Okna");
        Company company3 = new Company("Polskie Drogi");
        Company company4 = new Company("Niemieckie Ulice");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        companyDao.save(company4);

        // when
        List<Company> polishCompanies = companyDao.companiesWithNamesStartedBy("Pol%");
        int size = polishCompanies.size();

        // then
        assertEquals(3, size);

        // cleanUp
        try {
            companyDao.deleteById(company1.getId());
            companyDao.deleteById(company2.getId());
            companyDao.deleteById(company3.getId());
            companyDao.deleteById(company4.getId());
        } catch (Exception e) {
            // do nothing
        }

    }
}
