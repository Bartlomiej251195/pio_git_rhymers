package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    final int TWELVE = 12;
    final int MINUS_ONE = -1;
    final int ELEVEN = 11;
    private final int[] numbers = new int[TWELVE];


    private int total = MINUS_ONE;

    public int getTotal() {return total;}

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == MINUS_ONE;
    }

    boolean isFull() {
        return total == ELEVEN;
    }

    protected int peekaboo() {
        if (callCheck())
            return MINUS_ONE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return MINUS_ONE;
        return numbers[total--];
    }


}
