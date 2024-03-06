package j1.s.p0008;
import java.util.*;
/**
 *
 * @author VPC
 */
public class Validate {
private static final Scanner sc = new Scanner(System.in);
public static String checkString (String message) {
System.out.print (message);
String inputString = "";
while (true) {
inputString = sc.nextLine();
if (!inputString.isEmpty()) {
return inputString;
}
System.err.println("Please enter a string!");
}
}
}
