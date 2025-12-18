import models.Points;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Baha\\IdeaProjects\\assignment1\\src\\source");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Points point = new Points();
            shape.addPoints(point);
        }

        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getAverageSide());
        System.out.println(shape.getLongest());
    }
}