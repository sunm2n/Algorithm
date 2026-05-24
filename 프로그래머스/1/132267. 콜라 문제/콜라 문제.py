def solution(a, b, n):
    answer = 0
    current_coke = n # 현재 빈 병의 개수
    
    while current_coke >= a:
        q = current_coke // a  # 몫 (교환하는 횟수)
        r = current_coke % a   # 나머지 (교환하지 못하고 남은 빈 병)
        
        # 교환해서 얻은 새 콜라의 개수를 정답에 누적
        received_coke = q * b
        answer += received_coke
        
        # 다음 턴의 빈 병 개수 = 교환하고 남은 병 + 새로 받아서 다 마신 병
        current_coke = r + received_coke
        
    return answer