public class Rectangle extends Figure{

    private int width, length;

    public Rectangle(String name, int width, int length) {
        super(name);
        this.width = width;
        this.length = length;
    }

    @Override
    public int calculatePerimeter() {
        return 2 * (width + length);
    }

    @Override
    public void draw() {
        System.out.println("▭");
    }
}
