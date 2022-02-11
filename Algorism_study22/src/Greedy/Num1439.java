package Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
 * 풀이: 
 * 내가 같게 만들 필요는 없고 그냥 수행 횟수만 구하면 된다.
 * 
 * 생각한 풀이 - 숫자가 다른 부분을 찾으면 된다.
 * 01인 부분과 10인 부분을 각각 세서 둘 중 횟수가 더 작은 걸 고르면 될 듯.
 *
 * 
 */  

/***
 * 
 * @author dahae
 * 주어진 예시와 질문란의 예외처리 모두 처리 되는데 성공이 안됨..
 * 
 */

public class Num1439 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		String st = br.readLine(); 
		
		//1.입력된 문자열을 배열로 변경
		char[] arr = st.toCharArray();
		
		//log
		//System.out.println(st);
		
		int cnt_01 = 0;
		int cnt_10 = 0;
		
		for(int i = 0; i < (arr.length - 1); i++) {
			String test = "";
			test = Character.toString(arr[i]) +  Character.toString(arr[i+1]);
			
			//log
			//System.out.println(test);
			
			if(test.equals("01"))
				cnt_01 += 1;
			if(test.equals("10"))
				cnt_10 += 1;
		}
		
		//log
		//System.out.println(cnt_01);
		//System.out.println(cnt_10);
		
		//놓친 것. 둘 다 0이 아니면 둘 중 최소를 출력하고 둘 중 하나라도 0이 아니고 나머지는 0이면 0 아닌 애를 출력해야함
		
		if(cnt_01 != 0 && cnt_10 != 0) {
			if(cnt_01 <= cnt_10) {
				System.out.print(cnt_01);
				System.exit(0);
			}
			if(cnt_01 > cnt_10){
				System.out.print(cnt_10);
				System.exit(0);
			}
		}
		else {
			if(cnt_01 == 0){
				System.out.print(cnt_10);
				System.exit(0);
			}
			
			else {
				System.out.print(cnt_01);
				System.exit(0);
			}
		}
	}

}
