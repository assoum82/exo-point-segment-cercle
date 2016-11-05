
public class PointNom extends PointA {
    private Point a;
    private String nom;

    public PointNom(double x,double y,String nom){
        super(x,y);
        this.nom=nom;
    }
    public void afficheCoord(){
        System.out.println( " le nom du point est " + nom + " coordonnées " + getX() + " , " + getY() );
    }
}
