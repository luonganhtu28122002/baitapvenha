package lap4;

import java.util.Scanner;

public class testMovable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        MovablePoint movable = new MovablePoint();
        movable.setX(input.nextInt());
        movable.setY(input.nextInt());

        System.out.println(movable.moveUp());
        System.out.println(movable.moveDown());
        System.out.println(movable.moveLeft());
        System.out.println(movable.moveRight());
    }
}
