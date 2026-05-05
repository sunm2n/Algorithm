def solution(n_str):
    answer = ""
    str = list(n_str)
    
    for i in range(len(str)):
        if str[i] != '0':
            str = str[i:]
            break
    
    for i in range(len(str)):
        answer += str[i]
            
    return answer