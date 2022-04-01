package code.algorithm.dfsNbfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


/**
 * 순열 구하기
 10이하의 N개의 자연수가 주어지면 이 중 M개를 뽑아 일렬로 나열하는 방법을 모두 출력합 니다.
 ▣ 입력설명
 첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N) 이 주어집니다. 두 번째 줄에 N개의 자연수가 오름차순으로 주어집니다.
 ▣ 출력설명
 첫 번째 줄에 결과를 출력합니다.
 출력순서는 사전순으로 오름차순으로 출력합니다.
 ▣ 입력예제 1
 3 2
 3 6 9
 ▣ 출력예제 1
 36
 39
 63
 69
 93
 96
 */

public class EX06DfsBfs {
    static int n, m;
    static  int[] pm, ch, arr ;

    public void DFS(int L){

        if(L==m){
            for(int x : pm) System.out.print(x + " " );
            System.out.println();
        }else{
            for(int i=0; i<n; i++){
                if(ch[i] ==0) {
                    ch[L] = 1;
                    pm[L] = arr[i];
                    DFS(L + 1);
                    ch[L] = 0;
                }
            }
        }

    }

    public static void main(String[] args){
        EX06DfsBfs T = new EX06DfsBfs();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        arr= new int[n];
        for(int i=0; i<n; i++) arr[i] = kb.nextInt();
        ch=new int[n];
        pm=new int[m];
        T.DFS(0);
    }
}
