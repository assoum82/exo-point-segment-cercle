
public class Segment extends Point{
    private Point a;
    private Point b;
    public Segment(Point b){
        this.a=new Point ();
        this.b=b;
    }
   public Segment(Point a,Point b){
        this.a=a;
        this.b=b;
    }

    public double distance(){

        return Math.sqrt(Math.pow(b.getX()-a.getX(),2)+Math.pow(b.getY()-a.getY(),2));
    }
    public Segment  symetrie()
    {
        return new Segment(a.symetrie(),b.symetrie());
    }
    public String toString (){
      return a.toString() + b.toString();
    }
}
