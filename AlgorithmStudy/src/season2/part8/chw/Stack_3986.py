import sys

def check_input(input):
    while True:
        tmp_input = input
        input = input.replace('AA', '').replace('BB', '')
        if input == '':return True
        elif tmp_input == input: return False

cnt = int(sys.stdin.readline())
result = 0
for _ in range(cnt):
    input = sys.stdin.readline().strip()
    if check_input(input): result += 1
print(result)