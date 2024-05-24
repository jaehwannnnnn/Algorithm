import java.util.*;

class Solution {
    public Integer[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<List<Integer>> outerList = new ArrayList<>();
        int k = 0;
        if(ext.equals("date")){
            k =1;
        }else if(ext.equals("maximum")){
            k =2; 
        }else if(ext.equals("remain")){
            k = 3;
        }else{
            k= 0;
        }
        if(sort_by.equals("date")){
            sort_by = "column_1";
        }else if(sort_by.equals("maximum")){
            sort_by = "column_2";
        }else if(sort_by.equals("remain")){
            sort_by = "column_3";
        }else{
            sort_by = "column_0";
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i][k] < val_ext) {  // 데이터 필터링 조건을 수정
                List<Integer> innerList = new ArrayList<>();
                for (int j = 0; j < data[i].length; j++) {
                    innerList.add(data[i][j]);
                }
                outerList.add(innerList);
            }
        }

        // 정렬 기준을 설정하는 Comparator
        Comparator<List<Integer>> comparator = (list1, list2) -> 0;
        switch (sort_by) {
            case "column_0":
                comparator = Comparator.comparingInt(list -> list.get(0));
                break;
            case "column_1":
                comparator = Comparator.comparingInt(list -> list.get(1));
                break;
            case "column_2":
                comparator = Comparator.comparingInt(list -> list.get(2));
                break;
            case "column_3":
                comparator = Comparator.comparingInt(list -> list.get(3));
                break;
        }

        // 정렬 수행
        outerList.sort(comparator);

        // List<List<Integer>>를 Integer[][]로 변환
        Integer[][] array = new Integer[outerList.size()][];
        for (int i = 0; i < outerList.size(); i++) {
            List<Integer> innerList = outerList.get(i);
            array[i] = innerList.toArray(new Integer[0]);
        }

        return array;
    }
}
