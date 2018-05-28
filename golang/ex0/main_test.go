package main

import "testing"

func TestCalculateTotal(t *testing.T) {
	var tests = []struct {
		b bill
		r rate
		wantTip float64
		wantTotal float64
	} {
		{100, 0, 0, 100},
		{100, 5, 5, 105},
		{100, 5.91, 6, 106},
	}

	for _, test := range tests {
		gotTotal, gotTip := calculateTotal(test.b, test.r)
		if gotTotal != test.wantTotal {
			t.Errorf("gotTotal: %v but wantTotal: %v", gotTotal, test.wantTotal)
		}
		if gotTip != test.wantTip {
			t.Errorf("gotTip: %v but wantTip: %v", gotTip, test.wantTip)
		}
	}
}
