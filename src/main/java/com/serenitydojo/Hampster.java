package com.serenitydojo;

public class Hampster extends Pet {
    private String favoriteGame;

    public Hampster(String name, int age, String wheel) {
        super(name, age);
    }

    @Override
    public String play() {
        return "runs in wheel";
    }


}
