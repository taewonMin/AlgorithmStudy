def solution(fees, records):
    default_time, default_fee, unit_time, unit_fee = fees
    answer = []
    car_arr = set()
    in_dict = dict()
    time_dict = dict()
    for record in records:
        time, carNumber, status = record.split()
        car_arr.add(carNumber)
        hour, minute = map(int, time.split(':'))
        if status == 'IN':
            in_dict[carNumber] = hour*60 + minute
        elif status == 'OUT':
            use_time = (hour*60 + minute) - in_dict[carNumber]
            in_dict[carNumber] = -1
            if carNumber in time_dict:
                time_dict[carNumber] += use_time
            else:
                time_dict[carNumber] = use_time
        
    car_arr = sorted(list(car_arr))
    for car in car_arr:
        no_out_time = 0
        if in_dict[car] != -1:
            no_out_time = 1439 - in_dict[car]
            if car not in time_dict: time_dict[car] = 0
        car_use_time = time_dict[car] - default_time + no_out_time
        if car_use_time < 1:
            answer.append(default_fee)
            continue
        if car_use_time % unit_time != 0:
            result_fee = default_fee + (car_use_time // unit_time + 1) * unit_fee
        else:
            result_fee = default_fee + (car_use_time // unit_time) * unit_fee
        answer.append(result_fee)
    return answer