package VI_klasy.zad_prog.zad_12;

import static org.junit.Assert.*;
import org.junit.Test;

public class SavingsAccountTest {

    @Test
    public void wyplacanieZKonta() {
        SavingsAccount savingsAccount = new SavingsAccount(1000.0);
        savingsAccount.wyplacanieZKonta(100);
        assertEquals(900.0, savingsAccount.getStanKonta(), 100);
    }

    @Test
    public void wplacanaKwota() {
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.wplacanaKwota(100);
        double stan = savingsAccount.getStanKonta();
        double spodziewanyWynik = 1100;
        assertEquals(spodziewanyWynik, stan, 100);
        assertNotEquals(1500, savingsAccount.getStanKonta(), 100);
    }
}