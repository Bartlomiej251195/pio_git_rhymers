package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    int TWELVE = 12;
    int MINUS_ONE = -1;
    int ELEVEN = 11;
    private int[] numbers = new int[TWELVE];


    private int total = MINUS_ONE;

    public int getTotal() {return total;}

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == MINUS_ONE;
    }

    private boolean isFull() {
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
