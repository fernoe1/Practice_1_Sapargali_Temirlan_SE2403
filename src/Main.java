import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Berik\\IdeaProjects\\Practice_1_Sapargali_Temirlan_SE2403\\src\\source.txt");
        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split(",");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println(shape.perimeter());
        System.out.println(shape.longestSide());
        System.out.println(shape.averageSide());
    }
}
