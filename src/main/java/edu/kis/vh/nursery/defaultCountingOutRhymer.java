package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {
    private static final int SIZE_TAB = 12;
    private static final int ERR_CHECK = -1;
    private static final int NUMB = 11;

    private  final int[] numbers = new int[getSizeTab()];

    public static int getSizeTab() {
        return SIZE_TAB;
    }


    public static int getErrCheck() {
        return ERR_CHECK;
    }

    public static int getNUMB() {
        return NUMB;
    }

    public int getTotal() {
        return total;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private int total = -1;

    protected void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    protected boolean callCheck() {
        return getTotal() == -1;
    }

    protected boolean isFull() {
        return getTotal() == getNUMB();
    }

    protected int peekaboo() {
        if (callCheck())
            return getErrCheck();
        return getNumbers()[getTotal()];
    }

    public int countOut() {
        if (callCheck())
            return getErrCheck();
        return getNumbers()[--total];
    }


}
