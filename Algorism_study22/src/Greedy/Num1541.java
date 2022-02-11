package Greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***
 * 
 * @author dahae
 * 2022/01/29 해결 x
 * 경우 3에 대한 로직이 생각나지 않음..
 */

public class Num1541 {
	 public static void main(String[] args) {
		 //첫째 줄에 식이 주어진다. 식은 ‘0’~‘9’, ‘+’, 그리고 ‘-’만으로 이루어져 있다.
		 
		 Scanner sc = new Scanner(System.in);
		 String input = sc.next();
		 
		 //1.들어온 문자열을 자른다.		 
		 //입력 예시 55-50+40
		 
		 String forMakeNum = "";
		 List<String> arr = new ArrayList<String>(); //!!!!!
		 List<String> numArr = new ArrayList<String>(); //!!!!!
		 
		 for(int i = 0 ; i < input.length() ; i++) {
			 if(input.charAt(i) == '+' && input.charAt(i) == '-') {
				 arr.add(String.valueOf(input.charAt(i)));
				 numArr.add(forMakeNum);
				 forMakeNum = "";
			 }
			 else // + - 아닐 때
				 forMakeNum += input.charAt(i);
		 }
		 
		 //1.연산자가 +만 있는 경우
		 int total = 0;
		 if(!arr.contains("-")) {
			for(int i = 0 ; i < numArr.size();i++)
				total += Integer.parseInt(numArr.get(i));
			System.out.print(total);
			return;
		 }
		 
		 //2.연산자가 -만 있는 경우
		 total = 0;
		 if(!arr.contains("+")) {
			for(int i = 0 ; i < numArr.size();i++)
				total += Integer.parseInt(numArr.get(i));
			System.out.print(-total);
			return;
		 }
		 
		 //3.연산자가 -와 +모두 있는 경우
		 //음수를 최대한 모아서 연산 하는게 가장 값이 작을 것 같다.
		 int tmp = 0;
		 int max = 0;
		 int index = 0;
		 
		 for(int i = 0; i < arr.size() ; i++) {
			 if(arr.get(i) == String.valueOf('+')) {
				 if(max < tmp) {
					 max = tmp;
					 index = i - 1;
				 }
				 tmp = 0;
			 }
			 else
				 tmp += 1;
		 }
		 sc.close();
	 }
}
