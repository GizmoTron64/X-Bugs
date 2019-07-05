package mutators;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

public class MutatorTest {
    private Mutator mutator;

    @org.junit.Before
    public void setUp() throws Exception {
        mutator = new Mutator(new File("H:\\My Documents\\Dissertation\\samples\\unitTest.txt"));
    }

    @org.junit.Test
    public void replaceMutation() {
    }

    @org.junit.Test
    public void countMethodInstances() {
    }

    @org.junit.Test
    public void writeToFile() {
    }

    @org.junit.Test
    public void printState() {
    }

    @org.junit.Test
    public void getMutation() {
    }

    @org.junit.Test
    public void setMutation() {
    }

    @org.junit.Test
    public void getMethod() {
        mutator.setOperator("rtxc", "wait");
        assertEquals(mutator.getMethod(), "wait");
    }

    @org.junit.Test
    public void setOperatorInvalid() {
        mutator.setOperator("invalid");
        assertNull(mutator.getOperator());
    }

    @org.junit.Test
    public void setOperatorChosenMethodValid() {
        mutator.setOperator("rtxc", "wait");
        assertEquals(mutator.getOperator(), "rtxc");
        assertEquals(mutator.getMutation(), "");
        assertEquals(mutator.getMethod(), "wait");
    }

    @org.junit.Test
    public void setOperatorChosenMethodInvalid() {
        mutator.setOperator("rtxc", "none");
        assertEquals(mutator.getOperator(), "rtxc");
        assertEquals(mutator.getMutation(), "");
        assertTrue(mutator.getRtxcMethods().contains(mutator.getMethod()));
    }

    @org.junit.Test
    public void setOperatorRTXC() {
        mutator.setOperator("rtxc");
        assertEquals(mutator.getOperator(), "rtxc");
        assertEquals(mutator.getMutation(), "");
        assertTrue(mutator.getRtxcMethods().contains(mutator.getMethod()));
    }

    @org.junit.Test
    public void setOperatorRCXC() {
        mutator.setOperator("rcxc");
        assertEquals(mutator.getOperator(), "rcxc");
        assertEquals(mutator.getMutation(), "");
        assertTrue(mutator.getRcxcMethods().contains(mutator.getMethod()));
    }

    @org.junit.Test
    public void setOperatorMXT() {
        mutator.setOperator("mxt");
        assertEquals(mutator.getOperator(), "mxt");
        assertEquals(mutator.getMutation(), "*2");
        assertTrue(mutator.getMxtMethods().contains(mutator.getMethod()));
    }

    @org.junit.Test
    public void setOperatorMSP() {
        mutator.setOperator("msp");
        assertEquals(mutator.getOperator(), "msp");
    }

    @org.junit.Test
    public void setOperatorESP() {
        mutator.setOperator("esp");
        assertEquals(mutator.getOperator(), "esp");
    }

    @org.junit.Test
    public void getContent() {
        mutator.setContent("wait");
        assertEquals(mutator.getContent(), "wait");
    }

    @org.junit.Test
    public void getRtxcMethods() {
        ArrayList<String> rtxcList = new ArrayList<String>(Arrays.asList("wait", "join", "sleep", "notify", "notifyAll"));
        assertEquals(mutator.getRtxcMethods(), rtxcList);
    }

    @org.junit.Test
    public void getRcxcMethods() {
        ArrayList<String> rcxcList = new ArrayList<String>(Arrays.asList("lock", "unlock", "signal", "signalAll", "acquire", "release", "countDown", "submit"));
        assertEquals(mutator.getRcxcMethods(), rcxcList);
    }

    @org.junit.Test
    public void getMxtMethods() {
        ArrayList<String> mxtList = new ArrayList<String>(Arrays.asList("wait", "sleep", "join", "await"));
        assertEquals(mutator.getMxtMethods(), mxtList);
    }

    @org.junit.Test
    public void getMspMethods() {
        ArrayList<String> mspList = new ArrayList<String>(Arrays.asList("synchronized"));
        assertEquals(mutator.getMspMethods(), mspList);
    }

    @org.junit.Test
    public void getEspMethods() {
        ArrayList<String> espList = new ArrayList<String>(Arrays.asList("synchronized"));
        assertEquals(mutator.getEspMethods(), espList);
    }

    @org.junit.Test
    public void getOperatorList() {
        ArrayList<String> operatorList = new ArrayList<String>(Arrays.asList("rtxc", "rcxc", "mxt", "msp", "esp"));
        assertEquals(mutator.getOperatorList(), operatorList);
    }
}