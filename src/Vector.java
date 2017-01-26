/**
 * Created by Beck on 1/26/2017.
 */
public class Vector
{
    private Polar beg;
    private Polar end;

    public Vector(Polar beg, Polar end)
    {
        this.beg = beg;
        this.end = end;
    }

    public Vector(Polar end)
    {
        this.end = end;
        beg = new Polar();
    }

    public Polar getBeg()
    {
        return beg;
    }

    public void setBeg(Polar beg)
    {
        this.beg = beg;
    }

    public Polar getEnd()
    {
        return end;
    }

    public void setEnd(Polar end)
    {
        this.end = end;
    }

    public Vector add(Vector other)
    {
        double xi = beg.getX() + other.getBeg().getX();
        double yi = beg.getY() + other.getBeg().getY();

        double xf = end.getX() + other.getEnd().getX();
        double yf = end.getY() + other.getEnd().getY();

        return new Vector(new Polar(xi, yi), new Polar(xf, yf));
    }
}
