package Greedy;

import java.util.Scanner;

/***
 * 
 * @author dahae
 * 2022/01/29 �ذ� x
 * �־��� �׽�Ʈ�� ��� ������, ���� ��� ó���� �ȵ�. �ٽ� Ǯ ��.
 */
public class Num5585 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int change = 1000 - N;
		int[] coinArr = {500, 100, 50, 10, 5, 1};

		//K���� ����µ� �ʿ��� �ּ� ���� ������ ���ϴ� ����(11047������ ����)
		//ū ������ ���� ���� �̴� ���� �߿��ϴ�.
		
		int coinCnt = 0;
		int startIndex = 0;
		
		for(int i = 0; i < coinArr.length ; i++) { //K���� ū ���� ������ ���� �ʿ� ���� ������ �ش� index�� ���ϱ�.
			if(coinArr[i] <= change) {
				startIndex = i;
				break;
			}
		}
		
		
		for(int i = startIndex ; i < coinArr.length ; i++) {
			if(change == 0)
				break;
			
			int cnt = change / coinArr[i];
			coinCnt += cnt;
			change %= coinArr[i];
		}
		
		System.out.print(coinCnt);
		sc.close();
	}

}
