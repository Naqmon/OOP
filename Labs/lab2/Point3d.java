public class Point3d extends Point2d {
    private double zCoord;

    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    
    public Point3d(){
        this(0.0, 0.0, 0.0);
    }

    public double getZ(){
        return zCoord;
    }

    public void setZ(double z){
        zCoord = z;
    }

    public static boolean pointEqual(Point3d first, Point3d second){
        if (first.getX() == second.getX() && first.getY() == second.getY() && first.getZ() == second.getZ()){
            return true;
        }
        return false;
    }
    public static double distanceTo(Point3d f, Point3d s){
        return Math.sqrt(Math.pow(f.getX()-s.getX(), 2) + Math.pow(f.getY()-s.getY(), 2) + Math.pow(f.getZ()-s.getZ(), 2));
    }

}
