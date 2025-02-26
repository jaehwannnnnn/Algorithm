import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1 = br.readLine();
		int[] intarr = new int[Integer.parseInt(input1)];
		for(int i=0;i<intarr.length;i++){
			String input2 = br.readLine();
			String[] strarr = input2.split(" ");
			if(strarr[1].equals("+")){
				intarr[i] = Integer.parseInt(strarr[0]) + Integer.parseInt(strarr[2]);
			}else if(strarr[1].equals("-")){
				intarr[i] = Integer.parseInt(strarr[0]) - Integer.parseInt(strarr[2]);
			}else if(strarr[1].equals("*")){
				intarr[i] = Integer.parseInt(strarr[0]) * Integer.parseInt(strarr[2]);
			}else{
				intarr[i] = Integer.parseInt(strarr[0]) / Integer.parseInt(strarr[2]);
			}
		}
		int answer = 0;
		for(int i=0;i<intarr.length;i++){
			answer += intarr[i];
		}
		System.out.println(answer);
	}
}