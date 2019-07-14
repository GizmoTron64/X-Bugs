package mutators;

import javax.swing.*;
import java.io.File;
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
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        Mutator fr = new Mutator(file);
        fr.setOperator("mxt", "await");
        fr.replaceMutation();
    }
}
