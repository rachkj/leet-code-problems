package main

import "fmt"

func main() {
	var strs []string
	fmt.Println(longestCommonPrefix(strs))
}

func longestCommonPrefix(strs []string) string {
	fs := strs[0]
	for _, s := range strs {
		i := 0
		for ; i < len(fs) && i < len(s) && fs[i] == s[i]; i++ {

		}
		fs = fs[:i]
	}
	return fs
}
