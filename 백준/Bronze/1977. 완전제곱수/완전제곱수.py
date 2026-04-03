import math
import sys
input = sys.stdin.readline

N = int(input())
M = int(input())

arr = []
total = 0

for i in range(N, M+1):
    ans = math.sqrt(i)

    if ans == int(ans):
        total += i
        arr.append(i)

if total == 0:
    print(-1)
else:
    print(sum(arr))
    print(arr[0])

