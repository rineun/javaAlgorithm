package code.algorithm.hashmap;

import java.util.Arrays;

/**
 *N개의 길이를 가진 배열 A가 주어진다
 * A는 1~N까지 각 요소를 한개씩 모두 가지고 있어야 한다
 * 예를 들면, A = {4,1,3,2}, A의 길이는 4이다
 * 즉, 1,2,3,4의 원소를 가지고 있으니 True이다
 * B = {4,1,3} 이면, 1,2,3의 원소 중 2가 빠져있다 따라서 False이다
 true이면 1, 아니면 0을 출력한다



 * A non-empty array A consisting of N integers is given.
 *
 * A permutation is a sequence containing each element from 1 to N once, and only once.
 *
 * For example, array A such that:
 *
 *     A[0] = 4
 *     A[1] = 1
 *     A[2] = 3
 *     A[3] = 2
 * is a permutation, but array A such that:
 *
 *     A[0] = 4
 *     A[1] = 1
 *     A[2] = 3
 * is not a permutation, because value 2 is missing.
 *
 * The goal is to check whether array A is a permutation.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A, returns 1 if array A is a permutation and 0 if it is not.
 *
 * For example, given array A such that:
 *
 *     A[0] = 4
 *     A[1] = 1
 *     A[2] = 3
 *     A[3] = 2
 * the function should return 1.
 *
 * Given array A such that:
 *
 *     A[0] = 4
 *     A[1] = 1
 *     A[2] = 3
 * the function should return 0.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [1..1,000,000,000].
 *
 *
 */
public class PermCheck {


    public int solution(int[] A) {
        Arrays.sort(A);

        if(A[0] != 1) return 0;

        for(int i=0; i<A.length-1; i++){
            if(A[i+1]-A[i] != 1) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        PermCheck T = new PermCheck();

        int[] A = {4,1,3,2};
        //int[] A = {4,1,3};

        System.out.println( T.solution(A));
    }
}
