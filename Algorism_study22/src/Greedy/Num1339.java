package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
/**
 * @author dahae
 * 2022.02.12 로직 생각이 안남
 * = 내일 다시 풀어보기
 * 
 * 
 *생각한 풀이법
 *같은 자리수 애들은 어느 것이 큰 값을 가져가든 상관없음
 *
 *큰 자리수를 가지고 있는 친구 애부터 순위를 매기기.
 *배열 인덱스를 알파벳에 지정되는 숫자라고 생각하고 배열에 각 알파벳을 저장한다.
 *
 *하나의 알파벳은 하나의 숫자만 가질 수 있다.
 *
 *순위를 매기는 방법: 일단 숫자를 모두 받고 각 자리수를 계산 하는 변수를 설정한다.
 *자리수별로 비교 해도 되는데 일단 숫자 크기 자체를 비교해도 될 듯
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
        int cnt = br.read(); //몇 개의 숫자가 들어오는지
        String[] dataArr = new String[cnt];
        
        Integer[] stSizeArr = new Integer[cnt];
        int maxSize = 0;
        
        //1.일단 자리수가 큰 순서대로 나열하기
        for(int i = 0 ; i < cnt; i++) {
        	dataArr[i] = br.readLine();
        	stSizeArr[i] = dataArr[i].length(); //입력 받는 문자열의 길이들 저장하기	
        }
       
        Arrays.sort(stSizeArr,Collections.reverseOrder()); //사이즈를 내림 차순으로 정렬
        
        
       
        
       
        
	}

}
