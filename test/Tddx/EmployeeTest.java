package Tddx;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions. *;

public class EmployeeTest {
    @BeforeEach
    void startMethodWith() {
        Industry myIndustry = new Industry("", "", 0.00);
        Employee newEmployee = new Employee("", "", 0.00);
    }

    @Test
    void IndustryCanCreate() {
        Industry myIndustry = new Industry("", "", 10000);
        assertNotNull(myIndustry);
    }

    @Test
    void EmployeesCanBeCreated() {
        Industry myIndustry = new Industry("", "", 10000);
        // assertNotNull(myIndustry.createEmployee());
        assertEquals(2, myIndustry.createEmployee());
    }

    @Test
    void EmployeeCanBeCreated() {
        Employee newEmployee = new Employee("Adeyeye", "Kola", 10000.0);
        assertNotNull(newEmployee);
    }

    @Test
    void EmployeeCanHaveFirstName() {
        Employee newEmployee = new Employee("Adebola", "Omotola", 10000.0);
        newEmployee.getFirstName();
        assertNotNull(newEmployee.getFirstName());
    }

    @Test
    void EmployeeCanHaveSecondName() {
        Employee newEmployee = new Employee("Adebola", "Omotola", 10000.0);
        newEmployee.getSecondName();
    }

    @Test
    void EmployeeCanReceiveSalary() {
        Industry myIndustry = new Industry("", "", 10000.0);
        Employee newEmployee = new Employee("Adebayo", "Joy", 10000.0);
        assertEquals(myIndustry.getPay(), newEmployee.receivePay());
    }

    @Test
    void MoreThanOneEmployeeCanReceiveSalary() {
        Employee newEmployee = new Employee("", "", 15000.0);
        Industry myIndustry = new Industry("John", "Vick", 15000.0);
        assertEquals(newEmployee.receivePay(), myIndustry.getPay());

        newEmployee = new Employee("", "", 10000.0);
        myIndustry = new Industry("Adebayo", "Niyi", 10000.0);
        assertEquals(newEmployee.receivePay(), myIndustry.getPay());

    }
}
