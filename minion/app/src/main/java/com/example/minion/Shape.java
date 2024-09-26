package com.example.minion;

public abstract class Shape {
    private int x;
    private int y;
    public Shape(int x, int y, Stirng color){
        this.x = x;
        this.y = y;
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
