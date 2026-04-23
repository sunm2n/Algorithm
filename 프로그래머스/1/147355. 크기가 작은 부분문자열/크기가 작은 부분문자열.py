def solution(t, p):
    answer = 0
    p = int(p)
    
    for i in range(len(t) - len(str(p)) + 1):
        target = t[i:i+len(str(p))]
        target = int(target)
        if p >= target:
            answer += 1
    
    return answer