package code.algorithm.calulate;

/**
 * 주어진 범위내에서 어떤 정수 값으로 나누어 떨어지는 수의 개수를 구하면 되는 문제다
 *
 * class Solution { public int solution(int A, int B, int K); }
 *
 * that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:
 *
 * { i : A ≤ i ≤ B, i mod K = 0 }
 *
 * For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * A and B are integers within the range [0..2,000,000,000];
 * K is an integer within the range [1..2,000,000,000];
 * A ≤ B.
 *
 */
public class CountDiv {

    public int solution(int A, int B, int K) {
        if(A%K ==0) return B/K - A/K + 1;
        return B/K - A/K ;
    }

    public static void main(String[] args) {
        CountDiv T = new CountDiv();

        int[] A = {2,3,1,5};
        //int[] A = {2};
        //int[] A = {1,2,3,4};
        System.out.println(T.solution(6,11,2));
    }
}
