package Greedy;

import java.util.Scanner;

//ó���� �ߺ��������� Ǯ���� �ߴ�,,
/***
 * 
 * @author dahae
 * ����
 * ��� Ȯ�� �Ϸ�
 * 11047�� ����� ����
 */
public class Num10162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //�Է��� �ʷ� ����
		
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
		
		//����ó��
		if(T % 10 != 0) {
			System.out.println(-1); 
			System.exit(0); //���α׷� ���� ���� ��Ű��
		}
		else {
			C = T/10;
			System.out.println(A + " " + B + " " + C);
		}
		sc.close();
	}

}
