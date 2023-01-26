from typing import List
matrix = [[0]*3]*3
print(matrix)

def differenceOfSum(nums: List[int]) -> int:
    el_sum = sum(nums)
    dig_sum_arr= []
    for x in nums:
        dig_sum = 0
        for i in str(x):
            dig_sum += int(i)
        dig_sum_arr.append(dig_sum)
    return 1