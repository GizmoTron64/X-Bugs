package mutators;

import java.io.IOException;

public class test {

    public static void main(String[] args) throws IOException {
        FindReplace fr = new FindReplace();
        fr.setInputFile("C:\\Users\\headl\\OneDrive\\Documents\\Uni\\Dissertation\\test1.txt");
        fr.addMethod("wait");
        fr.setReplacement("*2");
        fr.rep();
    }
}
