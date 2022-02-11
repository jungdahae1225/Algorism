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
 * ����
 * 
 * ���� �ذ�� �Է¹��� ���� �ɰ���.
 * ū ���� �ִ��� ������ ��ġ �ϵ�, 30�� ����� �ǰ� �����.
 * 
 * 30 = 3 * 10
 * 
 * ���� �ϴ� 10�� ����� �Ǳ� ���� ���� 0�� ���� �Ǿ��ֳ� Ȯ��.
 * 3�� ������� Ȯ�ι� = �� �ڸ� �� ��� ���ؼ� 3�� ����� �Ǹ� �Ǵ� ����
 * 
 * 1�� ���� : ���� - �ð��ʰ� �Ƹ��� sort���� ����
 * �����ذ� - Arrays.sort ��� Collections�� sort�� ���.
 */
public class Num10610 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String st = br.readLine();
		String[] arr = st.split("");    // �Է°��� �迭�� ����
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i < arr.length ; i++)
			list.add(arr[i]);
		
		int cnt = 0;
		int total_for_check = 0;
		
		for(int i = 0; i < list.size() ; i++) {
			if(list.get(i).equals("0"))
				cnt++;
			total_for_check += Integer.parseInt(arr[i]); //char�� int�� �ٲٱ�
		}
		//System.out.print(cnt);
		
		if(cnt == 0) { //0�� �ϳ��� ���Ե��� ���� ��� -1 ��� ||��� �ڸ����� ���� 3�� ����� ���� ������ �ȵ�.
			System.out.print("-1");
			return;
		}
		
		if(total_for_check % 3 != 0){ //0�� �ϳ��� ���Ե��� ���� ��� -1 ��� ||��� �ڸ����� ���� 3�� ����� ���� ������ �ȵ�.
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
