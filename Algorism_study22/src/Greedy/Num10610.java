package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/***
 * 
 * @author dahae
 * 성공
 * 
 * 문제 해결법 입력받은 수를 쪼갠다.
 * 큰 수를 최대한 앞으로 배치 하되, 30의 배수가 되게 만든다.
 * 
 * 30 = 3 * 10
 * 
 * 따라서 일단 10의 배수가 되기 위해 숫자 0이 포함 되어있나 확인.
 * 3의 배수인지 확인법 = 각 자리 수 모두 더해서 3의 배수가 되면 되는 거임
 * 
 * 1차 실패 : 이유 - 시간초과 아마도 sort때문 같음
 * 문제해결 - Arrays.sort 대신 Collections의 sort를 사용.
 */
public class Num10610 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String st = br.readLine();
		String[] arr = st.split("");    // 입력값을 배열에 저장
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i < arr.length ; i++)
			list.add(arr[i]);
		
		int cnt = 0;
		int total_for_check = 0;
		
		for(int i = 0; i < list.size() ; i++) {
			if(list.get(i).equals("0"))
				cnt++;
			total_for_check += Integer.parseInt(arr[i]); //char형 int로 바꾸기
		}
		//System.out.print(cnt);
		
		if(cnt == 0) { //0이 하나도 포함되지 않은 경우 -1 출력 ||모든 자리수의 합이 3의 배수가 되지 않으면 안됨.
			System.out.print("-1");
			return;
		}
		
		if(total_for_check % 3 != 0){ //0이 하나도 포함되지 않은 경우 -1 출력 ||모든 자리수의 합이 3의 배수가 되지 않으면 안됨.
			System.out.print("-1");
			return;
		}
		
		//Arrays.sort(arr,Collections.reverseOrder());
		Collections.sort(list);
		Collections.reverse(list);
		
		String answer = "";
		
		for(int i = 0; i < list.size() ; i++) {
			answer += list.get(i);
		}
		
		bw.write(answer);
		bw.close();
		return;
	}
}
