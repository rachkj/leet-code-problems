import "fmt"

func main() {
  var num int
	fmt.Println(isPalindrome(num))
}

func isPalindrome(x int) bool {
	temp := x
	ans := 0
	if x < 0 {
		return false
	}
	for x != 0 {
		ans = ans*10 + x%10
		x = x / 10
	}
	if ans == temp {
		return true
	}
	return false
}
