package org.example.lesson12;

public class Mike extends Feelings implements Behaviours {

    @Override
    void loving(String name) {
        System.out.println("Mike loves " + name);
    }

    @Override
    public void eating (String meal) {
        System.out.println("Mike eatings " + meal);
    }
}
