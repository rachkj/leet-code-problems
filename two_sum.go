/* 
nums: [2,7,11,15] target:9 output: [0,1]
nums: [3,2,4], target: 6 output: [1,2]
nums: [3,3], target: 6 output: [0,1]
*/

package main

import "fmt"

func main() {
	fmt.Println(twoSum(nums,target)
}

func twoSum(nums []int, target int) []int {
	for i := 0; i < len(nums); i++ {
		for j := i + 1; j < len(nums); j++ {
			if (nums[i] + nums[j]) == target {
				return []int{i, j}
			}
		}
	}
	return []int{}
}
