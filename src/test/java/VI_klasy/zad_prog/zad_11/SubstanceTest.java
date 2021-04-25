package VI_klasy.zad_prog.zad_11;

import org.junit.Assert;

public class SubstanceTest {

    @org.junit.Test
    public void isEthylFreezing() {
        Substance substance = new Substance();
        Assert.assertTrue(substance.isEthylFreezing(-123));
    }

    @org.junit.Test
    public void isOxygenFreezing() {
        Substance substance = new Substance();
        Assert.assertTrue(substance.isOxygenFreezing(-220));
    }

    @org.junit.Test
    public void isWatesFreezing() {
        Substance substance = new Substance();
        Assert.assertTrue(substance.isWatesFreezing(-1));
    }
}