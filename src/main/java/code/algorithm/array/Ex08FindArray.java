package code.algorithm.array;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 등수구하기
 * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다. 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
 * ▣ 입력설명
 * 첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력 된다.
 * ▣ 출력설명
 * 입력된 순서대로 등수를 출력한다.
 * ▣ 입력예제 1
 * 5
 * 87 89 92 100 76
 * ▣ 출력예제 1
 * 43215
 */

public class Ex08FindArray {



    public String solution(int n, int[] num){
        String answer= "";
        int[] score = new int[num.length];
        for(int i=0; i< num.length; i++){
            int cnt =1;
            for(int j=0; j< num.length; j++){
                if(num[j] > num[i] ) cnt++;
            }
            score[i]=cnt;
        }

        for(int x: score){
            answer += x+ " ";
        }


        return answer;
    }

    public static void main(String[] args) {
        Ex08FindArray T = new Ex08FindArray();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }

        System.out.println(T.solution(n, arr));
    }
}
