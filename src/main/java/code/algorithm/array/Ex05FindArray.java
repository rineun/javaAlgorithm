package code.algorithm.array;


import java.util.Scanner;


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
