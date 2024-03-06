package j1.s.p0008;

/**
 *
 * @author VPC
 */
public class J1SP0008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = Validate.checkString("Enter your content: ");
        Function counter = new Function();
        String c = s.toLowerCase();
        System.out.println(counter.wordCount(c));
        System.out.println(counter.charCount(c));
    }
    
}
