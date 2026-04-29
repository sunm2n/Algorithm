def solution(lottos, win_nums):
    answer = []
    
    result = 0 # 맞은 개수
    count_zero = 0
    
    for i in range(len(lottos)):
        target = lottos[i]
        if target in win_nums:
            result += 1
        if target == 0:
            count_zero += 1
    
    min = result
    max = result + count_zero
    
    if min < 2:
        min = 6
    else:
        min = 7 - min
    
    if max < 2:
        max = 6
    else:
        max = 7 - max
    
    answer.append(max)
    answer.append(min)
        
    return answer