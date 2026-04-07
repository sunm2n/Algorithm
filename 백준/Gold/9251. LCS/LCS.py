import sys

input = sys.stdin.readline


def lcs():

    word1 = input().strip()
    word2 = input().strip()

    len1, len2 = len(word1), len(word2)

    dp = [[0] * (len2 + 1) for _ in range(len1 + 1)]

    for i in range(1, len1 + 1):
        for j in range(1, len2 + 1):
            if word1[i - 1] == word2[j - 1]:
                # 문자가 같으면 대각선 왼쪽 위의 값 + 1
                dp[i][j] = dp[i - 1][j - 1] + 1
            else:
                # 문자가 다르면 왼쪽과 위쪽 값 중 더 큰 값 선택
                dp[i][j] = max(dp[i - 1][j], dp[i][j - 1])

    print(dp[len1][len2])

lcs()