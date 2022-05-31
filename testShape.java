package lab4;

public class testShape {
    public static void main(String[] args){
           Triangle triangle = new Triangle();
           Rectangle rectangle = new Rectangle();


           rectangle.setLenght(10);
           rectangle.setWidth(15);

           System.out.println(rectangle.getArea());
           System.out.println(rectangle.toString());

           triangle.setbase(5);
           triangle.setHeight(10);

           System.out.println(triangle.getArea());
           System.out.println(triangle.toString());
    }
}
