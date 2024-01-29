package Basic.Day12;

public class RemainedOfNine {
    public int solution(String number) {
        int answer = 0;
        String[] numbers = number.split("");
        int[] intArray = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            intArray[i] = Integer.parseInt(numbers[i]);
        }
        int count =0;
        for(int i =0;i<numbers.length;i++){
            count += intArray[i];
        }
        answer = count %9;
        return answer;
    }
}
