package code.algorithm.hashmap;

import java.util.HashMap;

/**
 *
 * 작은 개구리가 강 건너편으로 건너기를 원한다
 * 개구리는 처음에 0에 위치하고, X+1로 가기를 원한다
 *N개로 구성된 배열 A는 떨어지는 나뭇잎들을 나타내고, A[K]는 K초에 한 나뭇잎의 위치를 나타낸다
 * 목표는 1에서 X까지가는 가장 빠른 시간을 찾는 것이다
 * (즉, 1부터 X까지 모두 건너야한다)
 *
 * <p>X = 5,&nbsp;</p>
 * A = {1,3,1,4,2,3,5,4}
 * A[0] = 1 (1)
 * A[1] = 3 (1,3)
 * A[2] = 1 (1,3)
 * <p>A[3] = 4 (1,3,4)</p>
 * A[4] = 2 (1,2,3,4)
 * <p>A[5] = 3 (1,2,3,4)</p>
 * A[6] = 5 (1,2,3,4,5)
 * -> X =5까지 온 가장 빠른시간은 6초이다
 * A[7] = 4
 * 즉, 정답은 6이다
 */
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
