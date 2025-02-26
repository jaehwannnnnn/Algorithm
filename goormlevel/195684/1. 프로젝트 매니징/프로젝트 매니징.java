import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1 = br.readLine();
		int[] intarr = new int[Integer.parseInt(input1)];
		String input2 = br.readLine();
		String[] strarr = input2.split(" ");
		int[] arr = new int[strarr.length];
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(strarr[i]);
		}
		for(int i=0;i<Integer.parseInt(input1);i++){
			String input3 = br.readLine();
			intarr[i] = Integer.parseInt(input3);
		}
		for(int i=0;i<intarr.length;i++){
			arr[0] += intarr[i] / 60;
			arr[1] += intarr[i] % 60;
			if(arr[1] > 59){
				arr[0]++;
				arr[1] = arr[1] % 60;
			}
			if(arr[0] > 23){
				arr[0] = arr[0] % 24;
			}
		}
		System.out.print(arr[0]);
		System.out.print(" ");
		System.out.print(arr[1]);
	}
}