package calculator.calulation.lesson3;

import java.io.Serializable;

public class Counters implements Serializable {
    private int counter1 = 0;
    private int counter2 = 0;
    private int counter3 = 0;
    private int counter4 = 0;
    private int counter5 = 0;
    private int counter6 = 0;


    public void incCounter1() {
        this.counter1++;
    }

    public void incCounter2() {
        this.counter2++;
    }

    public void incCounter3() {
        this.counter3++;
    }

    public void incCounter4() {
        this.counter4++;
    }

    public void incCounter5() {
        this.counter5++;
    }

    public void incCounter6() {
        this.counter6++;
    }


    public void setCounter1(int counter1) {
        this.counter1 = counter1;
    }

    public void setCounter2(int counter2) {
        this.counter2 = counter2;
    }

    public void setCounter3(int counter3) {
        this.counter3 = counter3;
    }

    public void setCounter4(int counter4) {
        this.counter4 = counter4;
    }

    public void setCounter5(int counter5) {
        this.counter5 = counter5;
    }

    public void setCounter6(int counter6) {
        this.counter6 = counter6;
    }

    public int getCounter1() {
        return counter1;
    }

    public int getCounter2() {
        return counter2;
    }

    public int getCounter3() {
        return counter3;
    }

    public int getCounter4() {
        return counter4;
    }

    public int getCounter5() {
        return counter5;
    }

    public int getCounter6() {
        return counter6;
    }
}
