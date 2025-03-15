import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> colorMap = new HashMap<>();
        colorMap.put("black", 0);
        colorMap.put("brown", 1);
        colorMap.put("red", 2);
        colorMap.put("orange", 3);
        colorMap.put("yellow", 4);
        colorMap.put("green", 5);
        colorMap.put("blue", 6);
        colorMap.put("violet", 7);
        colorMap.put("grey", 8);
        colorMap.put("white", 9);
        String firstColor = scanner.next();
        String secondColor = scanner.next();
        String thirdColor = scanner.next();
        int value = colorMap.get(firstColor) * 10 + colorMap.get(secondColor);
        int multiplier = (int) Math.pow(10, colorMap.get(thirdColor));
        System.out.println((long) value * multiplier);
    }
}
