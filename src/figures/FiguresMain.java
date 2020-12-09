package figures;

public class FiguresMain {

    public static void main(String[] args) {
        //Реализовать иерархию объектов Circle, Rect, Triangle, Square
        System.out.println("Задача на фигуры");

        System.out.println(new Rectangle(1, 2, 10, 2));
        System.out.println(new Circle(1, 2, 10));
        System.out.println(new Triangle(1, 2, 10, 2, 90));


    }


}
