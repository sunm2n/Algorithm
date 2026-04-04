import sys
from collections import deque
input = sys.stdin.readline

n, k = map(int, input().split())

queue = deque(range(1, n+1))
ans = []

while queue:
    for _ in range(k - 1):
        queue.append(queue.popleft()) # K-1 명의 사람을 큐의 맨 앞에서 빼서 맨 뒤로 보내기

    ans.append(str(queue.popleft())) # K번째 사람을 큐에서 완전히 제거하고 결과 리스트에 추가

print("<" + ", ".join(ans) + ">")
