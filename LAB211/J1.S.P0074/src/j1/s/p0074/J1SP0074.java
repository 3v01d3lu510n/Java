package j1.s.p0074;
import java.util.*;
import java.math.*;
import java.*;
/**
 *
 * @author VPC
 */
public class J1SP0074 {

    static Scanner sc = new Scanner(System.in);
    
    static void Menu(){
        System.out.println("=======Calculator program======");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
        System.out.println("Your choice:");    
    }
    
    public static int checkInt(){
        while(true){
            try{
                String x;
                x=sc.nextLine().trim();
                int y= Integer.parseInt(x);
                return y;    
            }catch(NumberFormatException e){
                System.out.println("Re-Entered: ");
            }
        }
    }
    
    public static int checkRC(){
        while(true){
            try{
               String x;
                x=sc.nextLine().trim();
                int y= Integer.parseInt(x);
                if(y<=0){
                    System.out.println("Re-Entered");
                }
                else{
                return y;
                }    
            }catch(NumberFormatException e){
                System.out.println("Re-Entered: ");
            }
        }
    }
    
    public static void Display(int a[][]){
        for(int [] a1: a){
            for(int i = 0; i < a1.length; i++) {
                System.out.print("["+a1[i]+"]");  
            }
            System.out.println("");
        }
    }
    
    public static int[][] Entered(String ms){
    int r1, c1;
    System.out.println("Entered Row Matrix " +ms+ ": ");
    r1=checkRC();
    System.out.println("Entered Column Matrix " +ms+ ":");
    c1=checkRC();
    int[][]a=new int[r1][c1];
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            System.out.println("Entered Matrix["+(i+1)+"]["+(j+1)+"] :");
            a[i][j]=checkInt();
        }
    }
    return a;
    }
    
    public static int[][] Add(int a[][],int b[][]){
        int[][] v= new int[a.length][b.length];
        for(int i=0; i<a.length;i++){
            for(int j=0; j<b.length;j++){
                v[i][j]=a[i][j]+b[i][j];
            }
        }
        return v;
    }
    
    public static int[][] Sub(int a[][],int b[][]){
        int[][] v= new int[a.length][b.length];
        for(int i=0; i<a.length;i++){
            for(int j=0; j<b.length;j++){
                v[i][j]=a[i][j]-b[i][j];
            }
        }
        return v;
    }
    
     public static int[][] Multiple(int a[][],int b[][]){
        int[][] c= new int[a.length][b[0].length];
        for(int i=0; i<a.length;i++){
            for(int j=0; j<b[0].length;j++){
                int k=0;
                while(k<b.length){
                c[i][j]+=a[i][k]*b[k][j];
                k++;
                }
            }
        }
        return c;
    }
    
    public static void main(String[] args) {
        int[][] a=null, b=null;
        
        while(true){
            Menu();
            int m=checkInt();
            switch(m){
                case 1: a= Entered("a");
                        b= Entered("b");
                        if(a[0].length!=b[0].length || a.length!=b.length){
                            System.out.println("Wrong! The matrixs don't have same size.");
                        }
                        else{
                            System.out.println("--------Result-------- ");
                            Display(a);
                            System.out.println("+");
                            Display(b);
                            System.out.println("=");
                            Display(Add(a,b));
                        }
                        break;
                        
                case 2: a= Entered("1");
                        b= Entered("2");
                        if(a[0].length!=b[0].length || a.length!=b.length){
                            System.out.println("Wrong! The matrixs don't have same size.");
                        }
                        else{
                            System.out.println("--------Result-------- ");
                            Display(a);
                            System.out.println("-");
                            Display(b);
                            System.out.println("=");
                            Display(Sub(a,b));
                        }
                        break;
                
                case 3: a= Entered("1");
                        b= Entered("2");
                        if(a[0].length!=b.length){
                            System.out.println("Wrong! The matrix 1 s'column must equal the matrix 2 s'row.");
                        }
                        else{
                            System.out.println("--------Result-------- ");
                            Display(a);
                            System.out.println("*");
                            Display(b);
                            System.out.println("=");
                            Display(Multiple(a,b));
                        }
                        break;
                        
                case 4:
                    System.out.println("Quit!");
                    return;
            }
        }
    }
    
}
