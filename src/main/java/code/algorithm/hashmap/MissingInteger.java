package code.algorithm.hashmap;

import java.util.HashSet;
import java.util.Set;
/*
길이 N의 배열 A가 주어진다
A에 포함되어 있지 않은 가장 작은 양의 정수를 구하는 문제이다
A = [1,3,6,4,1,2] -> A에 없는 가장 작은 양의 정수는 5이다
A = [-1,-3] -> A에 없는 가장 작은 양의 정수는 1이다
<p>A = [1,2,3] -&gt; A에 없는 가장 작은 양의 정수는 4이다&nbsp;</p>


This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].

 */

public class MissingInteger {


    public int solution(int[] A) {
        Set<Integer> newset = new HashSet<>();

        for(int x : A){
            newset.add(x);
        }

        for(int i=1; i<Integer.MAX_VALUE ; i++){
            if(!newset.contains(i)) return i;
        }

        return -1;
    }
    public static void main(String[] args) {
        MissingInteger T = new MissingInteger();

        int[] A = {4,1,3,2};
        //int[] A = {4,1,3};

        System.out.println( T.solution(A));
    }
}
