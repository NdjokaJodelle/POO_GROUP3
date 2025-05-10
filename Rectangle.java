
public class Rectangle {

 protected Point A = new Point(0, 0); // Point par défaut
 protected double longueur;
 protected double largeur;
 private static int nbr = 0;
 public Rectangle ( Point A, Point B ) {
    this.A = A;
    longueur = B.getx() - A.getx();
    largeur = B.gety() - A.gety();
    nbr++;
 }
 public Rectangle ( Point A, double v1, double v2 ) {
    this.A = A;  
    longueur = v1 ; 
    largeur = v2 ;
    nbr++;
 }
 public Rectangle ( double v1 , double v2, double v3 , double v4 ) {
 this.A = new Point(v1, v3);
 longueur = v2 - v1 ; 
 largeur = v4 - v3 ;
 nbr++;
 }
 public void affiche () {
        System.out.println (A.getx() + ", " + A.gety() + ", " + longueur + ", " + largeur);
 }
 public double surface(){
        return longueur*largeur;
 }
 public void translate(double dx, double dy){
        this.A = new Point(A.getx() - dx, A.gety() - dy);
        System.out.println (A.getx() + ", " + A.gety() + ", " + longueur + ", " + largeur);
 }
 public boolean contains(Point C ){
    if (C.getx()>=A.getx() && C.getx()<=(A.getx() + longueur) && C.gety()>=A.gety() && C.gety()<=(A.gety() + largeur)){
      System.out.println ("Le point (" + C.getx() + ", " + C.gety() + ") est contenu dans le rectangle [(" + A.getx() + ", " + A.gety() + ", " + longueur + ", " + largeur + " )]");  
    return true;
    }
    else {  System.out.println ("(" + C.getx() + ", " + C.gety() + ") n'est pas contenu dans le rectangle [(" + A.getx() + ", " + A.gety() + ", " + longueur + ", " + largeur + " )]");
    return false;
    }
 }
 public boolean contains(Rectangle R){
   if (this.contains(R.A) && this.contains(new Point(R.A.getx() + R.longueur, R.A.gety())) && this.contains(new Point(R.A.getx(), R.A.gety() + R.largeur)) && this.contains(new Point(R.A.getx() + R.longueur, R.A.gety() + R.largeur))){
         System.out.println ("Le rectangle de caractéristiques " + R.A.getx() + ", " + R.A.gety() + ", " + R.longueur + ", " + R.largeur + ") est contenu dans le rectangle [(" + A.getx() + ", " + A.gety() + ", " + longueur + ", " + largeur + " )]");  

      return true;
      }
      else{
         System.out.println ("Le rectangle de caractéristiques " + R.A.getx() + ", " + R.A.gety() + ", " + R.longueur + ", " + R.largeur + ") n'est pas contenu dans le rectangle [(" + A.getx() + ", " + A.gety() + ", " + longueur + ", " + largeur + " )]");  
      return false;
      }
 }
 public boolean sameAs(Rectangle R){
   if (A.getx()==R.A.getx() && A.gety()==R.A.gety() && longueur==R.longueur && largeur==R.largeur ){
   System.out.println("les deux rectangles se vallent");
   return true;
   }
   else{
      System.out.println("les deux rectangles sont différents");
   return false;
   }
 }
 public int getnbr() {
   System.out.println("Vous avez créer "+ nbr +" rectangles");
   return nbr;
 }
 public static Rectangle  hull(Rectangle[] rectangles) {
    if (rectangles.length == 0) {
        return null; // Aucun rectangle
    }

    double minX = Double.MAX_VALUE, minY = Double.MAX_VALUE;
    double maxX = Double.MIN_VALUE, maxY = Double.MIN_VALUE;

    for (Rectangle r : rectangles) {
        minX = Math.min(minX, r.A.getx());
        minY = Math.min(minY, r.A.gety());
        maxX = Math.max(maxX, r.A.getx() + r.longueur);
        maxY = Math.max(maxY, r.A.gety() + r.largeur);
    }

    return new Rectangle(minX, maxX, minY, maxY);
}
@Override
public String toString() {
    return "Rectangle [Point A=(" + A.getx() + ", " + A.gety() + "), longueur=" + longueur + ", largeur=" + largeur + "]";
}
@Override
public boolean equals(Object obj) {
    if (this == obj) return true; // Même référence
    if (obj == null || getClass() != obj.getClass()) return false; // Vérification du type

    Rectangle r = (Rectangle) obj; // Cast en Rectangle
    return A.getx() == r.A.getx() && A.gety() == r.A.gety() &&
           longueur == r.longueur && largeur == r.largeur;
}

 }
