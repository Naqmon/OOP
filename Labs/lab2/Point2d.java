public class Point2d {
    public double xCoord;
    public double yCoord;

    public Point2d(double x, double y) {
        xCoord = x;
        yCoord = y;
    }

    public Point2d(){
        this(0.0, 0.0);
    }

    public double getX(){
        return xCoord;
    }
    public double getY(){
        return yCoord;
    }
    public void setX(double x){
        xCoord = x;
    }
    public void setY(double y){
        yCoord = y;
    }
    public static boolean pointEqual(Point2d first, Point2d second){
        if (first.getX() == second.getX() && first.getY() == second.getY()){
            return true;
        }
        return false;
    }
    public static double distanceTo(Point2d f, Point2d s){
    return Math.sqrt(Math.pow(f.getX()-s.getX(), 2) + Math.pow(f.getY()-s.getY(), 2));
    }

}

