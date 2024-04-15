public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Круг", 12);
        Square square = new Square("Квадрат", 34);
        Triangle triangle = new Triangle("Треугольник", 2, 34, 4);
        Rectangle rectangle = new Rectangle("Прямоугольник",2,4);

        Figure[] figures = {circle, square, triangle, rectangle};


        Dog dog = new Dog("Рекс");
        Cat cat = new Cat("Багира");

        Drawable[] drawables = {circle, square, triangle, rectangle, dog, cat};

        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] instanceof Figure) {
                System.out.println(((Figure)drawables[i]).getName() + " Периметр -> " +
                        ((Figure)drawables[i]).calculatePerimeter());
            }
            if (drawables[i] instanceof Animal){
                System.out.println(((Animal) drawables[i]).getName());
            }
            drawables[i].draw();
        }
    }
}