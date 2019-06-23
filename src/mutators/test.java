package mutators;

import java.io.IOException;

public class test {

    public static void main(String[] args) throws IOException {
        FindReplace fr = new FindReplace("H:\\My Documents\\Dissertation\\test1.txt"); //"C:\\Users\\headl\\OneDrive\\Documents\\Uni\\Dissertation\\test1.txt"
        fr.addMethod("wait");
        fr.setMutator("*2");
        fr.rep();
    }
}
