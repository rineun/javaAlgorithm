package code.algorithm.array;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * 가위바위보
 *A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 * 예를 들어 N=5이면
 * 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램 을 작성하세요.
 * ▣ 입력설명
 * 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다. 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다. 세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 * ▣ 출력설명
 * 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
 * ▣ 입력예제 1
 * 5
 * 23313
 * 11223
 * ▣ 출력예제 1
 * A
 * B
 * A
 * B
 * D
 *
 */


public class Ex03FindArray {
    public String solution(int n, int[] a, int[] b){
        String answer= "";
        ArrayList<String> tmp = new ArrayList<>();
        for(int i=0; i<a.length; i++ ){
            if(a[i]==b[i])  tmp.add("D");
            else if(a[i]==1 && b[i]==2) tmp.add("B");
            else if(a[i]==2 && b[i]==3) tmp.add("B");
            else if(a[i]==3 && b[i]==1) tmp.add("B");
            else tmp.add("A");
        }

        for (String x: tmp) {
            answer += x+ " ";
        }
        return answer;


    }

    public static void main(String[] args) {
        Ex03FindArray T = new Ex03FindArray();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i]=kb.nextInt();
        }
        System.out.println(T.solution(n, a, b));
    }
}
