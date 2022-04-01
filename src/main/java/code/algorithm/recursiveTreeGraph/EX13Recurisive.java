package code.algorithm.recursiveTreeGraph;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 인접리스트
 방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프 로그램을 작성하세요. 아래 그래프에서 1번 정점에서 5번 정점으로 가는 가지 수는
 12345
 125
 13425
 1345
 1425
 145
 총 6 가지입니다.
 3
 4
 ▣ 입력설명
 첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연 결정보가 주어진다.
 ▣ 출력설명
 총 가지수를 출력한다.
 ▣ 입력예제 1
 5 9
 1 2
 1 3
 1 4
 2 1
 2 3
 2 5
 3 4
 4 2
 4 5
 ▣ 출력예제 1
 6
 */
public class EX13Recurisive {

    static int n,m, answer=0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public int DFS(int v){
        if(v==n) answer++;
        else{
            for(int nv: graph.get(v)){
                if(ch[nv]==0){
                    ch[nv]=1;
                    DFS(nv);
                    ch[nv]=0;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        EX13Recurisive T = new EX13Recurisive();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch=new int[n+1];
        for(int i=0; i<m; i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        /*
        int index=0;
        for(ArrayList<Integer> x : graph){
            System.out.print(index+ " : ");
            for(int y : x){
                System.out.print(y);
            }
            index++;
            System.out.println();
        }

         */

        ch[1] =1;
        T.DFS(1);
        System.out.println(answer);

    }
}
