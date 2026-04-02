import sys

N, M = map(int, sys.stdin.readline().strip().split())

arr1 = [""] * N
arr2 = [""] * M

for i in range(N):
    arr1[i] = sys.stdin.readline().strip()


for i in range(M):
    arr2[i] = sys.stdin.readline().strip()

set_arr2 = set(arr2)

ans = [x for x in arr1 if x in set_arr2]

ans.sort()

print(len(ans))
print("\n".join(ans))
