import math

def get_lcm(a, b):
    if a == 0 or b == 0: return 0
    return abs(a * b) // math.gcd(a, b)

def solution(signals):
    answer = -1

    total_gap = []
    for s in signals:
        total_gap.append(sum(s))
    
    current_lcm = total_gap[0]
    for i in range(1, len(total_gap)):
        current_lcm = get_lcm(current_lcm, total_gap[i])
    
    arr = [[False] * current_lcm for _ in range(len(signals))]
    
    for i in range(len(total_gap)):
        for j in range(signals[i][0], current_lcm, total_gap[i]):
            for k in range(j, j + signals[i][1]):
                if k < current_lcm:
                    arr[i][k] = True
    
    for i in range(current_lcm):
        if all(row[i] for row in arr):
            answer = i
            break

    if answer == -1:
        return -1
    else:
        return answer + 1