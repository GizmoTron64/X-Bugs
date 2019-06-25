package mutators;

import java.io.IOException;

public class MutatorRunnable {

    public static void main(String[] args) throws IOException {
        Mutator fr = new Mutator("H:\\My Documents\\Dissertation\\samples\\wait.txt"); //"C:\\Users\\headl\\OneDrive\\Documents\\Uni\\Dissertation\\test1.txt"
        fr.setOperator("mxt", "wait");
        fr.replaceMutation();
    }
}
