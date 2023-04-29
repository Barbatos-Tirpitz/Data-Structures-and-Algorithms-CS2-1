import java.util.Scanner;

public class pt5 {
    public static void main(String[] args) {
        BiNaPuno tree = new BiNaPuno();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the tree: ");
        int n = scanner.nextInt();

        System.out.print("Enter the values of the elements: ");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            tree.gohere(value);
        }

        System.out.println("Which traversal would you like to perform? \n1 for in-order\n2 for pre-order\n3 for post-order:");
        int c = scanner.nextInt();

        switch (c) {
            case 1:
                System.out.print("\nIn-order traversal: ");
                tree.inOT();
                break;
            case 2:
                System.out.print("\nPre-order traversal: ");    
                tree.preOT();
                break;
            case 3:
                System.out.print("\nPost-order traversal: ");
                System.out.print("\n ");
                tree.postOT();
                break;
            default:
                System.out.println("Invalid c");
                break;
        }
        

        scanner.close();
        System.out.println();
    }
}

class Puno {
    int val;
    Puno L;
    Puno R;
    Puno(int x) { val = x; }
}

class BiNaPuno {
    private Puno root;

    public BiNaPuno() {
        root = null;
    }

    public void gohere(int value) {
        root = gohere(root, value);
    }

    private Puno gohere(Puno node, int value) {
        if (node == null) {
            node = new Puno(value);
        } else if (value < node.val) {
            node.L = gohere(node.L, value);
        } else if (value > node.val) {
            node.R = gohere(node.R, value);
        }
        return node;
    }

    public void inOT() {
        inOT(root);
    }

    private void inOT(Puno node) {
        if (node != null) {
            inOT(node.L);
            System.out.print(node.val + " ");
            inOT(node.R);
        }
    }

    public void preOT() {
        preOT(root);
    }

    private void preOT(Puno node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preOT(node.L);
            preOT(node.R);
        }
    }

    public void postOT() {
        postOT(root);
    }

    private void postOT(Puno node) {
        if (node != null) {
            postOT(node.L);
            postOT(node.R);
            System.out.print(node.val + " ");
        }
    }
}
