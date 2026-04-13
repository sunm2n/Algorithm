import sys
from collections import deque

input = sys.stdin.readline

N = int(input())
queue = deque(range(1,N+1))
ans = []

while len(queue) > 1:
    ans.append(queue.popleft())

    queue.append(queue.popleft())

print(*ans, queue[0])