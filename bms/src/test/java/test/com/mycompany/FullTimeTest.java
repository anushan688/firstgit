/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.mycompany;

import com.mycompany.bms.EmployeeType;
import com.mycompany.bms.FullTime;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author suman
 */
public class FullTimeTest {
    
   FullTime fulltime;
   
    public FullTimeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        fulltime = new FullTime(5000.0f,4, "anusha", "nayani", "anu@gmail.com", "12345", EmployeeType.FullTime);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testSalary(){
        assertEquals(fulltime.getSalary(), 5000.0f);
    }
     
    @Test
    public void testEid() {
        assertEquals(fulltime.getEid(), 4);
    }

    @Test
    public void testFirst() {
        assertEquals(fulltime.getFirst(), "anusha");
    }

    @Test
    public void testLast() {
        assertEquals(fulltime.getLast(), "nayani");
    }

    @Test
    public void testEmail() {
        assertEquals(fulltime.getEmail(), "anu@gmail.com");
    }

    @Test
    public void testPhone1() {
        assertEquals(fulltime.getPhone(), "12345");
    }

    @Test
    public void testEmployeeType1() {
        assertEquals(fulltime.getEmpType(), EmployeeType.FullTime);
    }

    @Test
    public void testToStringf () {
        assertEquals(fulltime.toString(),"FullTime{salary=5000.0}Employee{eid=4, first=anusha, last=nayani, email=anu@gmail.com, phone=12345, empType=FullTime}");
    }
}
