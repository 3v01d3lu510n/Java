package j1.s.p0011;

/**
 *
 * @author VPC
 */
public class J1SP0011 {

    
    public static void main(String[] args) {
        int inbase = Validate.validInput("Please choose the base number input: ");
        int outbase = Validate.validInput("Please choose the base number output: ");
        String input = Validate.validValue("Enter the input: ",inbase);
        String output = Convert.ChangeBaseNumber(input, inbase, outbase);
        System.out.println("The number after convert:");
        System.out.println(output);
    }
    
}
