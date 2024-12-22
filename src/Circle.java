public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle[] circles = new Circle[5];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(Math.random() * 10);
        }

        Circle maxCircle = circles[0];
        for (int i = 1; i < circles.length; i++) {
            if (circles[i].getArea() > maxCircle.getArea()) {
                maxCircle = circles[i];
            }
        }

        System.out.println("Круг с максимальной площадью: радиус = " + maxCircle.radius + ", площадь = " + maxCircle.getArea());
    }
}