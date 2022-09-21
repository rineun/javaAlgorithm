package code.algorithm.dfsNbfs;
import java.util.*;

/**
 *문제 설명
 * 네트워크란 컴퓨터 상호 간에 정보를 교환할 수 있도록 연결된 형태를 의미합니다. 예를 들어, 컴퓨터 A와 컴퓨터 B가 직접적으로 연결되어있고, 컴퓨터 B와 컴퓨터 C가 직접적으로 연결되어 있을 때 컴퓨터 A와 컴퓨터 C도 간접적으로 연결되어 정보를 교환할 수 있습니다. 따라서 컴퓨터 A, B, C는 모두 같은 네트워크 상에 있다고 할 수 있습니다.
 *
 * 컴퓨터의 개수 n, 연결에 대한 정보가 담긴 2차원 배열 computers가 매개변수로 주어질 때, 네트워크의 개수를 return 하도록 solution 함수를 작성하시오.
 *
 * 제한사항
 * 컴퓨터의 개수 n은 1 이상 200 이하인 자연수입니다.
 * 각 컴퓨터는 0부터 n-1인 정수로 표현합니다.
 * i번 컴퓨터와 j번 컴퓨터가 연결되어 있으면 computers[i][j]를 1로 표현합니다.
 * computer[i][i]는 항상 1입니다.
 * 입출력 예
 * n	computers	return
 * 3	[[1, 1, 0], [1, 1, 0], [0, 0, 1]]	2
 * 3	[[1, 1, 0], [1, 1, 1], [0, 1, 1]]	1
 *
 */
public class BfsDfsProg {
    public void dfs(int[][] computer, boolean[] visited, int start){
        visited[start] = true;

        for(int i = 0; i < computer[start].length; i++){
            if(visited[i]) continue;
            if(start == i || computer[start][i] != 1) continue;

            visited[i] = true;
            dfs(computer, visited, i);
        }

    }

    public void bfs(int[][] computers, boolean[] visited, int start){
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);
        int L=0;
        while(!queue.isEmpty()){
            int current = queue.poll();
            for(int i = 0; i < computers[start].length; i++){
                if (current != i && computers[current][i] == 1 && !visited[i])
                    queue.offer(i);
                    visited[current] = true;
            }
            L++;
        }
    }

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n]; //방문햇는지 확인하는 visited

        for(int i = 0; i < n; i++){
            if(visited[i]) continue; //방문햇는지 확인하는 visited
            bfs(computers, visited, i); //방문이 되지 않았다면 dfs,bfs
            answer++;  // 하나의 순환구조가 끝남
        }

        return answer;
    }


    public static void main(String[] args) {
        BfsDfsProg t = new BfsDfsProg();
        int n  =3;
        int[][] computer = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

        System.out.println(t.solution(n,computer));
    }
}
