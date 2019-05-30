package mutators;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.io.File;

/**
 * public static void main(String[] args) {
 *
 *         String regex = "\\b(\\w+)(\\W\\1\\b)+";
 *         Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
 *
 *         Scanner in = new Scanner(System.in);
 *         int numSentences = Integer.parseInt(in.nextLine());
 *
 *         while (numSentences-- > 0) {
 *             String input = in.nextLine();
 *
 *             Matcher m = p.matcher(input);
 *
 *             // Check for subsequences of input that match the compiled pattern
 *             while (m.find()) {
 *                 input = input.replaceAll(m.group(), m.group(1));
 *             }
 *
 *             // Prints the modified sentence.
 *             System.out.println(input);
 *         }
 *
 *         in.close();
 *     }
 * }
 */

public class FindReplace {
    private ArrayList<String> methods;
    private String replacement;
    private String output;
    private File inputFile;


    public FindReplace() {
         methods = new ArrayList<>();
         replacement = ""; // Default replacement is a removal
         output = "";
         inputFile = null;
         Charset charset = StandardCharsets.UTF_8;


    }

    public String getReplacement() {
        return replacement;
    }

    public void setReplacement(String r) {
        replacement = r;
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

    public void replace() throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        for(int x=0; x<methods.size(); x++) {
            String regex = "(" + methods.get(x) + "\\((\\w+))\\)";
            Pattern p = Pattern.compile(regex);

            Scanner in = new Scanner(inputFile);
            int line = Integer.parseInt((in.nextLine()));

            while(line-- > 0) {
                String input = in.nextLine();
                Matcher m = p.matcher(input);

                while(m.find()) {
                    String replace = m.group(1) + replacement;
                    input = input.replaceAll(m.group(1), replace);
                    output += "\n" + input;
                }

            /**
             * Path path = Paths.get("test.txt");
             * Charset charset = StandardCharsets.UTF_8;
             *
             * String content = new String(Files.readAllBytes(path), charset);
             * content = content.replaceAll("foo", "bar");
             * Files.write(path, content.getBytes(charset));
             */
            }
            String results = "H:\\My Documents\\Dissertation\\results\\test.txt";
            Path resultsPath = Paths.get(results);
            Files.write(resultsPath, output.getBytes(charset));

        }

    }

    public void rep() throws IOException {
        Path path = Paths.get(inputFile.getAbsolutePath());
        Charset charset = StandardCharsets.UTF_8;
        String content = new String(Files.readAllBytes(path), charset);
        StringBuffer sb = new StringBuffer();

        for(int x=0; x<methods.size(); x++) {
            String regex = "(" + methods.get(0) + ")(\\((\\w+)\\)\\;)";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(content);
            System.out.println("for loop " + regex);

            while(m.find()) {
                if(replacement.equals("")) {
                    content = content.replaceAll(m.group(), replacement);
                    System.out.println("while if loop");
                } else {
                    String replace = m.group(1) + "(" + m.group(3) + replacement + ");";
                    //String replace = m.group(3) + replacement;
                    content = content.replaceAll(m.group(), replace);
                    //m.appendReplacement(sb, replace);
                    System.out.println("while else loop " + m.group() + replace);
                }
            }
            //m.appendTail(sb);
        }


        String results = "H:\\My Documents\\Dissertation\\results\\test.txt";
        Path resultsPath = Paths.get(results);
        Files.write(resultsPath, content.getBytes(charset));

    }


}
