package com.soft1841.design_study.FactoryPattern;

public class FactoryTest {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getCircleInstance();
        circle.draw();
        Shape rectangle = ShapeFactory.getRectangleInsrance();
        rectangle.draw();
    }
}