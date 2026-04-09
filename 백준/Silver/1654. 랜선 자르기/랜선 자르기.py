import sys

input = sys.stdin.readline

k, n = map(int, input().split())
lans = [int(input()) for _ in range(k)]

start, end = 1, max(lans)

result = 0

while start <= end:
    mid = (start + end) // 2

    count = 0
    for x in lans:
        count += x // mid

    if count >= n:
        result = mid
        start = mid + 1

    else:
        end = mid - 1

print(result)