def solution(box, n):
    
    max_width = box[0] // n # 들어갈수 있는 최대 가로 길이
    max_length = box[1] // n # 들어갈수 있는 최대 세로 길이
    max_high = box[2] // n # 들어갈수 있는 최대 높이
    
    answer = max_width * max_length * max_high
    
    return answer