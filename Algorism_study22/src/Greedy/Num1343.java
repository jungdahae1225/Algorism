package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/****
 * 
 * @author dahae
 * ��ǰ. ���� Ǯ�� ������ �߸� ���� �� ����. ���ϴٽ�
 */
public class Num1343 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		String st = br.readLine();
		
		String plio1 = "AAAA";
		String plio2 = "BB";
		
		String[] stArray = st.split("");
		//for(int i = 0 ; i < stArray.length ; i++) 
			//System.out.print(stArray[i]);
		
		String tmp = "";
		int cnt = 0;

		for(int i = 0 ; i < stArray.length ; i++) {
			
			if(stArray[i].equals(".")) { //cnt�� ���ߴ� ������ ���� X�� �����.
				tmp += ".";
			}

			else {//stArray[i].equals("X")
				cnt++;
				
				if(i < stArray.length -1) {
					if(cnt == 1 && stArray[i+1].equals(".")) { //cnt == 1�϶�
						System.out.print("-1");
						System.exit(0);
					}
					if(cnt == 3 && stArray[i+1].equals(".")) {
						System.out.print("-1");
						System.exit(0);
					}
					if(cnt == 2){ //X�� 2������ ä������, ������ X�� �ƴ� ��
						if(!stArray[i+1].equals("X")) {	
							//System.out.println(cnt);
							tmp += plio2;
							cnt = 0;
						}
					}
				}
				
				else {
					if(cnt == 1) { //cnt == 1�϶�
						System.out.print("-1");
						System.exit(0);
					}
					if(cnt == 3) {
						System.out.print("-1");
						System.exit(0);
					}
					if(cnt == 2){ //X�� 2������ ä������, ������ X�� �ƴ� ��
						//System.out.println(cnt);
						tmp += plio2;
						cnt = 0;
					}
				}
				
				
				
				
				
				if(cnt == 4) {
					System.out.println(cnt);
					tmp += plio1;
					cnt = 0;
				}
			}	
		}
		
		System.out.print(tmp);
		br.close();
	}
}
