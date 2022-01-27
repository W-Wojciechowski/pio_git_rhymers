package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {
    private static final int SIZE_TAB = 12;
    private static final int ERR_CHECK = -1;
    private static final int NUMB = 11;

    private  final int[] numbers = new int[SIZE_TAB];

    public int getTotal() {
        return total;
    }

    private int total = -1;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == -1;
    }

    protected boolean isFull() {
        return total == NUMB;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERR_CHECK;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERR_CHECK;
        return numbers[total--];
    }

}
