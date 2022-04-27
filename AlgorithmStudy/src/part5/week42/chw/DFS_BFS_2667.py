import sys
from collections import deque

N = int(sys.stdin.readline())
graph = [[int(i) for i in sys.stdin.readline().strip()] for _ in range(N)]
visited = [[False]*(N) for _ in range(N)]
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
cnt = 0

def checkIndex(y, x):
    return y > -1 and x > -1 and y < N and x < N

def dfs(i, j):
    visited[i][j] = True
    global cnt
    cnt += 1
    for idx in range(len(dx)):
        y = i + dy[idx]
        x = j + dx[idx]
        if checkIndex(y, x) and graph[y][x] == 1 and not visited[y][x]:
            dfs(y, x)
    return cnt

def bfs(i, j):
    visited[i][j] = True
    queue = deque()
    queue.append([i , j])
    global cnt
    while queue:
        y, x = queue.popleft()
        cnt += 1
        for i in range(len(dx)):
            new_y = y + dy[i]
            new_x = x + dx[i]
            if checkIndex(new_y, new_x) and graph[new_y][new_x] == 1 and not visited[new_y][new_x]:
                queue.append([new_y, new_x])
                visited[new_y][new_x] = True
    return cnt

result_arr = []
result_cnt = 0
for i in range(len(graph)):
    for j in range(len(graph[i])):
        if graph[i][j] == 1 and not visited[i][j]:
            result_cnt += 1
            result_arr.append(bfs(i, j))
            # result_arr.append(dfs(i, j))
            cnt = 0

print(result_cnt)
for result in sorted(result_arr):
    print(result)