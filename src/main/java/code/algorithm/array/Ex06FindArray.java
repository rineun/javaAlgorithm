package code.algorithm.array;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *뒤집은 소수
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하 는 프로그램을 작성하세요. 예를 들어 32를 뒤집으면 23이고, 23은 소수이다.
 * 그러면 23을 출 력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다. 첫 자리부터의 연속된 0은 무시한다.
 * ▣ 입력설명
 * 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다. 각 자연수의 크기는 100,000를 넘지 않는다.
 * ▣ 출력설명
 * 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
 * ▣ 입력예제 1
 * 9
 * 32 55 62 20 250 370 200 30 100
 * ▣ 출력예제 1
 * 23 2 73 2 3
 */

public class Ex06FindArray {



    public String solution(int n, int[] num){
        String answer= "";
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<num.length; i++){
            int renum =Integer.parseInt(new StringBuilder(String.valueOf(num[i])).reverse().toString());
            if(isPrime(renum)) arrayList.add(renum);
        }

        for (int x :arrayList){
            answer+= String.valueOf(x) + " ";
        }
        return answer;
    }

    public String solution2(int n, int[] arr){
        ArrayList<Integer> arrayList = new ArrayList<>();
        String answer = "";
        for(int i=0; i<n; i++){
            int tmp = arr[i];
            int res=0;
            while (tmp>0){
                int t = tmp%10;
                res = res*10 +t;
                tmp = tmp/10;
            }
            if(isPrime(res)) arrayList.add(res);
        }
        for (int x :arrayList){
            answer+= String.valueOf(x) + " ";
        }
        return answer;

    }

    private boolean isPrime(int n) {
        if(n==1) return false;
        if(n==2) return true;
        for(int i=2; i< (int)Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Ex06FindArray T = new Ex06FindArray();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }

        System.out.println(T.solution2(n, arr));
    }
}
