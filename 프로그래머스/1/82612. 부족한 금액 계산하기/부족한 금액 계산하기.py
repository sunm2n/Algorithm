def solution(price, money, count):
    answer = money
    
    for i in range(1, count + 1):
        answer = answer - (i * price)
    
    if answer >= 0:
        answer = 0
    else:
        answer = -answer
    return answer