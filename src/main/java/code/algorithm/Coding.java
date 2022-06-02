package code.algorithm;

import java.util.*;

public class Coding {


    public String solution( String str){
        String answer = " ";

        str =  str.replace("#","1").replace("*", "0");

        while (str.length()>0){
            String tmp = str.substring(0,7);
            int rex = Integer.parseInt(tmp,2);
            answer+=(char)rex;
             str =  str.substring(7);
        }

        return answer;
    }




    public static void main(String[] args) {
        Coding T = new Coding();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
      //  char c = kb.next().charAt(0);
       // String str = kb.nextLine();
         //char c = kb.next().charAt(0);

        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i]= sc.next();
        }

        for (String  x :T.solution(n, str)) {
            System.out.println(x);
        }



        for (int x :T.solution(str, c)) {
            System.out.print(x+ " ");
        }       */

       System.out.println(T.solution( str));
    }
}
