import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] strarr = input.split(" ");
		double answer = Integer.parseInt(strarr[0]) * (1.0 + (double)(Integer.parseInt(strarr[1]) / 30.0));
		System.out.println((int)answer);
	}
}