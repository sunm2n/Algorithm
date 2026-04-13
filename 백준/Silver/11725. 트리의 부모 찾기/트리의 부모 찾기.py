import sys
from collections import deque
input = sys.stdin.readline

N = int(input())

graph = [[] for _ in range(N + 1)]

for _ in range(N - 1):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

parents = [0] * (N + 1)


def bfs():
    queue = deque([1])
    parents[1] = 1

    while queue:
        current = queue.popleft()

        for next_node in graph[current]:
            if parents[next_node] == 0:
                parents[next_node] = current
                queue.append(next_node)

bfs()

for i in range(2, N + 1):
    print(parents[i])