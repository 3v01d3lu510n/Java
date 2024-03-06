package j1.s.p0011;
import java.util.*;
/**
 *
 * @author VPC
 */
public class Validate {
    public static int validInput(String s){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(s);
            try{
                String input=sc.nextLine();
                int k =Integer.parseInt(input);
                if(k==2||k==10||k==16){
                    return k;
                }else{
                    System.out.println("Entered must be 2, 10 or 16!");
                }
            }
            catch(NumberFormatException e){
                System.out.println("Entered must be number in range 2, 10 or 16!");
            }
        }
    }
    
    public static String validValue(String s, int inbase){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(s);
            String input = sc.nextLine();
            switch(inbase){
                case 2:
                    if(input.matches("[0-1]+")){
                        return input;
                    }
                    else{
                        System.out.println("Entered must be binary format!");
                    }
                    break;
                case 10:
                    if(input.matches("[0-9]+")){
                        return input;
                    }
                    else{
                        System.out.println("Entered must be decimal format!");
                    }
                    break;
                case 16:
                    if(input.matches("[0-9A-Fa-f]+")){
                        return input;
                    }
                    else{
                        System.out.println("Entered must be hex format!");
                    }
                    break;
            
        }
        }
    }
}
