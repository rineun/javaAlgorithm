package code.algorithm.string;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 가장 짧은 문자거리
 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출 력하는 프로그램을 작성하세요.
 ▣ 입력설명
 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다. 문자열의 길이는 100을 넘지 않는다.
 ▣ 출력설명
 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 ▣ 입력예제 1
 teachermode e
 ▣ 출력예제 1
 10121012210
 */
public class Ex10FindString {


    private String Solution(String s, char t) {
        System.out.println("s = " + s);
        System.out.println("t = " + t);
        String answer="";
        int[] tmp =new int[s.length()];
        int p=1000;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == t){
                p=0;
                tmp[i] =p;
            }else{
                p++;
                tmp[i] =p;
            }
        }

        p=1000;
        for(int j=s.length()-1; j>=0; j--){
            if(s.charAt(j)== t){
                p=0;
                tmp[j] =0;
            }else{
                p++;
                tmp[j] = Math.min(tmp[j], p);
            }
        }

        for(int x : tmp){
            answer +=x+ " ";
        }


        return answer;

    }


    public static void main(String[] args) {
        Ex10FindString T = new Ex10FindString();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        char c=kb.next().charAt(0);
        System.out.println(T.Solution(str, c));


    }

}
