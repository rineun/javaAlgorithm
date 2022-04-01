package code.algorithm.dfsNbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/**
 * 섬나라 아일랜드(DFS)
 N*N의 섬나라 아일랜드의 지도가 격자판의 정보로 주어집니다. 각 섬은 1로 표시되어 상하좌 우와 대각선으로 연결되어 있으며, 0은 바다입니다. 섬나라 아일랜드에 몇 개의 섬이 있는지 구하는 프로그램을 작성하세요.

 * 만약 위와 같다면 섬의 개수는 5개입니다.
 * ▣ 입력설명
 * 첫 번째 줄에 자연수 N(3<=N<=20)이 주어집니다. 두 번째 줄부터 격자판 정보가 주어진다.
 * ▣ 출력설명
 * 첫 번째 줄에 섬의 개수를 출력한다.
 * ▣ 입력예제 1
 7
 1 1 0 0 0 1 0
 0 1 1 0 1 1 0
 0 1 0 0 0 0 0
 0 0 0 1 0 1 1
 1 1 0 1 1 0 0
 1 0 0 0 1 0 0
 1 0 1 0 1 0 0
 * ▣ 출력예제 1
 * 5
 */

public class EX13DfsBfs {
    static int answer=0, n;
    static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};
    public void DFS(int x, int y, int[][] board){
        for(int i=0; i<8; i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1){
                board[nx][ny]=0;
                DFS(nx, ny, board);
            }
        }
    }
    public void solution(int[][] board){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==1){
                    answer++;
                    board[i][j]=0;
                    DFS(i, j, board);
                }
            }
        }
    }

    public static void main(String[] args) {
        EX13DfsBfs T = new EX13DfsBfs();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        T.solution(arr);
        System.out.println(answer);
    }
}
