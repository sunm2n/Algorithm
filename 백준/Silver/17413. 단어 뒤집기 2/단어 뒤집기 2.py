import sys
input = sys.stdin.readline

S = input().strip()
stack = []
in_tag = False
result = ""

for char in S:
    if char == "<":
        # 태그가 시작되면 그동안 stack에 쌓인 단어를 뒤집어서 결과에 추가
        while stack:
            result += stack.pop()
        in_tag = True
        result += char

    elif char == ">":
        in_tag = False
        result += char

    elif in_tag:
        # 태그 안에서는 뒤집지 않고 그대로 추가
        result += char

    elif char == " ":
        # 공백을 만나면 그동안 쌓인 단어를 뒤집어서 추가하고 공백도 추가
        while stack:
            result += stack.pop()
        result += " "

    else:
        # 태그 밖의 일반 문자라면 stack에 쌓음
        stack.append(char)

while stack:
    result += stack.pop()

print(result)