import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int bandage = 1;
		int medicine = 7;
		int painkiller = 14;
		int answer = 0;
		if(N >= 14){
			while(N / 14 != 0){
				answer++;
				N -= 14;
			}
		}
		if(N >= 7){
			while(N / 7 != 0){
				answer++;
				N -= 7;
			}
		}
		if(N >0){
			answer += N;
		}
		System.out.println(answer);
	}
}