package code.algorithm.string;

import java.util.Scanner;

/**
자릿수의 최소수 구하기!

 3425 ->1000
 99 -> 10
 3 -> 0
 */
public class Ex13test {


    private int solution(int N) {
        int answer = 0;
        if (N <= 1)
            return answer;

        int nlength = String.valueOf(N).length();

        while (N > 0) {
            N--;
            if (String.valueOf(N).length() == (nlength - 1)) return ++N;
        }

        return answer;

    }


    public static void main(String[] args) {
        Ex13test T = new Ex13test();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        //String str=kb.next();
        System.out.println(T.solution(n));
    }


}
