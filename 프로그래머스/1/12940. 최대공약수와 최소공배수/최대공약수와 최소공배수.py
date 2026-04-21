def solution(n, m):
    answer = [gcd(n,m), lcm(n,m)]
    return answer

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lcm(a, b):
    return (a/gcd(a,b) * b)


    