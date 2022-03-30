package code.algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 좌표 정렬
 N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하 세요. 정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.
 ▣ 입력설명
 첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.
 두 번째 줄부터 N개의 좌표가 x, y 순으로 주어집니다. x, y값은 양수만 입력됩니다.
 ▣ 출력설명
 N개의 좌표를 정렬하여 출력하세요.
 ▣ 입력예제 1
 5
 2 7
 1 3
 1 2
 2 5
 3 6
 ▣ 출력예제 1
 1 2
 1 3
 2 5
 2 7
 3 6
 */
public class EX07Sort {

    public String solution(ArrayList<Point>  arr){
        String answer= "";

        Collections.sort(arr);
        for(int i=0; i< arr.size(); i++){
            System.out.println(arr.get(i).x +  " "+ arr.get(i).y);
        }
        return answer;
    }

    public static void main(String[] args){
        EX07Sort T = new EX07Sort();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int x=kb.nextInt();
            int y=kb.nextInt();
            arr.add(new Point(x, y));
        }
        System.out.println(T.solution(arr));

    }

    static class Point implements Comparable<Point>{
        int x;
        int y;
        public Point(int x, int y){
            this.x=x;
            this.y=y;
        }

        @Override
        public int compareTo(Point o) {
           if(this.x==o.x) return this.y-o.y;
           else return this.x-o.x;
        }
    }
}
