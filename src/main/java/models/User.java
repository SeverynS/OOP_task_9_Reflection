package models;

public class User {
    private String name;
    private int weight;

    public User() {
    }

    public User(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
