package code.algorithm.sort;

import code.algorithm.string.BinaryGap;

import java.util.Scanner;

/**
 * An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place.
 * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
 *
 * The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
 *
 * Write a function:
 *
 * class Solution { public int[] solution(int[] A, int K); }
 *
 * that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
 *
 * For example, given
 *
 *     A = [3, 8, 9, 7, 6]
 *     K = 3
 * the function should return [9, 7, 6, 3, 8]. Three rotations were made:
 *
 *     [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
 *     [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
 *     [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
 * For another example, given
 *
 *     A = [0, 0, 0]
 *     K = 1
 * the function should return [0, 0, 0]
 *
 * Given
 *
 *     A = [1, 2, 3, 4]
 *     K = 4
 * the function should return [1, 2, 3, 4]
 *
 * Assume that:
 *
 * N and K are integers within the range [0..100];
 * each element of array A is an integer within the range [−1,000..1,000].
 * In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */

public class RotationArr {


    public int[] solution(int[] A, int K) {
        int size = A.length;
        for(int j=0;j <K; j++){
            int tmp = A[size-1];
            for(int i=size-1; i>0; i--){
                A[i] = A[i-1];
            }
            A[0] = tmp;

        }

        return A;
    }


    public static void main(String[] args) {
        RotationArr T = new RotationArr();
        Scanner kb = new Scanner(System.in);
        //int n = kb.nextInt();
        //String str=kb.next();
        int [] n  = {3, 8, 9, 7, 6};
        int K =3;
        System.out.println(T.solution(n, K));
    }
}
