package Greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***
 * 
 * @author dahae
 * 2022/01/29 �ذ� x
 * ��� 3�� ���� ������ �������� ����..
 */

public class Num1541 {
	 public static void main(String[] args) {
		 //ù° �ٿ� ���� �־�����. ���� ��0��~��9��, ��+��, �׸��� ��-�������� �̷���� �ִ�.
		 
		 Scanner sc = new Scanner(System.in);
		 String input = sc.next();
		 
		 //1.���� ���ڿ��� �ڸ���.		 
		 //�Է� ���� 55-50+40
		 
		 String forMakeNum = "";
		 List<String> arr = new ArrayList<String>(); //!!!!!
		 List<String> numArr = new ArrayList<String>(); //!!!!!
		 
		 for(int i = 0 ; i < input.length() ; i++) {
			 if(input.charAt(i) == '+' && input.charAt(i) == '-') {
				 arr.add(String.valueOf(input.charAt(i)));
				 numArr.add(forMakeNum);
				 forMakeNum = "";
			 }
			 else // + - �ƴ� ��
				 forMakeNum += input.charAt(i);
		 }
		 
		 //1.�����ڰ� +�� �ִ� ���
		 int total = 0;
		 if(!arr.contains("-")) {
			for(int i = 0 ; i < numArr.size();i++)
				total += Integer.parseInt(numArr.get(i));
			System.out.print(total);
			return;
		 }
		 
		 //2.�����ڰ� -�� �ִ� ���
		 total = 0;
		 if(!arr.contains("+")) {
			for(int i = 0 ; i < numArr.size();i++)
				total += Integer.parseInt(numArr.get(i));
			System.out.print(-total);
			return;
		 }
		 
		 //3.�����ڰ� -�� +��� �ִ� ���
		 //������ �ִ��� ��Ƽ� ���� �ϴ°� ���� ���� ���� �� ����.
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
