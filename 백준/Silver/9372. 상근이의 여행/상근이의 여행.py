import sys
input = sys.stdin.readline

# 최소 신장 트리(MST)의 기본 성질 이용한 풀이

for _ in range(int(input())):
    N, M = map(int, input().split())
    for _ in range(M):
        input()
    print(N - 1)