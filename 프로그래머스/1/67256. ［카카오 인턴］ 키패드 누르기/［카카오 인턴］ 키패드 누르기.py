def solution(numbers, hand):
    answer = ''
    
    keypad = {
    1: (0, 0), 2: (0, 1), 3: (0, 2),
    4: (1, 0), 5: (1, 1), 6: (1, 2),
    7: (2, 0), 8: (2, 1), 9: (2, 2),
    '*':(3, 0), 0: (3, 1), '#':(3, 2) 
    }
    
    left_dx, left_dy = 3, 0
    right_dx, right_dy = 3, 2
    
    for i in range(len(numbers)):
        dx, dy = keypad[numbers[i]]
        
        if numbers[i] in [1, 4, 7]:
            answer += "L"
            left_dx, left_dy = keypad[numbers[i]]
        elif numbers[i] in [3, 6 ,9]:
            answer += "R"
            right_dx, right_dy = keypad[numbers[i]]
        else:
            left = abs(left_dx - dx) + abs(left_dy - dy)
            right = abs(right_dx - dx) + abs(right_dy - dy)
            
            if left > right:
                answer += "R"
                right_dx, right_dy = keypad[numbers[i]]
            elif left < right:
                answer += "L"
                left_dx, left_dy = keypad[numbers[i]]
            else: # left == right
                if hand == "right":
                    answer += "R"
                    right_dx, right_dy = keypad[numbers[i]]
                else:
                    answer += "L"
                    left_dx, left_dy = keypad[numbers[i]]
                    
    return answer