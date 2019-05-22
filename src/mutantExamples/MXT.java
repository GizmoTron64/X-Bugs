package mutantExamples;

/**
 * mutantExamples.MXT - Modify Method-X Timeout
 * wait(), sleep(), join(), await()
 *
 * Replaces timeout parameter t
 * Produces interference bug or data race
 */

public class MXT {
    long time = 1000;

    public void mxtOG() {
        try {
            wait(time);
        } catch(InterruptedException e) {}
    }

    public void mxtMutant() {
        try {
            wait(time*2); // or wait(time/2)
        } catch(InterruptedException e) {}
    }
}

