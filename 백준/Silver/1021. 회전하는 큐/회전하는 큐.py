import sys
from collections import deque

input = sys.stdin.readline

n, m = map(int, input().split())
targets = list(map(int, input().split()))

dq = deque(range(1, n + 1))
count = 0

for target in targets:
    target_index = dq.index(target)

    if target_index <= len(dq) // 2:
        dq.rotate(-target_index)
        count += target_index

    else:
        moves = len(dq) - target_index
        dq.rotate(moves)
        count += moves

    dq.popleft()

print(count)
