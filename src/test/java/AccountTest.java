/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ie.nuigalway.mschukat.mavenproject3.Account;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class AccountTest {
    
    public AccountTest() {
    }

    @Test
    public void evaluatesGetName() {
    Account acc = new Account("Michael", 1000);
    assertEquals(acc.getName(), "Michael1");
  } 
}
