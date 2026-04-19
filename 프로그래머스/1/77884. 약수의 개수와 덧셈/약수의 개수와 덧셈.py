def count(n):
    count = 0
    i = 1
    while i * i <= n:
        count += 1
        if i * i != n:
            count += 1
        i += 1
    
    return count
    
        
def solution(left, right):
    answer = 0
    
    for i in range(left, right + 1):
        count_divisor = count(i)
        if count_divisor % 2 == 0:
            answer += i
        else:
            answer -= i
    
    return answer