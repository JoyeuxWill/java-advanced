package com.soft1841.design_study.FactoryPattern;

class ShapeFactory {
    public static Shape getCircleInstance(){
        return new Circle();
    }
    public static Shape getRectangleInsrance(){
        return new Rectangle();
    }
}