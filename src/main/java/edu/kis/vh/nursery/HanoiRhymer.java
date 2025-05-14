package edu.kis.vh.nursery;

/**
 * Klasa odpowiadająca za stos
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * Licznik odrzuconych wartości.
     */
    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje element do stosu gdy jest mniejszy lub równy poprzedniemu
     * @param in wartosc do dodania
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
