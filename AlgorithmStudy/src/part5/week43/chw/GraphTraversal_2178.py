import sys
from collections import deque

dy = [1, -1, 0, 0]
dx = [0, 0, -1, 1]

N, M = map(int, sys.stdin.readline().split())
graph = [[int(i) for i in sys.stdin.readline().strip()] for _ in range(N)]
visited = [[False]*(M) for _ in range(N)]

def checkIndex(y, x):
    return y > -1 and x > -1 and y < N and x < M

def bfs(xyd):
    visited[xyd[0]][xyd[1]] = True
    queue = deque()
    queue.append(xyd)
    while queue:
        y, x, depth = queue.popleft()
        if y == N-1 and x == M-1: return depth
        for i in range(len(dx)):
            new_y = y + dy[i]
            new_x = x + dx[i]
            if checkIndex(new_y, new_x) and graph[new_y][new_x] == 1 and not visited[new_y][new_x]:
                queue.append([new_y, new_x, depth+1])
                visited[new_y][new_x] = True
print(bfs([0, 0, 1]))