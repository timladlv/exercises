package main

import (
	"bufio"
	"os"
	"fmt"
	"io"
)

func main() {
	fmt.Println(buildGreeting(getName(os.Stdin, "Hi, who are ya?")))
}

func getName(r io.Reader, prompt string) string {
	fmt.Println(prompt)
	input := bufio.NewScanner(r)
	input.Scan()
	if err := input.Err(); err != nil {
		panic(err)
	}
	return input.Text()
}

func buildGreeting(name string) string {
	return fmt.Sprintf("Hello %v, nice to meet ya, will ya\n", name)
}
