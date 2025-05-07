public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(4, 4);
        Point p3 = new Point(2, 3);
        Point p4 = new Point(4, 6);
        SlantedRectangle sr1 = new SlantedRectangle(p1, p2, 30);
        SlantedRectangle sr2 = new SlantedRectangle(p1, p3, 30);
        Rectangle sr3 = new Rectangle(p1, p2);
        Rectangle sr4 = new Rectangle(p1, p4);

//Note: tout rectangle peut être défini comme un SlantedRectangle avec pour angle (troisième argument) 0.

        sr1.affiche();

        sr1.rotate(15);

        sr1.translate(2, 3);

        sr4.contains(sr2);
    }
}
