package mutators;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mutator {
    private String mutation;
    private String method;
    private String operator;
    private String content;
    private final Charset charset;
    private final File inputFile;
    private final ArrayList<String> rtxcMethods;
    private final ArrayList<String> rcxcMethods;
    private final ArrayList<String> mxtMethods;
    private final ArrayList<String> mspMethods;
    private final ArrayList<String> espMethods;
    private final ArrayList<String> operatorList;

    /**
     * Constructor for Mutator class
     *
     * @param file
     * @throws IOException
     */
    public Mutator(String file) throws IOException{
         operatorList = new ArrayList<String>(Arrays.asList("rtxc", "rcxc", "mxt", "msp", "esp"));
         rtxcMethods = new ArrayList<String>(Arrays.asList("wait", "join", "sleep", "notify", "notifyAll"));
         rcxcMethods = new ArrayList<String>(Arrays.asList("lock", "unlock", "signal", "signalAll", "acquire", "release", "countDown", "submit"));
         mxtMethods = new ArrayList<String>(Arrays.asList("wait", "sleep", "join", "await"));
         mspMethods = new ArrayList<String>(Arrays.asList("synchronized"));
         espMethods = new ArrayList<String>(Arrays.asList("synchronized"));
         method = null;
         mutation = null;
         operator = null;
         inputFile = new File(file);
         charset = StandardCharsets.UTF_8;
         Path path = Paths.get(inputFile.getAbsolutePath());
         content = new String(Files.readAllBytes(path), charset);
    }

    /**
     * Performs a find-and-replace mutation for RTXC, RCXC and MXT operators
     *
     * @throws IOException
     */
    public void replaceMutation() throws IOException {
        String regex = "(\\s\\w*.?" + method + "\\(\\w*)(\\)\\;)"; //"(wait\\(\\w*/)(\\)\\;)"; //
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(content);

        boolean found = false;
        int count = countMethodInstances(m);
        int start = 0;
        while(m.find(start) && found == false) {
            String unmatchedContent = content.substring(0, start);
            String matched = content.substring(start, content.length());

            if(count-1 == new Random().nextInt(count)) {
                System.out.println("Mutation at: " + m.toMatchResult().start() + ":" + m.toMatchResult().end());

                String replacement;
                if (!mutation.equals("")) {
                    replacement = m.group(1) + mutation + m.group(2) + "//" + method + " was mutated";
                } else {
                    replacement = mutation + " //" + method + " was removed";
                }

                matched = matched.replaceFirst(regex, replacement);
                content = unmatchedContent + matched;
                found = true;
            }

            count--;
            start = m.end();
        }

        if(found = true) {
            writeToFile();
        }
    }

    public int countMethodInstances(Matcher m) {
        int count = 0;
        int start = 0;
        while(m.find(start)) {
            count++;
            System.out.println("Match #" + count + ": " + m.toMatchResult().start() + ":" + m.toMatchResult().end());
            start = m.end();
        }

        System.out.println("Matches found: " + count);
        return count;
    }

    /**
     * Writes the results of a mutation to a file with a unique and descriptive name
     *
     * @throws IOException
     */
    public void writeToFile() throws IOException{

        String filename = "H:\\My Documents\\Dissertation\\samples\\results\\" + operator.toUpperCase() + method; ////"C:\\Users\\headl\\OneDrive\\Documents\\Uni\\Dissertation\\results.txt"

        String file = filename + inputFile.getName();
        Path path = Paths.get(file);

        int i = 0;
        while(Files.exists(path)) {
            i++;
            file = filename + i + inputFile.getName();
            path = Paths.get(file);
        }

        Files.write(path, content.getBytes(charset));
        Runtime.getRuntime().exec(new String[] {"cmd.exe", "/C", file});
        System.out.println("File saved at: " + file);
    }

    /**
     * Prints the values of operator, mutation, method and content
     */
    public void printState() {
        System.out.println("Operator: " + operator +
                "\nMutation: " + mutation +
                "\nMethod: " + method +
                "\nContent: " + content);
    }

    /**
     * Gets muation
     *
     * @return value of mutation
     */
    public String getMutation() {
        return mutation;
    }

    /**
     * Sets mutation
     *
     * @param mutation
     */
    public void setMutation(String mutation) {
        this.mutation = mutation;
    }

    /**
     * Gets method
     *
     * @return value of method
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets method at random
     *
     * @param methodList
     */
    public void setMethod(ArrayList<String> methodList) {
        method = methodList.get(new Random().nextInt(methodList.size()));
    }

    /**
     * Sets method
     *
     * @param methodList
     * @param method
     */
    public void setMethod(ArrayList<String> methodList, String method) {
        if(methodList.contains(method)) {
            this.method = method;
        } else {
            throw new IllegalArgumentException("Method not found");
        }
    }

    /**
     * Sets operator
     *
     * @param operator
     */
    public ArrayList<String> setOperator(String operator) {
        if(operatorList.contains(operator)) {
            this.operator = operator;

            if(operator.equals("rtxc")){
                mutation = "";
                setMethod(rtxcMethods);
                return rtxcMethods;
            } else if(operator.equals("rcxc")) {
                mutation = "";
                setMethod(rcxcMethods);
                return rcxcMethods;
            } else if(operator.equals("mxt")) {
                mutation = "*2";
                setMethod(mxtMethods);
                return mxtMethods;
            } else if(operator.equals("msp")) {
                setMethod(mspMethods);
                return mspMethods;
            } else if(operator.equals("esp")) {
                setMethod(espMethods);
                return espMethods;
            }

        } else {
            throw new IllegalArgumentException("Operator not found");
        }

        return null;
    }

    /**
     * Sets operator
     *
     * @param operator
     * @param method
     */
    public void setOperator(String operator, String method) {
        setMethod(setOperator(operator), method);
    }

    /**
     * Gets operator
     *
     * @return value of operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Gets content
     *
     * @return value of content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets content
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Gets rtxcMethods
     *
     * @return value of rtxcMethods
     */
    public ArrayList<String> getRtxcMethods() {
        return rtxcMethods;
    }

    /**
     * Gets rcxcMethods
     *
     * @return value of rcxcMethods
     */
    public ArrayList<String> getRcxcMethods() {
        return rcxcMethods;
    }

    /**
     * Gets mxtMethods
     *
     * @return value of mxtMethods
     */
    public ArrayList<String> getMxtMethods() {
        return mxtMethods;
    }

    /**
     * Gets mspMethods
     *
     * @return value of mspMethods
     */
    public ArrayList<String> getMspMethods() {
        return mspMethods;
    }

    /**
     * Gets espMethods
     *
     * @return value of espMethods
     */
    public ArrayList<String> getEspMethods() {
        return espMethods;
    }

    /**
     * Gets operatorList
     *
     * @return value of operatorList
     */
    public ArrayList<String> getOperatorList() {
        return operatorList;
    }




}
