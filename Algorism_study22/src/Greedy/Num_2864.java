package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/***
 * 
 * @author dahae
 * ����
 * 
 * �߰� �����ؾ� �ϴ� ��
 *= ���� ���
 * 
 * �򰥸� ��
 * =�迭 �� string �� �ֵ���ǥ��. '' ���� ¥��ǥ�� ������ ��. 
 */
//���� ���� ������ ���� �� 5�� 6�� ������ �ΰ����� �ٲ㼭 ������ ���� ����� ���� �߰������ش�.
//��� ����� �� ������ ���� �ּҰ��� ���� ���� 6�� 5�θ� ���ϸ� �ǰ�, �ִ밪�� 5�� 6���θ�.
public class Num_2864 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//�ذ�� ���� ���ڸ� �ܾ� ������ �߶� 5�� 6 ������ ������. = > ���ڿ��� �޴°� ���ڴ�.
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		
		Scanner sc = new Scanner(System.in);
		
		String num1 = sc.next();
		String num2 = sc.next();
		
		//���� �Լ��� ��� ���ϸ� �ݺ������� ��� 10���� ������ ��.
		String[] num1Array = num1.split("");
		String[] num2Array = num2.split("");
		
		String num1Tmp = "";
		String num2Tmp = "";
		
		
		//�ּҰ� ���ϱ�
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
		
		
		//�ִ밪 ���ϱ�
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
		
		sc.close();//���� �ݱ�
	}

}
