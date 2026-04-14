import sys
input = sys.stdin.readline

n, m = map(int, input().split())

nums = sorted(list(set(map(int, input().split()))))

ans = []

def dfs(start):
    if len(ans) == m:
        print(*ans)
        return

    for i in range(start, len(nums)):
        ans.append(nums[i])

        dfs(i)

        ans.pop()

dfs(0)