def solution(numbers):
    numbers.sort()
    
    # 최대값은 결국 제일 작은 음수 2개 곱 혹은 제일 큰 양수 2개의 곱이다.
    answer = max(numbers[0] * numbers[1], numbers[-1] * numbers[-2])
    
    return answer