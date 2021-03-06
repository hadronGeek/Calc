/**
 * Created by Beck on 1/26/2017.
 */
public class Polar extends Point
{
    private double mag;
    private double angle;

    public Polar(double mag, double angle)
    {
        this.mag = mag;
        this.angle = angle;
    }

    @Override
    public double getMag()
    {
        return mag;
    }

    public void setMag(double mag)
    {
        this.mag = mag;
    }

    @Override
    public double getAngle()
    {
        return angle;
    }

    public void setAngle(double angle)
    {
        this.angle = angle;
    }

    public Polar()
    {
        mag = 0;
        angle = 0;
    }

    @Override
    public double getX()
    {
        return (mag * Math.cos(angle));

    }

    @Override
    public double getY()
    {
        return (mag * Math.sin(angle));
    }
}
