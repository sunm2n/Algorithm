import sys
input = sys.stdin.readline

C = int(input())
ans = []

for i in range(C):
    numbers = list(map(int, input().split()))

    scores = numbers[1:]
    avg = sum(scores) / numbers[0]

    person = 0
    for score in scores:
        if score > avg:
            person += 1

    print(f"{((person/numbers[0])) * 100:.3f}%")
    