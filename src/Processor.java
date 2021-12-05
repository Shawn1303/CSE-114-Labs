import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) throws FileNotFoundException {
        int numScores = 0;
        int total = 0;
        String filename = args[0];
        File file = new File("./" + filename);
        Scanner input = new Scanner(file);
        while(input.hasNextLine() && input.hasNextInt()) {
            int num = input.nextInt();
            total += num;
            numScores++;
        }
        System.out.println("Total: " + total);
        System.out.println("Average: " + total*1.0/numScores);
    }
}
