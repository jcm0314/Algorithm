def solution(name, yearning, photo):
    score_map = dict(zip(name, yearning))
    answer = []
    
    for p_list in photo:
        total_score = 0
        
        for p in p_list:
            total_score += score_map.get(p, 0)
        answer.append(total_score)
    
    
    
    
    return answer