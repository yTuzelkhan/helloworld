public class Rectangle {
    private double w;
    private double h;
    private int id;
    private static int idGen=1;




    public Rectangle() {
        w = 1.0;
        h = 1.0;
        this.id=idGen++;
    }




    public Rectangle(double w, double h) {
        this();
        setters(w,h);
    }




    void setters(double w, double h) {
        if(w>0 && h>0){
            this.w = w;
            this.h = h;
        }
        else throw new IllegalArgumentException("Width and height must be > 0");
    }




    double area() {
        return w*h;
    }




    double perimeter() {
        return 2*(w+h);
    }




    @Override
    public String toString() {
        return "Rectangle id=" + id + "\n" +
                "width=" + w + "\n" +
                "height=" + h ;
    }
}
