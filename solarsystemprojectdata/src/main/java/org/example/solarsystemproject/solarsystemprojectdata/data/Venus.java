package org.example.solarsystemproject.solarsystemprojectdata.data;

public class Venus implements Planet {
    String name = "Venus";
    public static final double gravitationalConstant = 6.6720 * Math.pow(10.0, -11.0);
    private double weight = 4.9 * Math.pow(10.0, 24.0);
    private double radius = 6.0 * Math.pow(10.0, 6.0);

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double accelerationCalculate() {
        return gravitationalConstant * weight/(radius * radius);
    }
}
