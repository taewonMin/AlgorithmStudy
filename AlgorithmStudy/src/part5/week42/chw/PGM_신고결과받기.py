def solution(id_list, report, k):
    answer = []
    report = list(set(report))
    id_dict = dict()
    report_dict = dict()

    for id in id_list:
        id_dict[id] = 0
        report_dict[id] = 0

    for rpt in report:
        report_arr = rpt.split()
        report_dict[report_arr[1]] += 1 

    for rpt in report:
        report_arr = rpt.split()
        if report_dict[report_arr[1]] >= k:
            id_dict[report_arr[0]] += 1    

    for id in id_list:
        answer.append(id_dict[id])
        
    return answer