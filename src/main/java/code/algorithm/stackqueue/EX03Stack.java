package code.algorithm.stackqueue;

import java.util.Scanner;
import java.util.Stack;

/**
 *크레인 인형뽑기(카카오)

 크레인 작동 시 인형이 집어지지 않는 경우는 없으나 만약 인형이 없는 곳에서 크레인을 작동 시키는 경우에는 아무런 일도 일어나지 않습니다. 또한 바구니는 모든 인형이 들어갈 수 있을 만큼 충분히 크다고 가정합니다. (그림에서는 화면표시 제약으로 5칸만으로 표현하였음)
 게임 화면의 격자의 상태가 담긴 2차원 배열 board와 인형을 집기 위해 크레인을 작동시킨 위 치가 담긴 배열 moves가 매개변수로 주어질 때, 크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 구하는 프로그램을 작성하세요.
 ▣ 입력설명
 첫 줄에 자연수 N(5<=N<=30)이 주어집니다.
 두 번째 줄부터 N*N board 배열이 주어집니다.
 board의 각 칸에는 0 이상 100 이하인 정수가 담겨있습니다.
 0은 빈 칸을 나타냅니다.
 1 ~ 100의 각 숫자는 각기 다른 인형의 모양을 의미하며 같은 숫자는 같은 모양의 인형을 나 타냅니다.
 board배열이 끝난 다음줄에 moves 배열의 길이 M이 주어집니다.
 마지막 줄에는 moves 배열이 주어집니다.
 moves 배열의 크기는 1 이상 1,000 이하입니다.
 moves 배열 각 원소들의 값은 1 이상이며 board 배열의 가로 크기 이하인 자연수입니다.
 ▣ 출력설명
 첫 줄에 터트려져 사라진 인형의 개수를 출력합니다.
 **

 */
public class EX03Stack {

    public int solution(int[][] board, int[] moves){
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for(int pos : moves){
            for(int i=0; i<board.length; i++){
                if(board[i][pos-1]!=0){
                    int tmp=board[i][pos-1];
                    board[i][pos-1]=0;
                    if(!stack.isEmpty() && tmp==stack.peek()){
                        answer+=2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break;
                }
            }
        }
        return answer;

    }

    public static void main(String[] args){
        EX03Stack T = new EX03Stack();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] board=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]=kb.nextInt();
            }
        }
        int m=kb.nextInt();
        int[] moves=new int[m];
        for(int i=0; i<m; i++) moves[i]=kb.nextInt();
        System.out.println(T.solution(board, moves));
    }
}
