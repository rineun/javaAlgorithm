package code.algorithm.string;

/**
 *
 * 대소문자 변환
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 * ▣ 입력설명
 * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다. 문자열은 영어 알파벳으로만 구성되어 있습니다.
 * ▣ 출력설명
 * 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 * ▣ 입력예제 1
 * StuDY
 * ▣ 출력예제 1
 * sTUdy
 */

import java.util.Scanner;

public class Ex02FindString {


    private String soultion(String str) {
        String answer ="";
        for (char x:str.toCharArray()) {
            //if(Character.isLowerCase(x)) answer+= Character.toUpperCase(x);
            //else answer+=Character.toLowerCase(x);

            if(x>=97 && x<=122) answer+=(char)(x-32);
            else answer+=(char)(x+32);

        }
        return answer;
    }


    public static void main(String[] args) {
        Ex02FindString T = new Ex02FindString();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.soultion(str));


    }

}
