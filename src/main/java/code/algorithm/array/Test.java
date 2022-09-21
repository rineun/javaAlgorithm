package code.algorithm.array;

import java.util.Arrays;

public class Test {
/*
    public int solution(int[] A) {

        Arrays.sort(A);

        for(int i=0; i<A.length; i++){
            if(i+1 != A[i]) return i+1;
        }

        return A.length+1;
    }
    */
    public boolean solution(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (i + 1 != A[i]) {
                System.out.println("i = " + i);
                System.out.println("1:" + A[i] + " | 2 : "+ A[i + 1]);
                return false;
            }
        }
        if (A[0] != 1 && A[n - 1] != K)
            return false;
        else
            return true;
    }


    public static void main(String[] args) {
        Test T = new Test();


        int[] A = {1,1,2,3,3};
        int k =3;
        System.out.println(T.solution(A, k));
    }

}
