import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceJava {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = args[0];
        File file = new File("./" + filename);
        File file2 = new File("./" + filename.replace(".txt", "") + "toHTML.txt");

        Scanner input = new Scanner(file);
        PrintWriter writer = new PrintWriter(file2);
        while(input.hasNextLine()) {
            String line = input.nextLine();
            String replace = line.replace("Java", "HTML");
            writer.print(replace + "\n");
        }
        writer.close();
        input.close();
    }
}
