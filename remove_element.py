nums=[1,2,3,1]
val=3

def removeElement(nums, val) -> int:
    index=0
    for i in range(len(nums)):
        if nums[i]!=val:
            nums[index]=nums[i]
            index=index+1
            print(nums)
    return index   

print(removeElement(nums,val))
