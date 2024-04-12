

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());  // 첫 번째 줄에서 입력된 숫자를 읽고 정수로 변환
        String[] strings = new String[count];        // 입력된 숫자만큼 문자열 배열을 생성

        for (int i = 0; i < count; i++) {
            strings[i] = br.readLine();  // 각 줄을 읽어 문자열 배열에 저장
        }
        String[] answer = new String[count];

        for (int i = 0; i < strings.length; i++) {
            StringBuilder sb = new StringBuilder();
            Stack<String> stack = new Stack<>();
            Stack<String> stack2 = new Stack<>();
            for (int k = 0; k < strings[i].length(); k++) {
                 if(strings[i].charAt(k) == '<'){
                    if (!stack.isEmpty()) {
                        stack2.push(stack.pop());
//                        System.out.println("임시 스택에 푸시 " + stack2.peek());
                    }

                }else if(strings[i].charAt(k) == '>'){
                    if (!stack2.isEmpty()) {
                        stack.push(stack2.pop());
//                        System.out.println("스택에 푸시 "+stack.peek());
                    }
                 } else if (strings[i].charAt(k) == '-') {
                     if (!stack.isEmpty()) {
                         stack.pop();
                         //System.out.println("팝 "+stack.peek());
                     }
                 } else {
                     stack.push(String.valueOf(strings[i].charAt(k)));
                     //System.out.println("스택에 푸시 "+stack.peek());
                 }
            }
           while(!stack2.isEmpty()) {
                stack.push(stack2.pop());
            }
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            answer[i] = sb.reverse().toString();
        }
        for (String string : answer) {
            System.out.println(string);
        }
    }
}
