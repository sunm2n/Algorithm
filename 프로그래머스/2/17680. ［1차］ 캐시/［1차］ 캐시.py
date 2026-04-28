from collections import deque

def solution(cacheSize, cities):
    answer = 0
    cache = deque()
    
    for i in range(len(cities)):
        target = cities[i].lower()
        if target in cache: # cache hit
            answer += 1
            cache.remove(target) # 기존 캐시를 지우고
            cache.appendleft(target) #앞으로 보낸다.
        else: # cache miss
            answer += 5
            cache.appendleft(target)
            if len(cache) > cacheSize: # 캐쉬 크기를 초과하면
                cache.pop()
                
    return answer