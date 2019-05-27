package mutators;

import java.io.FileNotFoundException;
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
    private File inputFile;

    public FindReplace() {
         methods = new ArrayList<>();
         replacement = ""; // Default replacement is a removal
         inputFile = null;

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

    public void replace() throws FileNotFoundException {
        for(int x=0; x<methods.size(); x++) {
            String regex = methods.get(x) + "\\((\\w+)\\)";
            Pattern p = Pattern.compile(regex);

            Scanner in = new Scanner(inputFile);
            int line = Integer.parseInt((in.nextLine()));

                Matcher m = p.matcher(input);

                while(m.find()) {
                    String replace = m.group(1) + replacement;
                    input = input.replaceAll(m.group(1), replace);
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


        }
    }


}
