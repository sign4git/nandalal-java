package streams.numeric;

public class MyInteger {

    Integer myInt;

    public MyInteger(Integer myInt) {
        this.myInt = myInt;
    }

    @Override
    public String toString() {
        return myInt.toString();
    }
}
