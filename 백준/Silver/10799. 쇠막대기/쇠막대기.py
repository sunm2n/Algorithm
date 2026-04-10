import sys
input = sys.stdin.readline().strip()
stack = []
ans = 0

for i in range(len(input)):
    if input[i] == '(':
        stack.append('(')
    else:
        # 일단 짝을 맞추기 위해 pop
        stack.pop()

        if input[i - 1] == '(':
            # 바로 앞이 '('라면 레이저
            # 현재 쌓여있는 막대기 개수만큼 조각 추가
            ans += len(stack)
        else:
            # 바로 앞도 ')'라면 막대기의 끝
            # 막대기 하나의 끝부분 조각 1개 추가
            ans += 1

print(ans)