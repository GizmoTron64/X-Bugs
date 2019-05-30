package mutantExamples;

/**
 * RTXC - Remove Thread Method-X Call
 *
 * Removes key methods:
 * wait() - potential interference
 * join(), sleep() - sleep() bug pattern
 * notify(), notifyAll() - notify bug
 */

public class RTXC {

    public void rtxcOG() {
        try {
            wait();
        } catch(InterruptedException e) {}
    }

//    public void rtxcMutant() {
//        try {
//            // Removed wait();
//        } catch(InterruptedException e) {}
//    }
}
