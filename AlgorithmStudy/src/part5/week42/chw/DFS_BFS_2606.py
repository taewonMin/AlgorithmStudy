import sys
from collections import deque

computers = int(sys.stdin.readline())
networks = int(sys.stdin.readline())
start_v = 1
graph = [[0] * (computers+1) for _ in range(computers+1)]
answer = 0

for _ in range(networks):
    p1, p2 = map(int, sys.stdin.readline().split())
    graph[p1][p2] = graph[p2][p1] = 1

def bfs(start_v):
    discoverd = [start_v]
    queue = deque()
    queue.append(start_v)
    global answer    
    while queue:
        v = queue.popleft()
        answer += 1
        for w in range(len(graph[v])):
            if graph[v][w] == 1 and (w not in discoverd):
                discoverd.append(w)
                queue.append(w)
    return answer

def dfs(start_v, discoverd=[]):
    discoverd.append(start_v)
    global answer
    answer += 1
    for w in range(len(graph[start_v])):
        if graph[start_v][w] == 1 and (w not in discoverd):
            dfs(w, discoverd)    
    return answer

print(bfs(start_v)-1)
# print(dfs(start_v)-1)