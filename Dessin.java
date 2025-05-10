public class Dessin {
    private Rectangle[] rectangles;
    private int n;
    private Rectangle hullRect; // Rectangle englobant

    public Dessin(int t) {
        this.rectangles = new Rectangle[t];
        this.n = 0;
        this.hullRect = null; // Vide au départ
    }

    public void add(Rectangle r) {
        if (n < rectangles.length) {
            rectangles[n++] = r;
            updateHull();
        } else {
            System.out.println("Le dessin est plein !");
        }
    }
    public double surface() {
    double totalSurface = 0;
    for (int i = 0; i < n; i++) {
        totalSurface += rectangles[i].surface();
    }
    return totalSurface;
}

public void translate(double dx, double dy) {
    for (int i = 0; i < n; i++) {
        rectangles[i].translate(dx, dy);
    }
}


    private void updateHull() {
        hullRect = hull(rectangles);
    }

    public Rectangle getHull() {
        return hullRect;
    }
}
