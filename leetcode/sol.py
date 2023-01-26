from collections import Counter, defaultdict
from typing import List


class Solution:
    def countSubTrees(self, n: int, edges: List[List[int]], labels: str) -> List[int]:
        """
        Including both vertices makes it difficult to find sub tree
        if we can find subtree it'll have O(nlogn) time complexity.
        In (x, y), if the node x doesn't have connection then choose y
        and add x to its adjacency list
        Like [[0,2],[0,3],[1,2]], 1 has no connection so choose 2
        """
        adj_list = defaultdict(list)
        ans = [0]*n
        vertices_seen = set()
        for x,y in edges:
            adj_list[x].append(y)
            adj_list[y].append(x)
        def dfs(node: int, parent: int):
            nonlocal ans
            counter = Counter()
            for neighbour in adj_list[node]:
                if neighbour!=parent:
                    counter += dfs(neighbour, node)
            label = labels[node]
            counter[label] += 1
            ans[node] += counter[label]
            return counter
        dfs(0, -1)
        return ans
            
counter = Counter()
counter["a"] += 1
print(counter)
        