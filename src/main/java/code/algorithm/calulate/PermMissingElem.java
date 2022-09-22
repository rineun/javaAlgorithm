package code.algorithm.calulate;

import java.util.Arrays;

/**
 *
 *
 * 길이가 N, 요소가 [1..(N + 1)] 의 숫자로 채워져있는 배열에서 빠진 숫자를 찾는 문제이다.
 *
 *
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 *
 * Your goal is to find that missing element.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A, returns the value of the missing element.
 *
 * For example, given array A such that:
 *
 *   A[0] = 2
 *   A[1] = 3
 *   A[2] = 1
 *   A[3] = 5
 * the function should return 4, as it is the missing element.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 *
 */
public class PermMissingElem {

    public int solution(int[] A) {

        Arrays.sort(A);

        for(int i=0; i<A.length; i++){
            if(i+1 != A[i]) return i+1;
        }

        return A.length+1;
    }

    public static void main(String[] args) {
        PermMissingElem T = new PermMissingElem();

        int[] A = {2,3,1,5};
        //int[] A = {2};
        //int[] A = {1,2,3,4};
        System.out.println(T.solution(A));
    }
}
