import sys
from collections import deque
sys.setrecursionlimit(10**6)

dy = [1, -1, 0, 0]
dx = [0, 0, -1, 1]

def checkIndex(y, x):
    global N, M
    return y > -1 and x > -1 and y < N and x < M

def bfs(visited, graph, xy):
    visited[xy[0]][xy[1]] = True
    queue = deque()
    queue.append(xy)
    while queue:
        y, x = queue.popleft()
        for i in range(len(dx)):
            new_y = y + dy[i]
            new_x = x + dx[i]
            if checkIndex(new_y, new_x) and graph[new_y][new_x] == 1 and not visited[new_y][new_x]:
                queue.append([new_y, new_x])
                visited[new_y][new_x] = True
    
def dfs(visited, graph, xy):
    y, x = xy
    visited[y][x] = True
    for i in range(len(dx)):
        new_y = y + dy[i]
        new_x = x + dx[i]
        if checkIndex(new_y, new_x) and graph[new_y][new_x] == 1 and not visited[new_y][new_x]:
            dfs(visited, graph, [new_y, new_x])

T = int(sys.stdin.readline())
for _ in range(T):
    M, N, K = map(int, sys.stdin.readline().split())
    visited = [[False]*M for _ in range(N)]
    graph = [[0]*M for _ in range(N)]
    result = 0
    for _ in range(K):
        p1, p2 = map(int, sys.stdin.readline().split())
        graph[p2][p1] = 1
    for i in range(N):
        for j in range(M):
            if graph[i][j] == 1 and not visited[i][j]:
                result += 1  
                # bfs(visited, graph, [i,j])
                dfs(visited, graph, [i,j])
    print(result)