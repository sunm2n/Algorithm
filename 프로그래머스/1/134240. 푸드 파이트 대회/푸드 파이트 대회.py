def solution(food):
    answer = "0"
    str_left = ""
    str_right = ""
    
    for i in range(len(food)):
        while food[i] - 2 >= 0:
            str_left = str_left + str(i)
            str_right = str(i) + str_right
            food[i] = food[i] - 2
    
    answer = str_left + answer + str_right
    
    return answer