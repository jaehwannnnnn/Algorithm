import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        String[] strarr1 = new String[str1.length() - 1];
        for (int i=0; i<str1.length() - 1; i++) {
            strarr1[i] = str1.substring(i, i + 2);
        }
        String[] strarr2 = new String[str2.length() - 1];
        for (int i=0; i<str2.length() - 1; i++) {
            strarr2[i] = str2.substring(i, i + 2);
        }
        List<String> list1 = new ArrayList<>();
        for(int i=0;i<strarr1.length;i++){
            if(strarr1[i].matches("[a-zA-Z]+")){
                list1.add(strarr1[i]);
            }
        }
        List<String> list2 = new ArrayList<>();
        for(int i=0;i<strarr2.length;i++){
            if(strarr2[i].matches("[a-zA-Z]+")){
                list2.add(strarr2[i]);
            }
        }
        List<String> intersection = new ArrayList<>();
        for (String item : list1) {
            if (list2.contains(item)) {
                intersection.add(item);
                list2.remove(item);
            }
        }
        List<String> union = new ArrayList<>(list1);
        union.addAll(list2);
        double result = 0;
        if(union.size() != 0){
            result = (double) intersection.size() / union.size();
        }else{
            result = 0;
        }
        if(str1.equals(str2)){
            result = 1;
        }
        double abc = result * 65536;
        answer = (int) abc;
        return answer;
    }
}