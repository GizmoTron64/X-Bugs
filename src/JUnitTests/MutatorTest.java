package JUnitTests;

import mutators.Mutator;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class MutatorTest {
    private Mutator mutator;

    @org.junit.Before
    public void setUp() throws Exception {
        mutator = new Mutator(new File("H:\\My Documents\\Dissertation\\samples\\unitTest.txt"));
    }

    @org.junit.Test
    public void replaceMutationTest() throws IOException{
        mutator.setOperator("rtxc", "wait");
        String regex = "(\\s*\\w*.?" + mutator.getMethod() + "\\(\\w*)(\\)\\;)";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(mutator.getContent());
        assertEquals(mutator.countMethodInstances(m), 3);
        mutator.replaceMutation();
        Path path = Paths.get(mutator.getResultFile().getAbsolutePath());
        mutator.setContent(new String(Files.readAllBytes(path), StandardCharsets.UTF_8));
        m = p.matcher(mutator.getContent());
        assertEquals(mutator.countMethodInstances(m), 2);
    }

    @org.junit.Test
    public void countMethodInstancesTest() {
        mutator.setMethod(mutator.getRtxcMethods(), "wait");
        String regex = "(\\s*\\w*.?" + mutator.getMethod() + "\\(\\w*)(\\)\\;)";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(mutator.getContent());
        assertEquals(mutator.countMethodInstances(m), 3);
    }

    @org.junit.Test
    public void writeToFileTest() throws IOException {
        mutator.setContent("test");
        mutator.setOperator("rtxc", "wait");
        String filename = "H:\\My Documents\\Dissertation\\samples\\results\\" + mutator.getOperator().toUpperCase() + mutator.getMethod(); ////"C:\\Users\\headl\\OneDrive\\Documents\\Uni\\Dissertation\\results.txt"
        String file = filename + mutator.getInputFile().getName();
        Path path = Paths.get(file);
        int i = 0;
        while(Files.exists(path)) {
            i++;
            file = filename + i + mutator.getInputFile().getName();
            path = Paths.get(file);
        }
        assertFalse(Files.exists(path));
        mutator.writeToFile();
        assertTrue(Files.exists(path));
        Charset charset = StandardCharsets.UTF_8;
        String results = new String(Files.readAllBytes(path), charset);
        assertEquals(mutator.getContent(), results);


    }

    @org.junit.Test
    public void getMutationTest() {
        mutator.setMutation("mutate");
        assertEquals(mutator.getMutation(), "mutate");
    }

    @org.junit.Test
    public void getMethodTest() {
        mutator.setOperator("rtxc", "wait");
        assertEquals(mutator.getMethod(), "wait");
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void setOperatorInvalidTest() {
        mutator.setOperator("invalid");
        assertNull(mutator.getOperator());
    }

    @org.junit.Test
    public void setOperatorChosenMethodValidTest() {
        mutator.setOperator("rtxc", "wait");
        assertEquals(mutator.getOperator(), "rtxc");
        assertEquals(mutator.getMutation(), "");
        assertEquals(mutator.getMethod(), "wait");
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void setOperatorChosenMethodInvalidTest() {
        mutator.setOperator("rtxc", "none");
        assertEquals(mutator.getOperator(), "rtxc");
        assertEquals(mutator.getMutation(), "");
        assertTrue(mutator.getRtxcMethods().contains(mutator.getMethod()));
    }

    @org.junit.Test
    public void setOperatorRTXCTest() {
        mutator.setOperator("rtxc");
        assertEquals(mutator.getOperator(), "rtxc");
        assertEquals(mutator.getMutation(), "");
        assertTrue(mutator.getRtxcMethods().contains(mutator.getMethod()));
    }

    @org.junit.Test
    public void setOperatorRCXCTest() {
        mutator.setOperator("rcxc");
        assertEquals(mutator.getOperator(), "rcxc");
        assertEquals(mutator.getMutation(), "");
        assertTrue(mutator.getRcxcMethods().contains(mutator.getMethod()));
    }

    @org.junit.Test
    public void setOperatorMXTTest() {
        mutator.setOperator("mxt");
        assertEquals(mutator.getOperator(), "mxt");
        assertEquals(mutator.getMutation(), "*2");
        assertTrue(mutator.getMxtMethods().contains(mutator.getMethod()));
    }

    @org.junit.Test
    public void setOperatorMSPTest() {
        mutator.setOperator("msp");
        assertEquals(mutator.getOperator(), "msp");
    }

    @org.junit.Test
    public void setOperatorESPTest() {
        mutator.setOperator("esp");
        assertEquals(mutator.getOperator(), "esp");
    }

    @org.junit.Test
    public void getContentTest() {
        mutator.setContent("wait");
        assertEquals(mutator.getContent(), "wait");
    }

    @org.junit.Test
    public void getRtxcMethodsTest() {
        ArrayList<String> rtxcList = new ArrayList<String>(Arrays.asList("wait", "join", "sleep", "notify", "notifyAll"));
        assertEquals(mutator.getRtxcMethods(), rtxcList);
    }

    @org.junit.Test
    public void getRcxcMethodsTest() {
        ArrayList<String> rcxcList = new ArrayList<String>(Arrays.asList("lock", "unlock", "signal", "signalAll", "acquire", "release", "countDown", "submit"));
        assertEquals(mutator.getRcxcMethods(), rcxcList);
    }

    @org.junit.Test
    public void getMxtMethodsTest() {
        ArrayList<String> mxtList = new ArrayList<String>(Arrays.asList("wait", "sleep", "join", "await"));
        assertEquals(mutator.getMxtMethods(), mxtList);
    }

    @org.junit.Test
    public void getMspMethodsTest() {
        ArrayList<String> mspList = new ArrayList<String>(Arrays.asList("synchronized"));
        assertEquals(mutator.getMspMethods(), mspList);
    }

    @org.junit.Test
    public void getEspMethodsTest() {
        ArrayList<String> espList = new ArrayList<String>(Arrays.asList("synchronized"));
        assertEquals(mutator.getEspMethods(), espList);
    }

    @org.junit.Test
    public void getOperatorListTest() {
        ArrayList<String> operatorList = new ArrayList<String>(Arrays.asList("rtxc", "rcxc", "mxt", "msp", "esp"));
        assertEquals(mutator.getOperatorList(), operatorList);
    }
}