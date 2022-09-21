package code.algorithm.array;

import java.util.HashMap;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        int answer = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        int size = A.length;

        for(int j=1; j<= X; j++){
            map.put(j,1);
        }


        for(int i=0; i<A.length; i++){
            if(map.containsKey(A[i])){
                map.remove(A[i]);
                if(map.isEmpty()) return i;
            }

        }

        return answer;



    }

    public static void main(String[] args) {
        FrogRiverOne T = new FrogRiverOne();

        int[] A = {1,3,1,4,2,3,5,4};
        //int[] A = {2};
        //int[] A = {1,2,3,4};
        System.out.println( T.solution(5,A));
    }
}
