def solution(cost, hint):
    ans = []
    hint_count = [0] * (len(cost) + 1) #힌트는 stage랑 동일하게 가기 위해
    
    def check(stage, current_cost, current_hint):
        if stage > len(cost):
            ans.append(current_cost)
            return
        else:    
            if current_hint[stage] >= len(cost): # 
                stage_hint = len(cost) - 1
            else: 
                stage_hint = current_hint[stage]
            
            next_hint = current_hint[:]
            next_cost = current_cost + cost[stage-1][stage_hint]
            check(stage+1, next_cost, next_hint)
            
            if stage < len(cost): #마지막은 힌트를 살 수 없다.
                for i in range(1, len(hint[stage-1])):
                    next_hint[hint[stage-1][i]] += 1
                next_cost += hint[stage-1][0]
                check(stage+1, next_cost, next_hint)
                
    check(1, 0, hint_count)
    answer = min(ans)
    return answer

        
        
    
    
    