package code.algorithm.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


/**
 * 현수의 아빠는 제과점을
 * 된 K일 동안의 매출액의
 * 만약 N=7이고 7일 간의
 * 20 12 20 10 23 17 10
 * 각 연속 4일간의 구간의
 * 첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류는 3 이다
 * 두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류는 4이다
 * 세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류는 4이다
 * 네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류는 3이다
 * N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별 매출액의 종 류를 출력하는 프로그램을 작성하세요.
 * ▣ 입력설명
 * 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
 * 두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
 * ▣ 출력설명
 * 첫 줄에 각 구간의 매출액 종류를 순서대로 출력합니다.
 * ▣ 입력예제 1
 * 7 4
 * 20 12 20 10 23 17 10
 * ▣ 출력예제 1
 * 3 4 4 3
 */





public class EX03HashMap {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);
            answer.add(HM.size());
            HM.put(arr[lt], HM.get(arr[lt]) - 1);
            if (HM.get(arr[lt]) == 0) HM.remove(arr[lt]);
            lt++;
        }
        return answer;
    }

    public static void main(String[] args){
        EX03HashMap T = new EX03HashMap();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x : T.solution(n, k, arr)) System.out.print(x+" ");
    }

}
