def solution(my_string, num1, num2):
    answer =""
    str = list(my_string)
    
    str[num1], str[num2] = str[num2], str[num1]
    
    for i in range(len(str)):
        answer += str[i]
    
    return answer