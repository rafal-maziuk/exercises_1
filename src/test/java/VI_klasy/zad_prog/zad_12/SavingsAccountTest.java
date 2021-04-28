package VI_klasy.zad_prog.zad_12;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SavingsAccountTest {

    @Test
    public void wyplacanieZKonta() {
        SavingsAccount savingsAccount = new SavingsAccount(1000.0);
        savingsAccount.wyplacanieZKonta(100);
        Assert.assertEquals(900.0, savingsAccount.getStanKonta(), 100);
    }

    @Test
    public void wplacanaKwota() {
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.wplacanaKwota(100);
        Assert.assertEquals(1100, savingsAccount.getStanKonta(), 100);
        Assert.assertNotEquals(1500, savingsAccount.getStanKonta(), 100);
    }

    @Test
    public void dodawanieMiesiecznychOdsetek() {
    }
}