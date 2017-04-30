/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exercise2;

/**
 *
 * @author Alex
 */
public abstract class ShapeDecorator implements Shape {
    private final Shape decoratedShape;
    
    public  ShapeDecorator(Shape s){
        decoratedShape = s;
    }
    
    @Override
    public void draw(){
        decoratedShape.draw();
    }
    
    
    
}
