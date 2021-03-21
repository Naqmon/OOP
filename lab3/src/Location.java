/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }
    public boolean equals(Location loc){
        int x = xCoord;
        int y = yCoord;
        return x == loc.xCoord && y == loc.yCoord;
    }
    public int hashcode(){
        int x = xCoord;
        int y = yCoord;
        return (x*y + x - y)*x-y*y;
    }
}
