def solution(n, k):
    answer = 0
    # 1. n을 k진수로 변환
    k_num = ''
    while n > 0:
        k_num += str(n%k)
        n = n // k
    k_num = k_num[::-1] + '0'
    
    # 2. 소수 조건 확인
    sum_char = ''
    for k_char in k_num:
        if k_char != '0':
            sum_char += k_char
            check_sosu = True
        else:
            if not sum_char or sum_char == '1': 
                sum_char = ''
                continue
            num = int(sum_char)
            for i in range(2, int(num**(1/2)+1)):
                if num % i == 0: 
                    check_sosu = False
                    break
            if check_sosu:
                answer += 1
            sum_char = ''
    return answer