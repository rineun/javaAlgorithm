package code.algorithm.string;
import java.util.Scanner;

/**
 * 문자열 압축
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시 오. 단 반복횟수가 1인 경우 생략합니다.
 * ▣ 입력설명
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 * ▣ 출력설명
 * 첫 줄에 압축된 문자열을 출력한다.
 * ▣ 입력예제 1
 * KKHSSSSSSSE
 * ▣ 출력예제 1
 * K2HS7E
 */
public class Ex11FindString {


    private String Solution(String str) {
        String answer="";
        str += " ";
        int cnt=1;

        for (int i=0; i< str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1) ){
                cnt++;
            }else{
                answer+=str.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt);
                cnt=1;
            }
        }

        return answer;

    }


    public static void main(String[] args) {
        Ex11FindString T = new Ex11FindString();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();

        System.out.println(T.Solution(str));


    }

}
