def solution(age):
    answer = ''
    
    arr = [int(x) for x in str(age)]
    
    for i in range(len(arr)):
        answer += chr(arr[i] + 97) # 소문자 a는 아스키코드 값 97
    
    return answer