package Greedy;

import java.util.Scanner;

/***
 * 
 * @author dahae
 * 2022/01/29 해결 x
 * 주어진 테스트는 통과 했으나, 예외 경우 처리가 안됨. 다시 풀 것.
 */
public class Num5585 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int change = 1000 - N;
		int[] coinArr = {500, 100, 50, 10, 5, 1};

		//K원을 만드는데 필요한 최소 동전 개수를 구하는 문제(11047문제와 유사)
		//큰 동전을 가장 많이 뽑는 것이 중요하다.
		
		int coinCnt = 0;
		int startIndex = 0;
		
		for(int i = 0; i < coinArr.length ; i++) { //K보다 큰 동전 단위는 셈에 필요 없기 때문에 해당 index를 구하기.
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
