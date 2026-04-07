import sys
input = sys.stdin.readline

T = int(input().strip()) # 테스트 케이스 개수
ans = []

for _ in range(T):
    s = input().strip()

    stack = []
    check = True

    for char in s:
        if char == '(':
            stack.append(char)
        else:
            if stack:
                stack.pop()
            else:
                check = False
                break
    if check and not stack:
        print("YES")
    else:
        print("NO")
