import sys
input = sys.stdin.readline

N = int(input())
blue = 0 # 파란색 색종이의 개수, 입력값: 1
white = 0 # 하얀색 색종이의 개수, 입력값: 0

paper = [list(map(int, input().split())) for _ in range(N)]

def check_color(x, y , n):
    global blue, white

    color = paper[x][y] # 첫 번째 칸울 기준 색상으로 지정
    for i in range(x, x + n):
        for j in range(y, y + n):
            if paper[i][j] != color:
                half = n // 2
                check_color(x, y, half) # 제1사분면
                check_color(x + half, y, half) #제2사분면
                check_color(x, y + half, half) #제3사분면
                check_color(x + half, y + half, half) #제4사분면
                return

    #for문에서 조건에 안걸리면 성공
    if color == 0:
        white += 1
    else:
        blue += 1

check_color(0, 0, N) # 처음에는 전체를 돌리기
print(white)
print(blue)