package code.algorithm.array;


import java.util.Scanner;

/**
 * 임시반장 정하기
 * 김갑동 선생님은 올해 6학년 1반 담임을 맡게 되었다. 김갑동 선생님은 우선 임시로 반장을 정하고 학생들이 서로 친숙해진 후에 정식으로 선거를 통해 반장을 선출하려고 한다. 그는 자 기반 학생 중에서 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이었던 사람이 가장 많 은 학생을 임시 반장으로 정하려 한다.
 * 그래서 김갑동 선생님은 각 학생들이 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 표 를 만들었다. 예를 들어 학생 수가 5명일 때의 표를 살펴보자.
 * [쉽게 배우는 알고리즘 문제풀이]
 *   임시반장 정하기
 * 위 경우에 4번 학생을 보면 3번 학생과 2학년 때 같은 반이었고, 3번 학생 및 5번 학생과 3학 년 때 같은 반이었으며, 2번 학생과는 4학년 때 같은 반이었음을 알 수 있다. 그러므로 이 학 급에서 4번 학생과 한번이라도 같은 반이었던 사람은 2번 학생, 3번 학생과 5번 학생으로 모
 * 두 3명이다. 임시 반장이 각 학생들이 성하시오.
 * 이 예에서 4번 학생이 전체 학생 중에서 같은 반이었던 학생 수가 제일 많으므로 된다.
 * 1학년부터 5학년까지 속했던 반이 주어질 때, 임시 반장을 정하는 프로그램을 작
 * ▣ 입력설명
 * 첫째 줄에는
 * 째 줄부터는
 * 타내는 5개의 정수가 빈칸 하나를 사이에 두고 주어진다. 주어지는 정수는 모두 1 이상 9 이 하의 정수이다.
 * 반의 학생 수를 나타내는 정수가 주어진다. 학생 수는 3 이상 1000 이하이다. 둘 1번 학생부터 차례대로 각 줄마다 1학년부터 5학년까지 몇 반에 속했었는지를 나
 * ▣ 출력설명
 * 첫 줄에 임시 반장으로 정해진 학생의 번호를 출력한다. 단, 임시 반장이 될 수 있는 학생이 여러 명인 경우에는 그 중 가장 작은 번호만 출력한다.
 * ▣ 입력예제 1
 * 5
 * 23173
 * 41968
 * 55244
 * 65267
 * 84222
 *
 * 출력1
 * 4
 */

public class Ex11FindArray {

    public int solution(int n, int[][] num){
        int answer= 0, max=0;

        for (int i=1; i<n; i++){
            int cnt=0;
            for(int j=1; j<n; j++) {
                for(int k=1; k<=5; k++){
                    if(num[i][k] == num[j][k] ){
                        cnt++;
                        break;
                    }
                }
                if(cnt> max){
                    max=  cnt;
                    answer=i;
                }

            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Ex11FindArray T = new Ex11FindArray();
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
