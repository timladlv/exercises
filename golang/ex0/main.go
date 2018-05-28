package main

import (
	"bufio"
	"fmt"
	"math"
	"os"
	"strconv"
)

type bill float64
type rate float64

func main() {
	input := bufio.NewScanner(os.Stdin)
	b := getFloatInput(input, "What is the bill amount?")
	r := getFloatInput(input, "What is the tip rate?")
	total, tip := calculateTotal(bill(b), rate(r))
	fmt.Printf("Bill: %v, Rate: %v, Tip: %v, Total: %v", b, r, tip, total)
}

func getFloatInput(input *bufio.Scanner, prompt string) float64 {
	fmt.Println(prompt)
	input.Scan()
	if err := input.Err(); err != nil {
		panic(err)
	}
	text := input.Text()
	output, err := strconv.ParseFloat(text, 64)
	if err != nil {
		panic(fmt.Errorf("please enter a numeric, not %v", text))
	}
	return output
}

func calculateTipUpToPenny(b bill, r rate) float64 {
	return math.Ceil(100 * (float64(r) / 100 * float64(b)) / 100)
}

func calculateTotal(b bill, r rate) (float64, float64) {
	tip := calculateTipUpToPenny(b, r)
	return float64(b) + tip, tip
}
