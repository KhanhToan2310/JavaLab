/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author PHONG VU
 */
public class circle implements shape{
    protected String name;
    protected float radius;
    
    public circle(){}
    public circle(float radius){
    this.radius = radius; 
    this.name = "circle";
    }
    @Override
    public float getArea(){
        
        return PI*radius*radius;
    }
    @Override
    public float getPerimeter(){
        
        return 2*PI*radius;
    }
    @Override
    public void printResult(){
        System.out.println("The area is:"+getArea());
        System.out.println("the perimeter is:"+getPerimeter());
    }
}
