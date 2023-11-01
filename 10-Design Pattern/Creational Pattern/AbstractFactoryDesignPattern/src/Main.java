public class Main {
    public static void main(String[] args) {
        AbstractFactory redCircleFactory = new RedCircleFactory();
        Shape circle = redCircleFactory.createShape();
        Color red = redCircleFactory.createColor();
        circle.draw();
        red.fill();

        AbstractFactory blueSquareFactory = new BlueSqareFactory();
        Shape square = blueSquareFactory.createShape();
        Color blue = blueSquareFactory.createColor();
        square.draw();
        blue.fill();


    }
}