import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] intarr = new int[T];
		for(int i=0;i<intarr.length;i++){
			String[] strarr = br.readLine().split(" ");
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
		int sum = 0;
		for(int i=0;i<intarr.length;i++){
			sum += intarr[i];
		}
		System.out.println(sum);
	}
}