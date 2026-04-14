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

    ans_word = []
    while i > 0 and j > 0:
        if word1[i - 1] == word2[j - 1]:
            ans_word.append(word1[i - 1])
            i -= 1
            j -= 1
        else:
            # 문자가 다르면 위쪽과 왼쪽 중 값이 더 큰 쪽으로 이동
            if dp[i - 1][j] > dp[i][j - 1]:
                i -= 1  # 위쪽이 더 크면 위로 이동
            else:
                j -= 1  # 왼쪽이 더 크거나 같으면 왼쪽으로 이동

    if ans_word:
        print("".join(ans_word[::-1]))

lcs()