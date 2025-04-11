import java.util.*;

class Main {
    public static class Node {
        char value;
        Node left;
        Node right;

        public Node(char value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Character, Node> tree = new HashMap<>();
        for (int i = 0; i < N; i++) {
            char root = sc.next().charAt(0);
            char left = sc.next().charAt(0);
            char right = sc.next().charAt(0);

            tree.putIfAbsent(root, new Node(root));
            Node node = tree.get(root);
            if (left != '.') {
                node.left = new Node(left);
                tree.put(left, node.left);
            }
            if (right != '.') {
                node.right = new Node(right);
                tree.put(right, node.right);
            }
        }
        Node root = tree.get('A');
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        preOrder(root, sb1);
        inOrder(root, sb2);
        postOrder(root, sb3);

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
    }
    public static void preOrder(Node node, StringBuilder sb) {
        if (node == null) {
            return;
        }
        sb.append(node.value);
        preOrder(node.left, sb);
        preOrder(node.right, sb);
    }
    public static void inOrder(Node node, StringBuilder sb) {
        if (node == null) {
            return;
        }
        inOrder(node.left, sb);
        sb.append(node.value);
        inOrder(node.right, sb);
    }
    public static void postOrder(Node node, StringBuilder sb) {
        if (node == null) {
            return;
        }
        postOrder(node.left, sb);
        postOrder(node.right, sb);
        sb.append(node.value);
    }
}
