def solution(order):
    answer = 0
    
    num = [int(x) for x in str(order)]
    
    for i in range (len(num)):
        if num[i] != 0 and num[i] % 3 == 0:
            answer += 1
    
    return answer