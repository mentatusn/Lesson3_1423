package calculator.calulation.lesson3;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Counters implements Parcelable {
    private int counter1 = 0;
    private int counter2 = 0;
    private int counter3 = 0;
    private int counter4 = 0;
    private int counter5 = 0;
    private int counter6 = 0;





    Counters(){}

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



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(counter1);
        dest.writeInt(counter2);
        dest.writeInt(counter3);
        dest.writeInt(counter4);
        dest.writeInt(counter5);
        dest.writeInt(counter6);
    }
    protected Counters(Parcel in) {
        counter1 = in.readInt();
        counter2 = in.readInt();
        counter3 = in.readInt();
        counter4 = in.readInt();
        counter5 = in.readInt();
        counter6 = in.readInt();
    }

    public static final Creator<Counters> CREATOR = new Creator<Counters>() {
        @Override
        public Counters createFromParcel(Parcel in) {
            return new Counters(in);
        }

        @Override
        public Counters[] newArray(int size) {
            return new Counters[size];
        }
    };
}
