package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 * @author dahae
 * Ǯ�̹�: �׳� ���� ���� �ڿ����� �������� �ϴϱ� 1���� 1��������Ų �ֵ��� ���ϰ� ���� ���̶� ��.
 * ���� 
 * 
 * 1�� ����: ���� - ���� ��Ȳ input : 0 -> output :0 �� �ľ����� ����
 * ���� ã�� ����
 */
public class Num1789 {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		//System.out.print(input);
		
		long temp = 0;
		
		long i = 0;
		
		for(i = 0 ; i <= Long.parseLong(input) ; i++) {
			temp += i;
			
			if(i >= Long.parseLong(input) - temp) {
				break;
			}
		}
		
		System.out.print(i);
		//bw.write(i);
		bw.close();
		return;
		
	}

}
