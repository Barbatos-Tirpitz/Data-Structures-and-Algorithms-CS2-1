import java.util.Scanner;

public class OE4_GABIN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Calculate factorial");
        System.out.println("2. Generate Fibonacci series");
        System.out.println("3. Reverse a number");
        System.out.println("4. Reverse a word");
        

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter an integer to calculate its factorial: ");
                int num = scanner.nextInt();
                System.out.println("Factorial of " + num + " is " + factorial(num));
                break;
            case 2:
                System.out.println("Enter the number of terms you want in the Fibonacci series: ");
                int Fibocchi = scanner.nextInt();
                System.out.println("Fibonacci series of " + Fibocchi + " terms:");
                for (int i = 0; i < Fibocchi; i++) {
                    System.out.print(fibonacci(i) + " ");
                }
                break;
            case 3:
                System.out.println("Enter a number to reverse: ");
                int number = scanner.nextInt();
                System.out.println("Reverse of " + number + " is " + reverseNumber(number));
                break;
            case 4:
                System.out.println("Enter a word to reverse: ");
                String RWord = scanner.next();
                System.out.println("Reverse of " + RWord + " is " + reverseWord(RWord));
                break;

            default:
                System.out.println("Invalid option!");
        }
        scanner.close();
    }

    //  factorial of a number
    public static int factorial(int FactNum) {
        if (FactNum == 0) {
            return 1;
        } else {
            return FactNum * factorial(FactNum - 1);
        }
    }

    //  Fibonacci series
    public static int fibonacci(int Bocchinum) {
        if (Bocchinum == 0 || Bocchinum == 1) {
            return Bocchinum;
        } else {
            return fibonacci(Bocchinum - 1) + fibonacci(Bocchinum - 2);
        }
    }

    // reverse a number
    public static int reverseNumber(int ReverseNum) {
        if (ReverseNum < 10) {
            return ReverseNum;
        } else {
            int LD = ReverseNum % 10;
            int RD = ReverseNum / 10;
            return (int) (LD * Math.pow(10, String.valueOf(RD).length())) + reverseNumber(RD);
        }
    }

    //  reverse a word
    public static String reverseWord(String RWord) {
        if (RWord.isEmpty()) {
            return RWord;
        } else {
            return reverseWord(RWord.substring(1)) + RWord.charAt(0);
        }
    }
}
    