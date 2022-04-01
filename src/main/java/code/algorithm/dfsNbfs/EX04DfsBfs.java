package code.algorithm.dfsNbfs;

import java.util.Scanner;


/**
 * 중복순열 구하기
 1부터 N까지 번호가 적힌 구슬이 있습니다. 이 중 중복을 허락하여 M번을 뽑아 일렬로 나열 하는 방법을 모두 출력합니다.
 ▣ 입력설명
 첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N) 이 주어집니다.
 ▣ 출력설명
 첫 번째 줄에 결과를 출력합니다.
 출력순서는 사전순으로 오름차순으로 출력합니다.
 ▣ 입력예제 1
 3 2
 ▣ 출력예제 1
 11
 12
 13
 21
 22
 23
 31
 32
 33
 */

public class EX04DfsBfs {
    static int[] pm;
    static int n,m;

    public void DFS(int L){
        if(L==m){
            for(int x : pm) System.out.print(x+" ");
            System.out.println();
        }
        else{
            for (int i=1; i<=n; i++) {
                pm[L] =i;
                DFS(L + 1);
            }
        }
    }

    public static void main(String[] args){
        EX04DfsBfs T = new EX04DfsBfs();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        pm=new int[m];
        T.DFS(0);
    }
}
