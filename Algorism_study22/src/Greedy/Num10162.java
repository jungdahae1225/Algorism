package Greedy;

import java.util.Scanner;

//처음엔 중복조합으로 풀려고 했다,,
/***
 * 
 * @author dahae
 * 성공
 * 답안 확인 완료
 * 11047과 비슷한 문제
 */
public class Num10162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //입력이 초로 들어옴
		
		int A = 0;
		int B = 0;
		int C = 0;
		
		if(T >= 300) {
			A = T/300;
			T -= 300 * A;
		}
		if(T >= 60) {
			B = T/60;
			T -= 60 * B;
		}
		
		//예외처리
		if(T % 10 != 0) {
			System.out.println(-1); 
			System.exit(0); //프로그램 정상 종료 시키기
		}
		else {
			C = T/10;
			System.out.println(A + " " + B + " " + C);
		}
		sc.close();
	}

}
