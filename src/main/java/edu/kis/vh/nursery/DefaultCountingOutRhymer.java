package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    final int STACK_CAPACITY = 12;
    final int EMPTY_STACK_VALUE = -1;
    final int LAST_INDEX =  STACK_CAPACITY - 1;
    private final int[] numbers = new int[STACK_CAPACITY];


    private int total = EMPTY_STACK_VALUE;

    public int getTotal() {return total;}

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_STACK_VALUE;
    }

    boolean isFull() {
        return total == LAST_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total--];
    }


}
