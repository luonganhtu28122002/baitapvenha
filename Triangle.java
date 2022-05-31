package lab4;

public class Triangle extends Shape{
     public int base;
     public int height;

     public Triangle(){
         this.base = -1;
         this.height = -1;
     }

     public void setbase(int value){
         this.base = value;
     }
     public void setHeight(int value){
         this.height = value;
     }

     public int getBase(){
         return this.base;
     }
     public int getHeight(){
         return this.height;
     }

     @Override
    public int getArea(){
        return (base * height) / 2; 
    }

    @Override
    public String toString(){
        return "Area Triangle = " + getArea();
    }
}
