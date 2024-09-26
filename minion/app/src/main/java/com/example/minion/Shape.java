package com.example.minion;

public abstract class Shape {
    private int x;
    private int y;
    private String color;
    public Shape(int x, int y,String color){
        this.x = x;
        this.y = y;
        this.color="yellow";
    }
    public int getX(){
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }
}
