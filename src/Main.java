
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        calc(getAmount()); // call the "calc" function with the function "getAmount" as the input

    }

    // Fill and print the array & use the amount of numbers supposed to be in the array
    public static void calc(int amount){

        int[] numbers = new int[amount];
        int n = 0;
        int i = 2;

        System.out.println("\nHere are your " + amount + " numbers: \n"  );

        while (numbers[amount-1] == 0){
            int num = 0;
            for (int k = 1; k < i; k++) {
                if (i % k == 0) {
                    num = num + k;
                }
                if (i - 1 == k) {
                    if (num == i) {
                        System.out.println(num);
                        numbers[n] = num;
                        n++;
                    }
                }
            }
            i++;
        }
        System.out.println("\nFinal array: " + Arrays.toString(numbers));
    }

    // Get the amount of numbers in the array
    private static int getAmount(){

        System.out.println("How many perfect numbers do you want?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
