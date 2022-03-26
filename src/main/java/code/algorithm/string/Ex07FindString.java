package code.algorithm.string;
import java.util.Scanner;

/**
 * 회문문자열
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력 하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 * ▣ 입력설명
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 * ▣ 출력설명
 * 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
 * ▣ 입력예제 1
 * gooG
 * ▣ 출력예제 1
 * YES
 */
public class Ex07FindString {


    private String Solution(String str) {
        String answer="YES";
        str =str.toUpperCase();
        int len = str.length()-1;
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(len-i)) {
                answer= "NO";
                break;
            }

        }

        return answer;
    }

    private String Solution2(String str) {
        String answer="YES";
        str = str.toUpperCase();
        String reversStr = new StringBuilder(str).reverse().toString();
        if(!reversStr.equals(str)) answer = "NO";


        return answer;
    }

    public static void main(String[] args) {
        Ex07FindString T = new Ex07FindString();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.Solution2(s));


    }

}
