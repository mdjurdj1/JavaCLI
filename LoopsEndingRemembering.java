import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int num = Integer.parseInt(reader.nextLine());
        int sum = num;
        int counter = 1;
        int evens = 0;
        int odds = 0;
        
        if (num % 2 == 0) {
            evens++;
        } else {
            odds++;
        }
        
        while(num != -1) {
           num = Integer.parseInt(reader.nextLine());
           if (num != -1) {
            sum += num;
            counter++;
            if (num % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
           }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is: " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + (double)sum/counter);
        System.out.println("Even numbers: " + evens);
        System.out.println("Odd numbers: " + odds);
    }
}
