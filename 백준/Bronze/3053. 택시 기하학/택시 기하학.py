import sys
import math
input = sys.stdin.readline

r = int(input()) # 반지름

print(f"{r * r * math.pi:.6f}")
print(f"{2 * r**2:.6f}")
