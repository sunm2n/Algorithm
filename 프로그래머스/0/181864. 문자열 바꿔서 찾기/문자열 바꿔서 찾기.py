def solution(myString, pat):
    answer = 0
    
    reverse_myString = ""
    
    for i in range(len(myString)):
        if(myString[i] =='A'):
            reverse_myString += "B"
        else:
            reverse_myString += "A"
    
    if pat in reverse_myString:
        answer = 1
    
    return answer