package pkg0010linearsearch;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        LinearSearch li = new LinearSearch();
        DataInput d = new DataInput();
        int size = d.checkInt("input size:", 0, Integer.MAX_VALUE);
        int[] array = new int[size];
        int value = d.checkInt("Input value: ", 0, Integer.MAX_VALUE);
        li.rvalue(array, size);
        int result = li.Search(array, value);
        if (result == -1) {
            System.err.println("Not found");
        } else {
            System.out.println("Found " + value + " at index: " + result);

        }
    }
    
}