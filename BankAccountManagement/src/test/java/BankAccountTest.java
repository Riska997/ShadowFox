/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Riska
 */
public class BankAccountTest {
     private BankAccount account;
    
    public BankAccountTest() {
    }

   /* @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }*/

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        account = new BankAccount("12345");
    }

     @Test
    public void testDeposit() {
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.001);
        assertTrue(account.getTransactionHistory().contains("Deposited: $100.0"));
    }

    @Test
    public void testWithdraw() {
        account.deposit(200.0);
        assertTrue(account.withdraw(100.0));
        assertEquals(100.0, account.getBalance(), 0.001);
        assertTrue(account.getTransactionHistory().contains("Withdrew: $100.0"));
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        account.deposit(50.0);
        assertFalse(account.withdraw(100.0));
        assertEquals(50.0, account.getBalance(), 0.001);
    }

    @Test
    public void testTransactionHistory() {
        account.deposit(100.0);
        account.withdraw(50.0);
        assertTrue(account.getTransactionHistory().contains("Deposited: $100.0"));
        assertTrue(account.getTransactionHistory().contains("Withdrew: $50.0"));
    }
}
   /*@org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }*/
    
    /*@BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }*/

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
