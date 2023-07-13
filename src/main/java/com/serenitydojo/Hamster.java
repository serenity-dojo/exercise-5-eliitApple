package com.serenitydojo;

public class Hamster extends Pet {
    private String favoriteGame;

    public Hamster(String name, int age, String wheel) {
        super(name, age);
    }

    @Override
    public String play() {
        return "runs in wheel";
    }


}
