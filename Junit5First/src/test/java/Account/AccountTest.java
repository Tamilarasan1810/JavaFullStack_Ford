package Account;


//import org.junit.jupiter.api.BeforeEach;
//import org.junit.After;
//import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    /*private static Account account;

    @BeforeEach
    public void setUp() {
        account = new Account();
    }
    @Test
    public void testDeposite(){
        int expected = account.getBalance();
        account.depositeAmount(1200);
        expected += 1200;
//        int c =2/0;
        int actual = account.getBalance();
        assertEquals(expected,actual);
    }

    @Test
    public void testDepositeWithZeroAmount()
    {
        int expected = account.getBalance();
        account.depositeAmount(0);
        int actual = account.getBalance();
        assertEquals(expected,actual);
    }*/
    private Account acnt;

    @BeforeEach
    public void setUp() {
        System.out.println("AccountTest.setUp()");
        acnt = new Account();
    }

    @Test
    public void testDeposit() {
        System.out.println("AccountTest.testDeposit()");
        acnt.deposit(1200);

        double actualBalance = acnt.getBalance();

        assertEquals(1200, actualBalance);
    }

    @Test
    public void testDepositMoreAmount()s {

        System.out.println("AccountTest.testDepositMoreAmount()");
        double actualBalance = acnt.getBalance();

        acnt.deposit(2000);

        double currentBalance = actualBalance + 2000;

        assertEquals(actualBalance + 2000, currentBalance);
    }

//    @Test(expected = IllegalArgumentException.class)
//    public void testDepositForNegativeAmount() {
//
//        System.out.println("AccountTest.testDepositForNegativeAmount()");
//
//        double actualBalance = acnt.getBalance();
//
//        acnt.deposit(-1200);
//
//        double currentBalance = actualBalance + -1200;
//
//        assertEquals(actualBalance - 1200, currentBalance);
//
//    }

    @AfterEach
    public void tearDown() {
        System.out.println("AccountTest.tearDown()");
        acnt = null;
    }


}





