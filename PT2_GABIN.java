import java.util.Scanner;

public class PT2_GABIN {
    static int[] arr = new int[100]; 
    static int a = 0; 

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Enter choice: 1.create 2.search 3.exit");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter item to insert");
                    int item = s.nextInt();
                    create(item);
                    break;
                case 2:
                    System.out.println("Enter item to search");
                    item = s.nextInt();
                    int pos = search(item);
                    if (pos == -1) {
                        System.out.println(item + " not found in the list");
                    } else {
                        System.out.println(item + " found at position " + pos);
                    }
                    break;
                case 3:
                    s.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    
    static void create(int item) {
        if (a >= arr.length) {
            System.out.println("Overflow");
            return;
        }
        arr[a++] = item;
        System.out.println(item + " inserted into the list");
    }

   
    static int search(int itm) {
        if (a == 0) {
            System.out.println("Underflow");
            return -1;
        }
        for (int i = 0; i < a; i++) {
            if (arr[i] == itm) {
                return i;
            }
        }
        return 0;
    }
}
