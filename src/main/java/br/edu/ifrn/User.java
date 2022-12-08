package br.edu.ifrn;

public class User {
    protected String name;
    private float height;
    private float weight;

    public User(String name, float height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    protected String getName() {
        return this.name;
    }

    protected float getHeight() {
        return this.height;
    }

    protected float getWeight() {
        return this.weight;
    }

}
