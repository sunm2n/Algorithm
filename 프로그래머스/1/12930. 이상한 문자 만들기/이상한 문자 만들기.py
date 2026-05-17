def solution(s):
    answer = ""
    check_odd = False # 짝수인지 체크
    
    for i in range(len(s)):
        if s[i] == ' ':
            answer += ' '
            check_odd = False
        elif check_odd: # 홀수번째 숫자라면
            answer += s[i].lower()
            check_odd = False
        else: #짝수번째 숫자라면
            answer += s[i].upper()
            check_odd = True
    
    return answer