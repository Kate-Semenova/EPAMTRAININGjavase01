package test.javase02.t02;

import homework.javase02.t01.Pen;
import homework.javase02.t02.Employee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by Ekaterina Semenova on 26.02.2018.
 */
public class EmployeeTest {

    @Test
    public void addPenShouldReturnFalseIfPensIsNull(){
        Employee employee = new Employee("John", "Snow");
        assertFalse(employee.addPen(new Pen("red", "bic", 10)));
    }

    @Test
    public void addPenShouldReturnTrueIfPensIsNotNull(){}
}
