package lap4;

public class MovablePoint extends Movable {
    private int x;
    private int y;
    public MovablePoint(){
        this.x = -1;
        this.y = -1;
    }
    public void setX(int value){
        this.x = value;
    }
    public void setY(int value){
        this.y = value;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    @Override
    public int moveUp(){
        return y++;
    }
    @Override
    public int moveDown(){
        return y--;
    }
    @Override
    public int moveLeft(){
        return x++;
    }
    @Override
    public int moveRight(){
        return x--;
    }
}
