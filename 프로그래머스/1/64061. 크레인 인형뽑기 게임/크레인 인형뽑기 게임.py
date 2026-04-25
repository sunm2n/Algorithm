def solution(board, moves):
    answer = 0
    moves_result = []
    
    
    for i in range(len(moves)):
        for j in range(len(board)):
            if board[j][moves[i]-1] != 0:
                moves_result.append(board[j][moves[i]-1])
                board[j][moves[i]-1] = 0
                if len(moves_result) >= 2 and moves_result[-1] == moves_result[-2]:
                    moves_result.pop()
                    moves_result.pop()
                    answer += 2
                break
    
    return answer