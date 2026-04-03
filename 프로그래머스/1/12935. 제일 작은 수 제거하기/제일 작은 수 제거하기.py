def solution(arr):
    
    if len(arr) <= 1:
        return [-1]
    
    min = arr[0]
    
    for i in range(len(arr)):
        if min > arr[i]:
            min = arr[i]
    
    answer = list()
    for i in range(len(arr)):
        if not arr[i] == min:
            answer.append(arr[i])
    
   
    return answer