package mutators;

import java.io.IOException;

/**
 * Filepaths:
 * "C:\\Users\\headl\\OneDrive\\Documents\\Uni\\Dissertation\\test1.txt"
 * "H:\\My Documents\\Dissertation\\samples\\
 * lock.txt"
 * account.java"
 *
 */

public class MutatorRunnable {

    public static void main(String[] args) throws IOException {
        Mutator fr = new Mutator("H:\\My Documents\\Dissertation\\samples\\account.java");
        fr.setOperator("rcxc", "lock");
        fr.replaceMutation();
    }
}
