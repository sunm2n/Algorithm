import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;
import java.util.Collections; 

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        Set<String> uniqueReports = new HashSet<>(Arrays.asList(report));

        // 2. [신고 내역 집계] 필요한 자료구조를 2개 선언합니다.
        
        // Key: 신고당한 유저, Value: 신고당한 횟수
        // (예: {"frodo": 2, "neo": 2, "muzi": 1})
        Map<String, Integer> reportedCount = new HashMap<>();

        // Key: 신고한 유저, Value: 그 유저가 신고한 사람들의 Set
        // (예: {"muzi": {"frodo", "neo"}, "apeach": {"frodo", "muzi"}, ...})
        Map<String, Set<String>> reportLog = new HashMap<>();

        // 3. [1차 순회] 중복 제거된 신고 내역을 순회하며 맵(Map) 2개를 채웁니다.
        for (String rep : uniqueReports) {
            String[] parts = rep.split(" ");
            String reporter = parts[0]; // 신고한 사람
            String reported = parts[1]; // 신고당한 사람

            // 3-1. '신고한 사람' -> '신고당한 목록'을 기록 (reportLog)
            // .putIfAbsent : 해당 키(reporter)가 맵에 없으면 새 HashSet을 생성해 넣음
            reportLog.putIfAbsent(reporter, new HashSet<>());
            reportLog.get(reporter).add(reported);

            // 3-2. '신고당한 사람'의 횟수를 1 증가 (reportedCount)
            // .getOrDefault : 해당 키(reported)가 맵에 없으면 0을 반환, 있으면 현재 값을 반환
            reportedCount.put(reported, reportedCount.getOrDefault(reported, 0) + 1);
        }

        // 4. [정지 유저 확정] k번 이상 신고당한 유저 목록(bannedUsers)을 만듭니다.
        // (예: k=2 라면, "frodo", "neo"가 이 Set에 들어감)
        Set<String> bannedUsers = new HashSet<>();
        for (Map.Entry<String, Integer> entry : reportedCount.entrySet()) {
            if (entry.getValue() >= k) {
                bannedUsers.add(entry.getKey());
            }
        }

        // 5. [메일 발송] id_list를 순서대로 순회하며 메일 받을 횟수를 계산합니다.
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i]; // "muzi", "frodo", "apeach", "neo" 순서

            // 5-1. 이 유저(user)가 신고한 목록을 가져옵니다.
            // (주의!) "neo"처럼 신고한 내역이 아예 없는 유저도 있으므로,
            // getOrDefault를 사용해 null이 아닌 빈 Set(Collections.emptySet())을 가져옵니다.
            Set<String> reportedByMe = reportLog.getOrDefault(user, Collections.emptySet());

            int mailCount = 0;
            // 5-2. 내가 신고한 목록(reportedByMe)을 하나씩 보면서
            for (String reportedPerson : reportedByMe) {
                // 5-3. 그 사람이 정지 명단(bannedUsers)에 포함되어 있는지 확인합니다.
                if (bannedUsers.contains(reportedPerson)) {
                    mailCount++; // 포함되어 있다면 메일 카운트 증가
                }
            }
            
            // 5-4. 최종 메일 횟수를 answer 배열의 알맞은 위치에 저장합니다.
            answer[i] = mailCount;
        }

        return answer;
    }
}