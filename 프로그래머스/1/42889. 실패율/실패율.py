from fractions import Fraction

def solution(N, stages):
    answer = []
    people_count = len(stages) # 전체 유저 수
    current_people_stages = [0] * (N + 1) # 현재 N번째 스테이지를 플레이 중인 유저 수
    percent = []
    
    # 현재 스테이지에 머물러 있는 유저 수 배열에 넣기
    for i in range(len(stages)):
        if stages[i] <= N: # 마지막 스테이지까지 클리어 한 사람 카운트X
            current_people_stages[stages[i]] += 1
    
    # percent 배열에 (현재 스테이지, 분수) 로 넣기
    for i in range(1, len(current_people_stages)):
        if people_count == 0:
            # 스테이지에 도달한 유저가 없는 경우 실패율은 0
            percent.append((i, 0)) 
        else:
            percent.append((i, Fraction(current_people_stages[i], people_count)))
            # 다음 스테이지 계산을 위해 도달했던 유저 수를 빼줌
            people_count -= current_people_stages[i]
    
    percent.sort(key=lambda x: (-x[1], x[0])) # 1순위는 분수로 분수 값이 동일 하면 스테이지 번호가 빠른게 앞으로 정렬
    
    for i in range(len(percent)):
        answer.append(percent[i][0])
    
    return answer