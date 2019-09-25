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

        CirclesTest circlesTest = new CirclesTest(5);
        circlesTest.setCircleAt(0, circle);


        for (int i = 0; i < circlesTest.getCircles().length; i++)
            System.out.println(circlesTest.getCircles()[i]);

        System.out.println("\n After resize:\n");
        circlesTest.resize(2);
        //circles.setCircleAt(1, new Circle(5));
        for (int i = 0; i < circlesTest.getCircles().length; i++)
            System.out.println(circlesTest.getCircles()[i]);

        circlesTest.add(new Circle(12));
        circlesTest.add(new Circle(19));

        System.out.println("\nAfter add:");
        for (int i = 0; i < circlesTest.getCircles().length; i++)
            System.out.println(circlesTest.getCircles()[i]);

        System.out.println("\nCircles with square > average:" + circlesTest.getAverageSquare());
        for (int i = 0; i < circlesTest.getCircles().length; i++)
            if (circlesTest.getCircles()[i].getSquare() > circlesTest.getAverageSquare())
                System.out.println(circlesTest.getCircles()[i]);

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
