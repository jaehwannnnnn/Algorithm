import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        
        int todayYear = Integer.parseInt(today.substring(0, 4));
        int todayMonth = Integer.parseInt(today.substring(5, 7));
        int todayDay = Integer.parseInt(today.substring(8, 10));
        
        String[][] sarr = new String[terms.length][2];
        for(int i = 0; i < sarr.length; i++){
            sarr[i] = terms[i].split(" ");
        }
        
        for(int i = 0; i < privacies.length; i++){
            String year = privacies[i].substring(0, 4);
            String month = privacies[i].substring(5, 7);
            String day = privacies[i].substring(8, 10);
            
            for(int j = 0; j < terms.length; j++){
                if(privacies[i].charAt(privacies[i].length() - 1) == terms[j].charAt(0)){
                    int plus = Integer.parseInt(sarr[j][1]);
                    int newMonth = Integer.parseInt(month) + plus;
                    int yearPlus = newMonth / 12;
                    newMonth %= 12;
                    if(newMonth == 0) {
                        newMonth = 12;
                        yearPlus--;
                    }
                    year = String.valueOf(Integer.parseInt(year) + yearPlus);
                    month = String.format("%02d", newMonth);
                    day = String.format("%02d", Integer.parseInt(day) - 1);
                }
            }
            
            if(todayYear > Integer.parseInt(year) ||
               (todayYear == Integer.parseInt(year) && todayMonth > Integer.parseInt(month)) ||
               (todayYear == Integer.parseInt(year) && todayMonth == Integer.parseInt(month) && todayDay > Integer.parseInt(day))) {
                answer.add(i + 1);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
