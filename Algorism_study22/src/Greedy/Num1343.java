package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1343 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		String st = br.readLine();
		
		String plio1 = "AAAA";
		String plio2 = "BB";
		
		String[] stArray = st.split("");
		//for(int i = 0 ; i < stArray.length ; i++) 
			//System.out.print(stArray[i]);
		
		String tmp = "";
		int cnt = 0;
		
		for(int i = 0 ; i < stArray.length ; i++) {
			
			if(stArray[i].equals(".")) { //cnt를 멈추는 순간에 쌓인 X가 몇개인지.
				tmp += ".";
			}
			if(stArray[i].equals("X")) {

				cnt += 1;
			}
			if(cnt == 4) {
				System.out.println(cnt);
				tmp += "AAAA";
				cnt = 0;
			}
			if(cnt == 2){
				System.out.println(cnt);
				tmp += "BB";
				cnt = 0;
			}
			if(cnt == 1 || cnt == 3) {
				System.out.print("-1");
				System.exit(0);
			}
				
		}
		
		System.out.print(tmp);
		System.out.print("end");
		br.close();
	}
}
