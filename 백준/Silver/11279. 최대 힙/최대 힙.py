import sys
import heapq

input = sys.stdin.readline

N = int(input())
heap = []
ans = list()

for _ in range(N):
    num = int(input())
    if num == 0:
        if not heap:
            ans.append(0)
        else:
            ans.append(- heapq.heappop(heap))

    else:
        heapq.heappush(heap, -num)

print(*ans, sep='\n')

