from collections import defaultdict
from typing import List


class Solution:
    def countSubTrees(self, n: int, edges: List[List[int]], labels: str) -> List[int]:
        """
        Including both vertices makes it difficult to find sub tree
        if we can find subtree it'll have O(n^2) time complexity.
        In (x, y), if the node x doesn't have connection then choose y
        and add x to its adjacency list
        Like [[0,2],[0,3],[1,2]], 1 has no connection so choose 2
        """
        self.count = 0
        adj_list = {}
        ans = []
        vertices_seen = set()
        for x,y in edges:
            adj_list[x] = []
            adj_list[y] = []
        for x, y in edges:
            if not x or x in vertices_seen:
                adj_list[x].append(y)
            else:
                adj_list[y].append(x)
            vertices_seen.add(x)
            vertices_seen.add(y)
        # print(adj_list)
        vertices = set(adj_list.keys())
        def dfs(node: int, parent: int):
            # print(node, end = " ")
            self.count+=1
            if label == labels[node]:
                self.res+=1
            for neighbour in adj_list[node]:
                dfs(neighbour, node)
        i = 0
        for v in vertices:
            i+=1
            print(f"{i=},{self.count = }")
            label: str = labels[v]
            self.res = 0
            dfs(v, -1)
            ans.append(self.res)
        # print(ans)
        return ans