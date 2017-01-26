/**
 * Created by Beck on 1/26/2017.
 */
public class Shape
{
    private Coor[] vert;
    private Line[] edge;

    public Shape(Coor[] vert, Line[] edge)
    {
        this.vert = vert;
        this.edge = edge;
    }

    public Coor[] getVert()
    {
        return vert;
    }

    public void setVert(Coor[] vert)
    {
        this.vert = vert;
    }

    public Line[] getEdge()
    {
        return edge;
    }

    public void setEdge(Line[] edge)
    {
        this.edge = edge;
    }
}
