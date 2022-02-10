package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/***
 * 
 * @author dahae
 * 성공
 * 
 * 추가 공부해야 하는 것
 *= 버퍼 사용
 * 
 * 헷갈린 것
 * =배열 속 string 비교 쌍따옴표로. '' 작은 짜옴표와 구분할 것. 
 */
//문제 사항 들어오는 숫자 중 5나 6이 있으면 두가지를 바꿔서 나오는 수도 경우의 수에 추가시켜준다.
//모든 경우의 수 구하지 말고 최소값을 구할 때는 6을 5로만 구하면 되고, 최대값은 5를 6으로만.
public class Num_2864 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//해결법 들어온 문자를 단어 단위로 잘라서 5와 6 유무를 따진다. = > 문자열로 받는게 낫겠다.
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		
		Scanner sc = new Scanner(System.in);
		
		String num1 = sc.next();
		String num2 = sc.next();
		
		//내장 함수를 기억 못하면 반복문에서 계속 10으로 나눠야 함.
		String[] num1Array = num1.split("");
		String[] num2Array = num2.split("");
		
		String num1Tmp = "";
		String num2Tmp = "";
		
		
		//최소값 구하기
		for(int i = 0 ; i < num1Array.length ; i++) {
			if(num1Array[i].equals("6"))
				num1Tmp += "5";
			else
				num1Tmp += num1Array[i];
				
		}
		
		for(int i = 0 ; i < num2Array.length ; i++) {
			if(num2Array[i].equals("6"))
				num2Tmp += "5";
			else
				num2Tmp += num2Array[i];
				
		}
		
		int min = Integer.parseInt(num1Tmp) + Integer.parseInt(num2Tmp);
		num1Tmp = "";
		num2Tmp = "";
		
		
		//최대값 구하기
		for(int i = 0 ; i < num1Array.length ; i++) {
			if(num1Array[i].equals("5"))
				num1Tmp += "6";
			else
				num1Tmp += num1Array[i];
				
		}
		
		for(int i = 0 ; i < num2Array.length ; i++) {
			if(num2Array[i].equals("5"))
				num2Tmp += "6";
			else
				num2Tmp += num2Array[i];
				
		}
		 
		
		int max = Integer.parseInt(num1Tmp) + Integer.parseInt(num2Tmp);
		
		System.out.print(min + " " + max);
		
		sc.close();//버퍼 닫기
	}

}
