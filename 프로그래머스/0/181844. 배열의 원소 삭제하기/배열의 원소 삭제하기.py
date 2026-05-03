def solution(arr, delete_list):
    answer = []
    
    set_delete_list = set(delete_list)
    
    for i in range(len(arr)):
        if arr[i] not in set_delete_list:
            answer.append(arr[i])
        
    
    return answer