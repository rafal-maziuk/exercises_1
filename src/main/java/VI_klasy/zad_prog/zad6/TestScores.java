package VI_klasy.zad_prog.zad6;

public class TestScores {
    int test1, test2, test3;

    public TestScores() {
    }

    public TestScores(final int test1, final int test2, final int test3) {
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }

    public int getTest1() {
        return test1;
    }

    public void setTest1(final int test1) {
        this.test1 = test1;
    }

    public int getTest2() {
        return test2;
    }

    public void setTest2(final int test2) {
        this.test2 = test2;
    }

    public int getTest3() {
        return test3;
    }

    public void setTest3(final int test3) {
        this.test3 = test3;
    }

    public double avg(){
        double average;
        average = (test1 + test2 + test3) / 3;
        return average;
    }
}
