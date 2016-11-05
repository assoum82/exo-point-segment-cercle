
public class main {
    public static void main(String [] args ){
        //tester point
        Point A=new Point (5,5);
        System.out.println(A);
        System.out.println(" l'image de A par rapport a l'axe des ordonnées est " + A.symetrie());
        //tester Segment
        Point B=new Point (3,8);
        Segment AB=new Segment (A,B);
        System.out.println("AB " + AB);
        System.out.println( "AB = " + AB.distance());
        System.out.println(" l'image de AB par rapport a l'axe des ordonnées est " + AB.symetrie());
        //tester cercle
        Cercle c1=new Cercle (A);
        Cercle c2=new Cercle (A,B);
        System.out.println(c2);/* je peut pas utiliser toString de class point dans la class cercle
                                          pour afficher juste les cordonnées du centre */
        //tester pointA
        PointA A2 = new PointA (2,4);
        A2.afficheCoord();
        //tester pointNom
        PointNom A3 = new PointNom(2,4,"A3");
        A3.afficheCoord();
    }
}
