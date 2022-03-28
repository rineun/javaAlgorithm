package code.algorithm.array;


import java.util.Scanner;

/**
 * 격자판 최대합
 *
 * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
 * [쉽게 배우는 알고리즘 문제풀이]

 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합 니다.
 * ▣ 입력설명
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는 다.
 * ▣ 출력설명 최대합을 출력합니다.
 * ▣ 입력예제 1
 * 5
 * 10 13 10 12 15
 * 12 39 30 23 11
 * 11 25 50 53 15
 * 19 27 29 37 27
 * 19 13 30 13 19
 * ▣ 출력예제 1
 * 155
 */

public class Ex09FindArray {



    public int solution(int n, int[][] num){
        int answer= 0;
        int sum1=0;
        int sum2=0;

        for (int i=0; i<n; i++){
            sum1=sum2=0;
            for(int j=0; j<n; j++){
                sum1 += num[i][j]; //행
                sum2 += num[j][i]; //열
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1=sum2=0;
        for (int i=0; i<n; i++){
            sum1 += num[i][i];  //대각선
            sum2 += num[i][n-i-1];
        }

        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum1);

        return answer;
    }

    public static void main(String[] args) {
        Ex09FindArray T = new Ex09FindArray();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(n, arr));
    }
}
