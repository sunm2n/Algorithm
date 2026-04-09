import sys
input = sys.stdin.readline

n = int(input())
count = 0
sits = [False] * 101

commands = list(map(int, input().split()))

for command in commands:
    if not sits[command]:
        sits[command] = True
    else:
        count += 1

print(count)