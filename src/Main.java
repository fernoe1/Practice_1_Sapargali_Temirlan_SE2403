import models.Point;
import models.Shape;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number of points to randomly generate.");
        int n = sc.nextInt();
        String file = "C:\\Users\\Berik\\IdeaProjects\\Practice_1_Sapargali_Temirlan_SE2403\\src\\source.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < n; i++) {
                writer.write(random.nextInt(101) + "," + random.nextInt(101));
                writer.write("\n");
            }
            writer.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

        ArrayList<Point> points = new ArrayList<Point>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int x = Integer.parseInt(parts[0]);
                int y = Integer.parseInt(parts[1]);
                points.add(new Point(x, y));
            }
            reader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

        Shape shape = new Shape();
        for (Point p : points) {
            shape.addPoint(p);
        }

        System.out.println(shape.perimeter());
        System.out.println(shape.longestSide());
        System.out.println(shape.averageSide());
    }
}
