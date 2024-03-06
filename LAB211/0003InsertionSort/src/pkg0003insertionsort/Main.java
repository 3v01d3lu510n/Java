package pkg0003insertionsort;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.in;
public class Main {

    public static void main(String[] args) {
    int input = checkInput("Enter number of array");
        int[] arr;
        arr = generateArray(input);
        display(arr, "Unsorted array: ");
        arr = insertionSort(arr);
        display(arr, "Sorted array: ");
    }

    

    static int checkInput(String s) {
        while(true){
           System.out.println(s);
            Scanner sc = new Scanner(System.in);
            try {
                String in = sc.nextLine();
                int result = Integer.parseInt(in.trim());
                if (result > 1) {
                        return result;
                    } else {
                        System.err.println("You must enter in range 1");
                    }
            } catch (NumberFormatException e) {
                System.err.println("Please input number");
                System.out.print("Enter again: ");
            } 
        }
    }

    static int[] generateArray(int input) {
        int[] array = new int[input];
        for (int i = 0; i < input; i++) {
            array[i] = new Random().nextInt(input);
        }
        return array;
    }
    
    static int[] insertionSort(int array[]) {
        int key;
        int i;
        // Compare key with each element on the left of it until an element smaller than
        // So sánh khóa với từng phần tử ở bên trái của nó cho đến khi một phần tử nhỏ hơn
        // it is found.
        //Nó được tìm thấy.
        // For descending order, change key<array[i] to key>array[i].
        // Đối với thứ tự giảm dần, đổi phím <array [i] thành key> array [i].
        for (int j = 1; j < array.length; j++) {
            key = array[j];
            i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            // Place key at after the element just smaller than it.
            // Đặt khóa sau phần tử nhỏ hơn nó.
            array[i + 1] = key;
        }
        return array;
    }

    static void display(int[] arr, String s) {
        System.out.print(s);
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }

    
}
    

