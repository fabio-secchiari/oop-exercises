package org.example.oop.basic;

import lombok.ToString;

import java.awt.geom.Point2D;

@ToString
public class Polygon {
    private final Point2D.Double[] vertices;

    public Polygon(Point2D.Double[] vertices){
        if (vertices.length < 3) {
            throw new IllegalArgumentException("At least three vertices are required");
        }
        this.vertices = vertices;
    }

    int getVerticesCount(){
        return vertices.length;
    }

    double getPerimeter(){
        double perimeter = 0.0;
        for (int i = 0; i < vertices.length; i++) {
            int next = (i + 1) % vertices.length;
            perimeter += Math.hypot(vertices[i].x - vertices[next].x, vertices[i].y - vertices[next].y);
        }
        return perimeter;
    }

    double getArea(){
        // formula del determinante della matrice dei vertici
        double area = 0.0;
        for (int i = 0; i < vertices.length; i++) {
            int next = (i + 1) % vertices.length;
            area += (vertices[i].x * vertices[next].y) - (vertices[i].y * vertices[next].x);
        }
        return Math.abs(area * 0.5);
    }

}
