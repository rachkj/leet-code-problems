package main

import "fmt"

func main() {
	var s string
	fmt.Println(romanToInt(s))
}

func romanToInt(s string) int {
	maptest := map[rune]int{
		'I': 1,
		'V': 5,
		'X': 10,
		'L': 50,
		'C': 100,
		'D': 500,
		'M': 1000,
	}

	sum := 0
	for i := 0; i < len(s); i++ {
		if i == len(s)-1 {
			sum = sum + maptest[rune(s[i])]
		} else if maptest[rune(s[i])] >= maptest[rune(s[i+1])] {
			sum = sum + maptest[rune(s[i])]
		} else {
			sum = sum + maptest[rune(s[i+1])] - maptest[rune(s[i])]
			i++
		}
	}
	return sum
}
