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
public class square implements shape{
    protected String name;
    protected float edge;
    public square(){}
    public square(float edge){
    this.name = "square";
    this.edge = edge;
   }
    @Override
    public float getPerimeter(){
    return 4*edge;
    }
    @Override
    public float getArea(){
    return edge*edge;
    }
    @Override
    public void printResult(){
        System.out.println("The area is:"+getArea());
        System.out.println("The perimeter is:"+getPerimeter());
    }
}
