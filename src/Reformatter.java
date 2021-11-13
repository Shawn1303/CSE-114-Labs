import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Reformatter {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = args[0];
        File file = new File("./" + filename);
        Scanner input = new Scanner(file);
        File file2 = new File(",/" + filename.replace(".java", "") + "2.java");
        PrintWriter writer = new PrintWriter(file2);
        String prevLine = "";
        boolean writePrev = false;

        while(input.hasNextLine()) {
            if(writePrev) writer.write(prevLine);
            String line = input.nextLine();
            if(line.matches("[ \t]*\\{")) {
                writer.write( " {\n");
            } else {
                if(writePrev) writer.write("\n");
                prevLine = line;
            }
            writePrev = true;
        }
        writer.write(prevLine);
        writer.close();
        input.close();

        writer = new PrintWriter(file);
        input = new Scanner(file2);
        while(input.hasNextLine()) {
            writer.write(input.nextLine());
            writer.write("\n");
        }

        writer.close();
        input.close();
        file2.delete();
    }
}
