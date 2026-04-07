import sys
from inspect import stack

input = sys.stdin.readline

N = int(input())

arr = list()

for _ in range(N):
    arr.append(int(input().strip()))

max_high = arr.pop()
count = 1

while arr:
    current = arr.pop()

    if current > max_high:
        max_high = current
        count += 1

print(count)
