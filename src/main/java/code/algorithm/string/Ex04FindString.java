package code.algorithm.string;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 단어 뒤집기
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 * ▣ 입력설명
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되 어 있습니다.
 * ▣ 출력설명
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 * ▣ 입력예제 1
 * 3
 * good
 * Time
 * Big
 * ▣ 출력예제 1
 * doog
 * emiT
 * giB
 */

public class Ex04FindString {


    private ArrayList<String> Soultion(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
           int lt=0, rt=x.length()-1;
           char[] s = x.toCharArray();
           while (lt<rt){
               char tmp = s[lt];
               s[lt] = s[rt];
               s[rt] = tmp;
               lt++;
               rt--;
           }
            String reverWord = String.valueOf(s);
           answer.add(reverWord);

        }
        return answer;
    }


    private ArrayList<String> Soultion2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x: str) {
            String tmp = new StringBuffer(x).reverse().toString();
            answer.add(tmp);

        }
        return answer;
    }

    public static void main(String[] args) {
        Ex04FindString T = new Ex04FindString();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i]= sc.next();
        }

        for (String x :  T.Soultion2(n, str)){
            System.out.println(x);
        }

    }

}
