def solution(s):
    answer = s
    
    words = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    
    for i in range(len(words)):
        answer = answer.replace(words[i], str(i))
    
    return int(answer)