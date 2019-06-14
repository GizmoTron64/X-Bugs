package mutators;

import java.io.IOException;

public class MutatorTest {
    public static void main(String[] args) throws IOException {
        Mutator mutator = new Mutator();
        mutator.visitWait();
    }
}