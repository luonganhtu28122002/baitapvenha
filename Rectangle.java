package lab4;

public class Rectangle extends Shape{
    public int lenght;
    public int width;

    public Rectangle(){
        this.lenght = -1;
        this.width = -2;
    }
    public void setLenght(int value){
        this.lenght = value;
    }
    public void setWidth(int value){
        this.width = value;
    }

    public int getLenght(){
        return this.lenght;
    }

    public int getWidth(){
        return this.width;
    }

    @Override
    public int getArea(){
        return lenght * width;
    }

    @Override
    public String toString(){
        return "Area Rectangle = " + getArea();
    }
}
