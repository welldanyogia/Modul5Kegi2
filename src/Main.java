import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        System.out.print("Masukkan kombinasi (pisahkan dengan spasi): ");
        String input = scanner.nextLine();

        String[] data = input.split(" ");
        for (String item : data) {
            tree.insert(item);
        }

        System.out.println("\nBinary Tree:");
        System.out.println("Preorder Traversal: ");
        tree.preOrderTraversal();

        System.out.println("\n\nInorder Traversal: ");
        tree.inOrderTraversal();

        System.out.println("\n\nPostorder Traversal: ");
        tree.postOrderTraversal();
    }
}