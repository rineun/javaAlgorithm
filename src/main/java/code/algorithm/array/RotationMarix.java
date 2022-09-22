package code.algorithm.array;

/**
 * 2차원 배열 회전 Rotate (Java)
 * 행렬 뒤집기
 * --arr1--
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * --arr2--
 * 9 5 1
 * 10 6 2
 * 11 7 3
 * 12 8 4
 */
public class RotationMarix {

    public void Soultion(int n, int m) {
        int num = 1;
        int[][] arr1 = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = num++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==================ROTATION START=====================");

        int[][] temp = new int[arr1.length][arr1[0].length];

        int N = arr1.length;
        for (int k = 0; k < 4; k++) { // 0: 90도/ 1: 180도/ 2: 270도/ 3: 360도
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[0].length; j++) {

                    if (k == 0) { // 90도
                        temp[i][j] = arr1[N - j - 1][i];
                    } else if (k == 1) { // 180도
                        temp[i][j] = arr1[N - i - 1][N - j - 1];
                    } else if (k == 2) { // 270도
                        temp[i][j] = arr1[j][N - i - 1];
                    } else if (k == 3) { // 360도
                        temp[i][j] = arr1[i][j];
                    }
                }
            }



            for (int l = 0; l < temp.length; l++) {
                for (int p = 0; p < temp[l].length; p++) {
                    System.out.print(temp[l][p] + " ");
                }
                System.out.println();
            }
            System.out.println();

            temp = new int[arr1.length][arr1[0].length];
        }

        }
        public static void main (String[]args){
            RotationMarix t = new RotationMarix();
            int n = 5; //행
            int m = 5; //열
            t.Soultion(n, m);
        }
    }
