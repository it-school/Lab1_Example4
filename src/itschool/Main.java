package itschool;

public class Main {

    public static void main(String[] args) {
        Circle circle;

        double side = -1;
        while (Circle.CheckCorrectRadius("" + (side = Math.random() * 11 - 5)) < 0) {
            System.out.println(side);
        }

        circle = new Circle(side);
//        System.out.println(circle);
//        circle.setRadius(-5);
//        System.out.println(circle);

        Circles circles = new Circles(5);
        circles.setCircleAt(0, circle);


        for (int i = 0; i < circles.getCircles().length; i++)
            System.out.println(circles.getCircles()[i]);

        System.out.println("\n After resize:\n");
        circles.resize(2);
        //circles.setCircleAt(1, new Circle(5));
        for (int i = 0; i < circles.getCircles().length; i++)
            System.out.println(circles.getCircles()[i]);

        circles.add(new Circle(12));
        circles.add(new Circle(19));

        System.out.println("\nAfter add:");
        for (int i = 0; i < circles.getCircles().length; i++)
            System.out.println(circles.getCircles()[i]);

        System.out.println("\nCircles with square > average:" + circles.getAverageSquare());
        for (int i = 0; i < circles.getCircles().length; i++)
            if (circles.getCircles()[i].getSquare() > circles.getAverageSquare())
                System.out.println(circles.getCircles()[i]);

        Cylinder cylinder = new Cylinder(5, 4);
        System.out.println(cylinder);

        Cylinders cylinders = new Cylinders();
        cylinders.list.add(cylinder);
        cylinders.list.add(new Cylinder(10,6));
        cylinders.list.add(new Cylinder(3,7));

        System.out.println("\nList of cylinders:");
        for (int i = 0; i < cylinders.list.size(); i++)
            System.out.println(cylinders.list.get(i));


    }
}
