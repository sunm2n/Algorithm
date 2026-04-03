import sys
input = sys.stdin.readline

total_price = int(input())

for _ in range(9):
    book_price = int(input())
    total_price -= book_price

print(total_price)
