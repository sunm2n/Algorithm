import sys
input = sys.stdin.readline

N = int(input())
my_card = set(map(int, input().split()))

M = int(input())
check_cards = list(map(int, input().split()))

result_list = []

for c in check_cards:
    if c in my_card:
        result_list.append("1")
    else:
        result_list.append("0")

print(" ".join(result_list))