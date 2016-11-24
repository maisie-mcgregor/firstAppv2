/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1505669
 */
public class FirstAppTest {
    
    public FirstAppTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class FirstApp.
     */
  //  @Test
  //  public void testMain() {
   //     System.out.println("main");
   //     String[] args = null;
   //     FirstApp.main(args);
        // TODO review the generated test code and remove the default call to fail.
  //      fail("The test case is a prototype.");
  //  }

    /**
     * Test of encrypt method, of class FirstApp.
     */
    @Test
    public void testEncrypt() {
        System.out.println("encrypt");
        String input = "Maisie";
        String encryptedValue = "";
        String expResult = "Znvfvr";
        String result = FirstApp.encrypt(input, encryptedValue);
        assertEquals(expResult, result);
    }
    
}
