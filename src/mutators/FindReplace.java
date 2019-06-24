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

public class FindReplace {
    private String mutation;
    private String method;
    private String operator;
    private Charset charset;
    private String content;
    private ArrayList<String> rtxcMethods;
    private ArrayList<String> rcxcMethods;
    private ArrayList<String> mxtMethods;
    private ArrayList<String> mspMethods;
    private ArrayList<String> espMethods;
    private ArrayList<String> operatorList;



    public FindReplace(String file) throws IOException{
         operatorList = new ArrayList<String>(Arrays.asList("rtxc", "rcxc", "mxt", "msp", "esp"));
         rtxcMethods = new ArrayList<String>(Arrays.asList("wait", "join", "sleep", "notify", "notifyAll"));
         rcxcMethods = new ArrayList<String>(Arrays.asList("lock", "unlock", "signal", "signalAll", "acquire", "release", "countDown", "submit"));
         mxtMethods = new ArrayList<String>(Arrays.asList("wait", "sleep", "join", "await"));
         mspMethods = new ArrayList<String>(Arrays.asList("synchronized"));
         espMethods = new ArrayList<String>(Arrays.asList("synchronized"));
         method = null;
         mutation = null;
         operator = null;
         File inputFile = new File(file);
         charset = StandardCharsets.UTF_8;
         Path path = Paths.get(inputFile.getAbsolutePath());
         content = new String(Files.readAllBytes(path), charset);
    }

    public String getMutation() {
        return mutation;
    }

    public void setMutation(String r) {
        mutation = r;
    }

    public void setMethod(ArrayList<String> methodList) {
        method = methodList.get(new Random().nextInt(methodList.size()));
    }

    public void setMethod(ArrayList<String> methodList, String method) {
        if(methodList.contains(method)) {
            this.method = method;
        } else {
            throw new IllegalArgumentException("Method not found");
        }
    }

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

    public void setOperator(String operator, String method) {
        setMethod(setOperator(operator), method);
    }

    public String getOperator() {
        return operator;
    }

    public void replaceMutation() throws IOException {
        String regex = "(" + method + "\\(\\w*/)(\\)\\;)"; //"(wait\\(\\w*/)(\\)\\;)"; //
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(content);
        System.out.println("no match");

        while(m.find()) {
            System.out.println("match");
            String replacement;
            if(!mutation.equals("")) {
                replacement = m.group(1) + mutation + m.group(2); //"wait(" + m.group(1) + replacement;
                System.out.println("Here");
            } else {
                replacement = mutation;
                System.out.println("Here lo");
            }
            content = content.replaceFirst(regex, replacement);
        }
        System.out.println("Operator: " + operator +
                            "\nMutation: " + mutation +
                            "\nMethod: " + method +
                            "\nRegex: " + regex +
                            "\nContent: " + content);
        writeToFile();

    }

    public void writeToFile() throws IOException{
        String resultFile = "H:\\My Documents\\Dissertation\\results.txt"; //"C:\\Users\\headl\\OneDrive\\Documents\\Uni\\Dissertation\\results.txt"
        Path resultsPath = Paths.get(resultFile);
        Files.write(resultsPath, content.getBytes(charset));
        Runtime.getRuntime().exec(new String[] {"cmd.exe", "/C", resultFile});
    }




}
