package code.algorithm;

import java.util.*;

public class Coding {


    public String solution(int[] str){
        String answer = "";
        ArrayList<Integer> tmp = new ArrayList<>();
        tmp.add(str[0]);


        for(int i=1; i< str.length; i++){
            if(str[i] > str[i-1]) tmp.add(str[i]);
        }

        for(int x  : tmp){
            answer += x + " ";
        }

        return answer;
    }




    public static void main(String[] args) {
        Coding T = new Coding();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.println(T.solution(arr));

    }
}
