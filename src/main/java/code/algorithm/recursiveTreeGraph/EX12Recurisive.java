package code.algorithm.recursiveTreeGraph;

import java.util.Scanner;

/**
 * 인접행렬
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
public class EX12Recurisive {

    static int n,m, answer=0;
    static int [][] graph;
    static int[] ch;
    public int DFS(int v){
        if(v==n) answer++;
        else{
            for(int i=1; i<=n; i++){
                if(graph[v][i]==1 && ch[i]==0){
                    ch[i] =1;
                    DFS(i);
                    ch[i]=0;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        EX12Recurisive T = new EX12Recurisive();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for(int i=0; i<m; i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b]=1;
        }

        /*
        //행렬출력
        for (int[] x:graph) {
            for (int y : x){
                System.out.print(y);
            }
            System.out.println();
        }
        *
         */
        ch[1] =1;
        T.DFS(1);
        System.out.println(answer);

    }
}


