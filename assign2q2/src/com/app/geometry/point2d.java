package com.app.geometry;

public class point2d {
	private double x;
    private double y;

    public point2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getDetails() {
        return "(" + x + ", " + y + ")";
    }

    public boolean isEqual(point2d other) {
        return this.x == other.x && this.y == other.y;
    }

    public double calculateDistance(point2d other) {
        double distance = Math.sqrt(Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2));
        return distance;
    }

}
