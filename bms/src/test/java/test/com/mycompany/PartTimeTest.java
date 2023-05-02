/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.mycompany;

import com.mycompany.bms.EmployeeType;
import com.mycompany.bms.PartTime;
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
public class PartTimeTest {
    
   PartTime parttime;
    public PartTimeTest() {
    }

    

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        parttime = new PartTime(40f, 20f, 6, "sumanth", "culli", "suman@gmail.com", "67890", EmployeeType.PartTime);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testHours (){
        assertEquals(parttime.getHours(), 40f);
    }
    
    @Test
    public void testRate (){
        assertEquals(parttime.getRate(), 20f);
    }
    
    @Test
    public void testEid() {
        assertEquals(parttime.getEid(), 6);
    }
    
    
    @Test
    public void testFirst () {
        assertEquals(parttime.getFirst(), "sumanth");
    }
    
    @Test
    public void testLast () {
        assertEquals(parttime.getLast(), "culli");
    }
    
    @Test
    public void testemail () {
        assertEquals(parttime.getEmail(), "suman@gmail.com");
    }
    
    @Test
    public void testphone () {
        assertEquals(parttime.getPhone(), "67890");
    }
    
    @Test
    public void testEmployeeType (){
        assertEquals(parttime.getEmpType(),EmployeeType.PartTime);
    }
    
    @Test
    public void testToString(){
        assertEquals(parttime.toString(), "PartTime{hours=40.0, rate=20.0}Employee{eid=6, first=sumanth, last=culli, email=suman@gmail.com, phone=67890, empType=PartTime}");
    }
}
