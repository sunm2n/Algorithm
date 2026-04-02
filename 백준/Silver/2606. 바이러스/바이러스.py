import sys
input = sys.stdin.readline

computer = int(input())
link = int(input())

visited = [False] * (computer + 1)
count = 0

graph = [[] for _ in range(computer + 1)]

for _ in range(link):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)


def dfs(node):
    global count
    visited[node] = True
    count += 1

    for next_node in graph[node]:
        if not visited[next_node]:
            dfs(next_node)

dfs(1)
print(count - 1)
