import java.util.Scanner;
public class Lab2 { 
    public static double computeArea(Point3d f, Point3d s, Point3d t){
        if (Point3d.pointEqual(f, s) || Point3d.pointEqual(f, t) || Point3d.pointEqual(s, t)){
            System.out.println("Точки совпадают, площадь равна нулю");
            return 0;
        }
        double a = Point3d.distanceTo(f, s);
        double b = Point3d.distanceTo(f, t);
        double c = Point3d.distanceTo(s, t);
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите координаты точки: ");
        Point3d p1 = new Point3d(input.nextDouble(), input.nextDouble(), input.nextDouble());
        System.out.print("Введите координаты точки: ");
        Point3d p2 = new Point3d(input.nextDouble(), input.nextDouble(), input.nextDouble());
        System.out.print("Введите координаты точки: ");
        Point3d p3 = new Point3d(input.nextDouble(), input.nextDouble(), input.nextDouble());
        double area = computeArea(p1, p2, p3);
        System.out.printf("Area = %.2f \n", area);
    }
}

