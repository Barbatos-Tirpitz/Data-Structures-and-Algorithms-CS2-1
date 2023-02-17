import java.util.Scanner;

public class PT1QUEUEandSTACK {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

  System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] stack = new int[n];
        int[] queue = new int[n];
        int top = -1;
        int front = 0;
        int rear = -1;

  System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            int element = input.nextInt();
            top++;
            stack[top] = element;
            rear++;
            queue[rear] = element;
        }

        System.out.println("Elements in Stack:");
        while (top >= 0) {
            System.out.print(stack[top] + " ");
            top--;
        }

        System.out.println("\nElements in Queue:");
        while (front <= rear) {
            System.out.print(queue[front] + " ");
            front++;
        }

        input.close();
    }
}
