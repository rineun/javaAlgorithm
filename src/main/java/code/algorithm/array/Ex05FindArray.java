package code.algorithm.array;


import java.util.Scanner;

/**
 * 소수(에라토스테네스 체)
 *  자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요. 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다. 제한시간은 1초입니다.
 * ▣ 입력설명
 * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 * ▣ 출력설명
 * 첫 줄에 소수의 개수를 출력합니다.
 * ▣ 입력예제 1
 * 20
 * ▣ 출력예제 1
 * 8
 */
public class Ex05FindArray {

    public boolean isPrime(int n){
        if(n==1) return false;
        if(n==2) return true;

        for(int i=2; i<=(int)Math.sqrt(n); i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    public int solution(int n){
        int answer= 0;
        for(int i=1; i<=n; i++){
            if(isPrime(i)) answer++;
        }
        return answer;


    }

    public static void main(String[] args) {
        Ex05FindArray T = new Ex05FindArray();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();

        System.out.println(T.solution(n));
    }
}
