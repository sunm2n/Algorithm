import sys

input = sys.stdin.readline

N, M = map(int, input().split())

numbers = sorted(list(map(int, input().split())))

ans = []
visited = [False] * N


def dfs():
    if len(ans) == M:
        print(*ans)
        return

    last_number = 0

    for i in range(N):
        if not visited[i] and numbers[i] != last_number:
            visited[i] = True
            ans.append(numbers[i])
            last_number = numbers[i]

            dfs()

            ans.pop()
            visited[i] = False

dfs()