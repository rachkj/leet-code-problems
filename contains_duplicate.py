nums=[1,2,3,1]

def contains_duplicate(nums):
  return len(nums) != len(set(nums))

print(contains_duplicate(nums))
