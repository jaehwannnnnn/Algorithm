class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        
        String[] strarr = s.split(" ");
        for(int i=0;i<strarr.length;i++){
            if (strarr[i].length() > 0) {
                if(strarr[i].charAt(0) >=97 && strarr[i].charAt(0) <= 122){
                    char c = Character.toUpperCase(strarr[i].charAt(0));
                    strarr[i] = c + strarr[i].substring(1); 
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strarr.length - 1;i++){
            sb.append(strarr[i] + " ");
            System.out.println(strarr[i]);
        }
        System.out.println(strarr[strarr.length -1]);
        if(strarr[strarr.length -1].equals("")){
            sb.append(" ");
        }else{
            sb.append(strarr[strarr.length -1]);
        }
        if(s.charAt(s.length()-1) == ' '){
            sb.append(" ");
        }
        return sb.toString();
    }
}