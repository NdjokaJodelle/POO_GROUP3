class SlantedRectangle extends Rectangle {
    private double angle;  

    public SlantedRectangle(Point A, Point B, double angle) {
        super(A, B);
        this.angle = angle;
        this.longueur = longueur / Math.cos(Math.toRadians(angle));
        this.largeur = largeur / Math.cos(Math.toRadians(angle));
    }

    public SlantedRectangle(Point p, double largeur, double hauteur, double angle) {
        super(p, largeur, hauteur);
        this.angle = angle;
    }

    public SlantedRectangle(double x1, double y1, double x2, double y2, double angle) {
        super(x1, y1, x2, y2);
        this.angle = angle;
        this.longueur = longueur / Math.cos(Math.toRadians(angle));
        this.largeur = largeur / Math.cos(Math.toRadians(angle));
    }
    @Override 
    public void affiche () {
        super.affiche();
    System.out.println("angle: "+ angle);
 }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
    public void rotate(double deltaAngle) {
    this.angle += deltaAngle;
    System.out.println("Nouvel angle après rotation : " + angle);
}

//La classe SlantedRectangle hérite des méthodes de Rectangle mais certaines nécessitent une redéfinition 

    @Override
    public void translate(double dx, double dy) {
    super.translate(dx, dy); 
}
    @Override
    public double surface() {
    return super.surface();
}
    @Override
    public boolean contains(Point p) {
    // Transformation inverse pour tester l'inclusion dans le rectangle non incliné
    double rad = Math.toRadians(-angle);
    double xprim =  (Math.cos(rad) * (p.getx() - A.getx()) - Math.sin(rad) * (p.gety() - A.gety()) + A.getx());
    double yprim =  (Math.sin(rad) * (p.getx() - A.getx()) + Math.cos(rad) * (p.gety() - A.gety()) + A.gety());
    if (super.contains(new Point(xprim, yprim))){
    System.out.println ("Le point (" + p.getx() + ", " + p.gety() + ") est contenu dans le rectangle [(" + A.getx() + ", " + A.gety() + ", " + longueur + ", " + largeur + " )]");  
    return true;
    }
    else{
    System.out.println ("Le point (" + p.getx() + ", " + p.gety() + ") n'est pas contenu dans le rectangle [(" + A.getx() + ", " + A.gety() + ", " + longueur + ", " + largeur + " )]");  
    return false;
    }
}

    public boolean contains(SlantedRectangle R) {
    // Transformation inverse pour tester l'inclusion dans le rectangle non incliné
    double rad = Math.toRadians(-angle);
    double teta =  Math.toRadians(R.angle);
    double xprim1 =  (Math.cos(rad) * ((R.A.getx() + R.longueur * Math.cos(teta)) - A.getx()) - Math.sin(rad) * ((R.A.gety() + R.longueur * Math.sin(teta)) - A.gety()) + A.getx());
    double yprim1 =  (Math.sin(rad) * ((R.A.getx() + R.longueur * Math.cos(teta)) - A.getx()) + Math.cos(rad) * ((R.A.gety() + R.longueur * Math.sin(teta)) - A.gety()) + A.gety());
    double xprim2 =  (Math.cos(rad) * ((R.A.getx() - R.largeur * Math.sin(teta)) - A.getx()) - Math.sin(rad) * ((R.A.gety() + R.largeur * Math.cos(teta)) - A.gety()) + A.getx());
    double yprim2 =  (Math.sin(rad) * ((R.A.getx() - R.largeur * Math.sin(teta)) - A.getx()) + Math.cos(rad) * ((R.A.gety() + R.largeur * Math.cos(teta)) - A.gety()) + A.gety());
    
    double x3 =  (Math.cos(teta) * ((R.A.getx() + R.longueur) - R.A.getx()) - Math.sin(teta) * ((R.A.gety() + R.largeur) - R.A.gety()) + R.A.getx());
    double y3 =  (Math.sin(teta) * ((R.A.getx() + R.longueur) - R.A.getx()) + Math.cos(teta) * ((R.A.gety() + R.largeur) - R.A.gety()) + R.A.gety());

    double xprim3 =  (Math.cos(rad) * (x3 - A.getx()) - Math.sin(rad) * (y3 - A.gety()) + A.getx());
    double yprim3 =  (Math.sin(rad) * (x3 - A.getx()) + Math.cos(rad) * (y3 - A.gety()) + A.gety());
    
    if (super.contains(R.A) && super.contains(new Point(xprim1, yprim1)) && super.contains(new Point(xprim2, yprim2)) && super.contains(new Point(xprim3, yprim3))){
        System.out.println ("Le rectangle de caractéristiques " + R.A.getx() + ", " + R.A.gety() + ", " + R.longueur + ", " + R.largeur + ") est contenu dans le rectangle [(" + A.getx() + ", " + A.gety() + ", " + longueur + ", " + largeur + " )]");  
        return true;
    }
    else{
        System.out.println ("Le rectangle de caractéristiques " + R.A.getx() + ", " + R.A.gety() + ", " + R.longueur + ", " + R.largeur + ") n'est pas contenu dans le rectangle [(" + A.getx() + ", " + A.gety() + ", " + longueur + ", " + largeur + " )]");  
        return false;
    }
}
@Override
public boolean equals(Object obj) {
    if (!super.equals(obj)) return false; // Vérifie d'abord avec Rectangle.equals()

    SlantedRectangle sr = (SlantedRectangle) obj;
    return angle == sr.angle; // Compare l'angle en plus
}

}
