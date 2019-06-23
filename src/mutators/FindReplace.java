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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindReplace {
    private ArrayList<String> methods;
    private String mutator;
    private String output;
    private File inputFile;
    private Charset charset;
    private String content;


    public FindReplace(String file) throws IOException{
         methods = new ArrayList<String>(Arrays.asList("wait", "sleep", "join", "await", "lock", "unlock", "signal",
                                                        "signalAll", "acquire", "release", "countDown", "submit"));
         mutator = ""; // Default replacement is a removal
         output = "";
         inputFile = new File(file);
         charset = StandardCharsets.UTF_8;
         Path path = Paths.get(inputFile.getAbsolutePath());
         content = new String(Files.readAllBytes(path), charset);


    }

    public String getMutator() {
        return mutator;
    }

    public void setMutator(String r) {
        mutator = r;
    }

    public ArrayList<String> getMethods() {
        return methods;
    }

    public void setInputFile(String filename) {
        inputFile = new File(filename);
    }

    public void addMethod(String m) {
        methods.add(m);
    }


    public void rep() throws IOException {
        String regex = "(wait\\(\\w+)(\\)\\;)";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(content);

        while(m.find()) {
            String replacement;
            if(mutator != "") {
                replacement = m.group(1) + mutator + m.group(2); //"wait(" + m.group(1) + replacement;
            } else {
                replacement = mutator;
            }
            content = content.replaceFirst(regex, replacement);
        }

        writeToFile();

    }

    public void writeToFile() throws IOException{
        String resultFile = "H:\\My Documents\\Dissertation\\results.txt"; //"C:\\Users\\headl\\OneDrive\\Documents\\Uni\\Dissertation\\results.txt"
        Path resultsPath = Paths.get(resultFile);
        Files.write(resultsPath, content.getBytes(charset));
        Runtime.getRuntime().exec(new String[] {"cmd.exe", "/C", resultFile});
    }




}
