package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    private int totalRejected = 0;

    protected int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
    // alt + ← przeskakuyje po plikach
}
