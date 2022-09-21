package code.algorithm.dfsNbfs;

import java.util.*;

/**
 *
 *
 *
 *
 * 여행경로
 * 문제 설명
 * 주어진 항공권을 모두 이용하여 여행경로를 짜려고 합니다. 항상 "ICN" 공항에서 출발합니다.
 *
 * 항공권 정보가 담긴 2차원 배열 tickets가 매개변수로 주어질 때, 방문하는 공항 경로를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * 모든 공항은 알파벳 대문자 3글자로 이루어집니다.
 * 주어진 공항 수는 3개 이상 10,000개 이하입니다.
 * tickets의 각 행 [a, b]는 a 공항에서 b 공항으로 가는 항공권이 있다는 의미입니다.
 * 주어진 항공권은 모두 사용해야 합니다.
 * 만일 가능한 경로가 2개 이상일 경우 알파벳 순서가 앞서는 경로를 return 합니다.
 * 모든 도시를 방문할 수 없는 경우는 주어지지 않습니다.
 * 입출력 예
 * tickets	return
 * [["ICN", "JFK"], ["HND", "IAD"], ["JFK", "HND"]]	["ICN", "JFK", "HND", "IAD"]
 * [["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"], ["ATL", "ICN"], ["ATL","SFO"]]	["ICN", "ATL", "ICN", "SFO", "ATL", "SFO"]
 * 입출력 예 설명
 * 예제 #1
 *
 * ["ICN", "JFK", "HND", "IAD"] 순으로 방문할 수 있습니다.
 *
 * 예제 #2
 *
 * ["ICN", "SFO", "ATL", "ICN", "ATL", "SFO"] 순으로 방문할 수도 있지만 ["ICN", "ATL", "ICN", "SFO", "ATL", "SFO"] 가 알파벳 순으로 앞섭니다.
 *
 */


public class TravelDfs {

    // 들어온 문자열을 오름차순으로 정렬해주기 위해 PriorityQueue를 만들었다.
    private PriorityQueue<String> pq = new PriorityQueue<>();
    // 요건 dfs에서 지나간 배열을 다시 들르게 하지 않기 위한 플래그이다.
    private boolean[] visited;


    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        // 처음 출발은 무조건 "ICN"공항에서 출발한다기에 그냥 값으로 못박아버렸다.
        dfs(tickets, "ICN", 0, "ICN");
        // PriorityQueue에 들어온 값들 중 처음 값이 최적 경로이므로 첫 값을 배열로 넣었다.
        String[] answer = pq.peek().split(",");
        return answer;

    }

    public void dfs(String[][] tickets, String currentCity, int cnt, String path){
        // 5. count가 tickets.length와 같으면 모든 배열을 순회한 것이므로
        if(cnt== tickets.length){
            // 6. pq에 전체 여행 경로를 추가
            pq.add(path);
            return;
        }

        for(int i=0; i<tickets.length; i++){
            // 1. 간 적이 없고 && 현재 도시가 다음 여행 경로의 도착지라면
            if(!visited[i] && currentCity.equals(tickets[i][0])){
                // 2. 갔다고 체크
                visited[i] = true;
                // 3. 그 다음 경로 탐색
                System.out.println(path  + " | " + tickets[i][1] );
                dfs(tickets, tickets[i][1], cnt+1, path + ","+tickets[i][1]);
                // 4. 모든 배열을 순회했으면, 플래그를 초기화
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        TravelDfs t = new TravelDfs();
        //String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};

        for (String ticket : t.solution(tickets)) {
            System.out.println("ticket = " + ticket);
        }

    }
}
