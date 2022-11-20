package kr.co.inseok.D_20221030.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum NumberEnum1 {
    //    ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE;
    TWO, ONE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE;

    public int getNumber() {
        return ordinal() + 1;
    }
}
