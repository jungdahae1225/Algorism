package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
/**
 * @author dahae
 * 2022.02.12 ���� ������ �ȳ�
 * = ���� �ٽ� Ǯ���
 * 
 * 
 *������ Ǯ�̹�
 *���� �ڸ��� �ֵ��� ��� ���� ū ���� �������� �������
 *
 *ū �ڸ����� ������ �ִ� ģ�� �ֺ��� ������ �ű��.
 *�迭 �ε����� ���ĺ��� �����Ǵ� ���ڶ�� �����ϰ� �迭�� �� ���ĺ��� �����Ѵ�.
 *
 *�ϳ��� ���ĺ��� �ϳ��� ���ڸ� ���� �� �ִ�.
 *
 *������ �ű�� ���: �ϴ� ���ڸ� ��� �ް� �� �ڸ����� ��� �ϴ� ������ �����Ѵ�.
 *�ڸ������� �� �ص� �Ǵµ� �ϴ� ���� ũ�� ��ü�� ���ص� �� ��
 *
 *  //12345
    //ACDEB
    //98754
    
    //00345
    //00GCF
    //00683
 */

public class Num1339 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = br.read(); //�� ���� ���ڰ� ��������
        String[] dataArr = new String[cnt];
        
        Integer[] stSizeArr = new Integer[cnt];
        int maxSize = 0;
        
        //1.�ϴ� �ڸ����� ū ������� �����ϱ�
        for(int i = 0 ; i < cnt; i++) {
        	dataArr[i] = br.readLine();
        	stSizeArr[i] = dataArr[i].length(); //�Է� �޴� ���ڿ��� ���̵� �����ϱ�	
        }
       
        Arrays.sort(stSizeArr,Collections.reverseOrder()); //����� ���� �������� ����
        
        
       
        
       
        
	}

}
