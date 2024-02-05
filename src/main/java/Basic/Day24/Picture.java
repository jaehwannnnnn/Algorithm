package Basic.Day24;

public class Picture {
    public String[] solution(String[] picture, int k) {
        int rows = picture.length;
        int cols = picture[0].length();

        int newRows = rows * k;
        int newCols = cols * k;

        String[] newPicture = new String[newRows];

        for (int i = 0; i < newRows; i++) {
            StringBuilder newRow = new StringBuilder();
            for (int j = 0; j < newCols; j++) {
                char originalPixel = picture[i / k].charAt(j / k);
                newRow.append(originalPixel);
            }
            newPicture[i] = newRow.toString();
        }

        return newPicture;
    }
}
