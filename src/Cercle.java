
public class Cercle extends Segment {
    private Point c;
    private Point h;
    private double r;

    public Cercle(Point h){
        super(h);
        this.r=distance();
    }
    public Cercle(Point c,Point h){
        super(c,h);
        this.r=distance();
    }
    public Cercle symetrie(){
        return new Cercle(c.symetrie(),h.symetrie());
    }
    public double perimetre(){

        return Math.PI*r*2;
    }
    public String toString(){
        return "le centre du cercle est "  + super.toString() + " et rayon r = " + r  ;  //??????????
    }

}
