package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 * @author dahae
 * 풀이법: 그냥 가장 많은 자연수가 더해져야 하니까 1부터 1씩증가시킨 애들을 더하고 남은 값이랑 비교.
 * 성공 
 * 
 * 1차 실패: 요인 - 예외 상황 input : 0 -> output :0 을 파악하지 못함
 * 예외 찾고 성공
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
