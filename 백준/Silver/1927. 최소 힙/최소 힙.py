import sys
import heapq

input = sys.stdin.readline

N = int(input()) # 연산의 수
hq = []

for _ in range(N):

    command = int(input().strip())

    if command == 0:
        if not hq:
            print(0)
        else:
            print(heapq.heappop(hq))

    else:
        heapq.heappush(hq, command)