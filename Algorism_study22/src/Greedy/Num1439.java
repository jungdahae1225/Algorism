package Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
 * Ǯ��: 
 * ���� ���� ���� �ʿ�� ���� �׳� ���� Ƚ���� ���ϸ� �ȴ�.
 * 
 * ������ Ǯ�� - ���ڰ� �ٸ� �κ��� ã���� �ȴ�.
 * 01�� �κа� 10�� �κ��� ���� ���� �� �� Ƚ���� �� ���� �� ���� �� ��.
 *
 * 
 */  

/***
 * 
 * @author dahae
 * �־��� ���ÿ� �������� ����ó�� ��� ó�� �Ǵµ� ������ �ȵ�..
 * 
 */

public class Num1439 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		String st = br.readLine(); 
		
		//1.�Էµ� ���ڿ��� �迭�� ����
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
		
		//��ģ ��. �� �� 0�� �ƴϸ� �� �� �ּҸ� ����ϰ� �� �� �ϳ��� 0�� �ƴϰ� �������� 0�̸� 0 �ƴ� �ָ� ����ؾ���
		
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
