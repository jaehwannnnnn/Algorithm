import java.io.*;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            leftStack.push(word.charAt(i));
        }

        int count = Integer.parseInt(br.readLine());
        while (count-- > 0) {
            String command = br.readLine();
            char operation = command.charAt(0);
            
            if (operation == 'P') {
                leftStack.push(command.charAt(2));
            } else if (operation == 'L') {
                if (!leftStack.isEmpty()) {
                    rightStack.push(leftStack.pop());
                }
            } else if (operation == 'D') {
                if (!rightStack.isEmpty()) {
                    leftStack.push(rightStack.pop());
                }
            } else if (operation == 'B') {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                }
            }
        }

        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }

        while (!rightStack.isEmpty()) {
            bw.write(rightStack.pop());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
