def solution(num, k):
    answer = -1
    str_num = list(str(num))
    
    for i in range(len(str_num)):
        if str(k) == str_num[i]:
            answer = i + 1
            break;
    
    return answer