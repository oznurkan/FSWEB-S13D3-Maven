package org.example;

public class Wall {

    private double width;
    private double height;

    public Wall(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return  width;
    }
    public double getHeight(){
        return  height;
    }
    public double setWidth(double param){
        if(param < 0){
            width = 0;
        }else{
            width = param;
        }
        return width;
    }

    public double setHeight(double param){
        if(param < 0){
            height = 0;
        }else{
            height = param;
        }
        return height;
    }
    public double getArea(){
        return  width * height;
    }
}
