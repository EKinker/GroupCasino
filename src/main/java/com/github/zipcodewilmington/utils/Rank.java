package com.github.zipcodewilmington.utils;

public enum Rank {
    TWO("2", 2), THREE("3", 3), FOUR("4", 4), FIVE("5", 5), SIX("6", 6), SEVEN("7", 7), EIGHT("8", 8), NINE("9", 9), TEN("10", 10),
    JACK("J", 10), QUEEN("Q", 10), KING("K", 10), ACE("A", 1);
    private String abbreviation;
    private int blackJackValue;
    Rank(String abbreviation, Integer blackJackValue){
        this.abbreviation = abbreviation;
        this.blackJackValue = blackJackValue;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getBlackJackValue() {
        return blackJackValue;
    }
}
