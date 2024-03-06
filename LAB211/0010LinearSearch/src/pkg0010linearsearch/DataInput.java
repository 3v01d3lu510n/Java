package pkg0010linearsearch;
import java.util.Scanner;
public class DataInput {

    Scanner sc = new Scanner(System.in);

    public int checkInt(String mess, int min, int max) {

        while (true) {
            System.out.print(mess);
            String raw = sc.nextLine().trim();
            if (!raw.isEmpty()) {
                try {
                    int num = Integer.parseInt(raw);
                    if (num >= min && num <= max) {
                        return num;
                    } else {
                        System.err.println("You must enter in range [" + min + " - "
                                + max + "]");
                    }
                } catch (NumberFormatException e) {
                    System.err.println("You must enter an integer ");
                }
            } else {
                System.err.println("Empty! ");
            }
        }

    }

    
}
