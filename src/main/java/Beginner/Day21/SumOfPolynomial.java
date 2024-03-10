package Beginner.Day21;

public class SumOfPolynomial {
    class Solution {
        public String solution(String polynomial) {
            String answer = "";
            int count = 0;
            int num = 0;

            String[] strarr = polynomial.split(" ");
            for (int i = 0; i < strarr.length; i++) {
                if (strarr[i].contains("x")) {
                    if (strarr[i].equals("x")) {
                        count += 1;
                    } else {
                        count += Integer.parseInt(strarr[i].substring(0, strarr[i].length() - 1));
                    }
                } else if (!strarr[i].equals("+")) {
                    num += Integer.parseInt(strarr[i]);
                }
            }

            if (count == 0) {
                answer = (num != 0) ? Integer.toString(num) : "0";
            } else {
                answer = (count != 1 ? Integer.toString(count) : "") + "x" + ((num != 0) ? " + " + Integer.toString(num) : "");
            }

            return answer;
        }
    }

}
