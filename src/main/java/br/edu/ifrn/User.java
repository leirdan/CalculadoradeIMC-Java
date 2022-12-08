package br.edu.ifrn;

public class User {
    protected String name;
    private Double height;
    private Double weight;

    public User(String name, Double height, Double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    protected String getName() {
        return this.name;
    }

    protected Double getHeight() {
        return this.height;
    }

    protected Double getWeight() {
        return this.weight;
    }

}
