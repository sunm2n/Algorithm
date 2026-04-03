import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

N, M = map(int, input().split())

count = 0
visited = [False] * (N + 1)

graph = [[] for _ in range(N + 1)]
for i in range(M):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

def dfs(node):
    visited[node] = True

    for next_node in graph[node]:
        if not visited[next_node]:
            dfs(next_node)

for i in range(1, N + 1):
    if not visited[i]:
        dfs(i)
        count += 1

print(count)
