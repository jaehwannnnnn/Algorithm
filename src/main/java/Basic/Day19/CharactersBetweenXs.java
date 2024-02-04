package Basic.Day19;

public class CharactersBetweenXs {
    public int[] solution(String myString) {
        String[] myStrings = myString.split("x");
        int size = myStrings.length;
        if(myString.charAt(myString.length()-1) == 'x'){
            size +=1;
        }
        int[] answer = new int[size];
        for(int i=0; i<myStrings.length;i++){
            answer[i] = myStrings[i].length();
        }
        return answer;
    }
}
