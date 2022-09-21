package code.algorithm.dynamic;

/**
 *
 *
 * . dp[1][2] = dp[1][1] + dp[0][2];
 *
 */
public class SchollWalk {

    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int [][]  dp = new int[n+1][m+1];
        int div = 1000000007;
        dp[1][1] =1;

        //웅덩이 초기화
        for(int i=0; i<puddles.length; i++){
            int x = puddles[i][1];
            int y = puddles[i][0];

            dp[x][y] = -1;
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(dp[i][j] == -1){
                    dp[i][j] = 0;
                    continue;
                }


                if(!(i==1 && j==1)){
                    int left = 0;
                    int up =0;
                    //왼쪽
                    if(j>1) left = dp[i][j-1];
                    //위
                    if(i>1) up = dp[i-1][j];

                    dp[i][j] = (left + up ) %div;
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        SchollWalk T = new SchollWalk();
        int m=4;
        int n=3;
        int[][] puddles={{2,2}};
        System.out.println(T.solution(m,n,puddles));

    }
}
