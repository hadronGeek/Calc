/**
 * Created by Beck on 1/26/2017.
 */
public class Line
{
    private Coor a;
    private Coor b;

    public Line(Coor a, Coor b)
    {
        this.a = a;
        this.b = b;
    }

    public Coor getA()
    {
        return a;
    }

    public void setA(Coor a)
    {
        this.a = a;
    }

    public Coor getB()
    {
        return b;
    }

    public void setB(Coor b)
    {
        this.b = b;
    }
}
