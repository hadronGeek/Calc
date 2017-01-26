/**
 * Created by Beck on 1/26/2017.
 */
public class Coor extends Point
{
    private double x;
    private double y;

    public Coor(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    @Override
    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    @Override
    public double getAngle()
    {
        return Math.tan(y / x);
    }

    @Override
    public double getMag()
    {
        return Math.sqrt(x * x + y * y);
    }
}
