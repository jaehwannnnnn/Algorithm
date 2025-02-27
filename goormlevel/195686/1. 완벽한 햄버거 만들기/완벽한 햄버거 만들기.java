import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1 = br.readLine();
		int[] intarr = new int[Integer.parseInt(input1)];
		String input2 = br.readLine();
		String[] strarr = input2.split(" ");
		for(int i=0;i<strarr.length;i++){
			intarr[i] = Integer.parseInt(strarr[i]);
		}
		if(intarr.length == 1){
			System.out.println(intarr[0]);
			return;
		}
		int max = intarr[0];
		int maxidx = 0;
		for(int i=0;i<intarr.length;i++){
			if(intarr[i] > max){
				max = intarr[i];
				maxidx = i;
			}
		}
		int answer =0;
		for(int i=0;i<maxidx;i++){
			if(intarr[i]>intarr[i+1]){
				System.out.println(0);
				return;
			}else{
				answer += intarr[i];
			}
		}
		for(int i=maxidx;i<intarr.length - 1;i++){
			if(intarr[i+1] > intarr[i]){
				System.out.println(0);
				return;
			}else{
				answer += intarr[i];
			}
		}
		if(answer != 0){
			answer += intarr[intarr.length - 1];
		}
		System.out.println(answer);
	}
}