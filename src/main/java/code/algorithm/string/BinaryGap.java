package code.algorithm.string;

import java.util.Scanner;

/**
 *
 * BinaryGap 2진수로 변환했을때 1과 1 사이의 연속적인 0의 길이가 긴 길이를 리턴

 *
 * * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
 *
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
 *
 * Write a function:
 *
 * class Solution { public int solution(int N); }
 *
 * that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
 *
 * For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..2,147,483,647].
 *
 *
 */
public class BinaryGap {
    public int solution(int N) {
        String binaryNum = Integer.toBinaryString(N);
        int answer = 0;
        boolean chk = false;
        int cnt = 0;

        for(int x=1; x<binaryNum.length(); x++){
            int target = Character.getNumericValue(binaryNum.charAt(x));
            if(target == 1){
                chk =true;
                cnt =0;
            }else{
                cnt++;
                answer = Math.max(cnt, answer);
            }
        }

        if(!chk){
            answer = 0;
        }

        return answer;
    }


    public static void main(String[] args) {
        BinaryGap T = new BinaryGap();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        //String str=kb.next();
        System.out.println(T.solution(n));
    }
}
