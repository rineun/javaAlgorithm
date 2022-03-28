package code.algorithm.topoint;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 공통원소 구하기
 A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로 그램을 작성하세요.
 ▣ 입력설명
 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다. 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다. 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
 ▣ 출력설명
 두 집합의 공통원소를 오름차순 정렬하여 출력합니다.

 ▣ 입력예제 1 5

 5
 1 3 9 5 2
 5
 3 2 5 7 8

 ▣ 출력예제 1
 2 3 5
 */

public class Ex02ToPointSliding {
    public String solution(int n, int m, int[] a, int[] b) {
        String answer ="";
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);

        int p1=0, p2=0;
        while (p1<n && p2<m){
            if(a[p1] == b[p2]){
                arrayList.add(a[p1++]);
                p2++;
            }else if(a[p1] > b[p2]){
                p2++;
            }else p1++;
        }

        for (int x: arrayList) {
            answer+= x+" ";
        }

        return answer;


    }

    public static void main(String[] args) {
        Ex02ToPointSliding T = new Ex02ToPointSliding();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }
        int m=kb.nextInt();
        int[] b=new int[m];
        for(int i=0; i<m; i++){
            b[i]=kb.nextInt();
        }
        System.out.println(T.solution(n, m, a, b));
    }
}
