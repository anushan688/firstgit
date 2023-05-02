/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.mycompany;

import com.mycompany.bms.Employee;
import com.mycompany.bms.EmployeeType;
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
public class EmployeeTest {
    
    Employee employeef; //Declare
    Employee employeep; //Declare
    
    public EmployeeTest() {
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
        employeef = new Employee(4, "anusha", "nayani", "anu@gmail.com", "12345", EmployeeType.FullTime);
        employeep = new Employee(6, "sumanth", "culli", "suman@gmail.com", "67890", EmployeeType.PartTime);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testEid1(){
        assertEquals(employeef.getEid(), 4);
    }
    
    @Test
    public void testFirst1(){
        assertEquals(employeef.getFirst(), "anusha");
    }
    
    @Test
    public void testLast1(){
        assertEquals(employeef.getLast(), "nayani");
    }
    
    @Test
    public void testEmail1(){
        assertEquals(employeef.getEmail(), "anu@gmail.com");
    }
    
    @Test
    public void testphone1(){
        assertEquals(employeef.getPhone(), "12345");
    }
    
    @Test
    public void testEmployeeType1(){
        assertEquals(employeef.getEmpType(), EmployeeType.FullTime);
    }
    
//    @Test
//    public void testToString(){
//        assertEquals(employeef.toString(), "Employee{eid=4}");
   // }
    
    @Test
    public void testEid2(){
        assertEquals(employeep.getEid(), 6);
    }
    
    @Test
    public void testFirst2(){
        assertEquals(employeep.getFirst(), "sumanth");
    }
    
    @Test
    public void testLast2(){
        assertEquals(employeep.getLast(), "culli");
    }
    
    @Test
    public void testEmail2(){
        assertEquals(employeep.getEmail(), "suman@gmail.com");
    }
    
    @Test
    public void testphone2(){
        assertEquals(employeep.getPhone(), "67890");
    }
    
    @Test
    public void testEmployeeType2(){
        assertEquals(employeep.getEmpType(), EmployeeType.PartTime);
    }
    
    @Test
    public void testToStringf(){
        assertEquals(employeef.toString(), "Employee{eid=4, first=anusha, last=nayani, email=anu@gmail.com, phone=12345, empType=FullTime}");
    }
    
    @Test
    public void testToStringp(){
        assertEquals(employeep.toString(), "Employee{eid=6, first=sumanth, last=culli, email=suman@gmail.com, phone=67890, empType=PartTime}");
    }
}
