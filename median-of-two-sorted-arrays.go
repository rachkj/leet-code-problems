// https://leetcode.com/problems/median-of-two-sorted-arrays/description/

func findMedianSortedArrays(nums1 []int, nums2 []int) float64 {
    merged := append(nums1, nums2...)
    sort.Ints(merged)
    l := len(merged)
    if l % 2 == 0 {
        return float64(merged[l/2]) / 2 + float64(merged[l/2 - 1]) / 2
    } else {
        return float64(merged[(l) / 2])
    }
}
