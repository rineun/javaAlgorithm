package code.algorithm.dfsNbfs;

import java.util.Scanner;


/**
 조합 구하기
 1부터N까지번호가적힌구슬이있습니다.이중 M개를뽑는방법의수를출력하는프로그 램을 작성하세요.
 ▣ 입력설명
 첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N) 이 주어집니다.
 ▣ 출력설명
 첫 번째 줄에 결과를 출력합니다.
 출력순서는 사전순으로 오름차순으로 출력합니다.
 ▣ 입력예제 1 42
 ▣ 출력예제 1 12
 13
 14
 23 24 34
 */

public class EX09DfsBfs {
    static int[] combi;
    static int n, m;
    public void DFS(int L, int s){
        if(L==m){
            for(int x : combi) System.out.print(x+" ");
            System.out.println();
        }
        else{
            for(int i=s; i<=n; i++){
                combi[L]=i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args){
        EX09DfsBfs T = new EX09DfsBfs();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        combi=new int[m];
        T.DFS(0, 1);
    }
}
