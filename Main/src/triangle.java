public class triangle extends shape {
    // A triangle has three corners
    private coordinates vertex1;
    private coordinates vertex2;
    private coordinates vertex3;

    public triangle(coordinates v1, coordinates v2, coordinates v3) {
        super(3, v1);  
        this.vertex1 = v1;
        this.vertex2 = v2;
        this.vertex3 = v3;
    }

    private double sideA() {
        return vertex1.distance(vertex2);
    }

    private double sideB() {
        return vertex2.distance(vertex3);
    }

    private double sideC() {
        return vertex3.distance(vertex1);
    }
 
    @Override
    public double getPerimeter() {
        return sideA() + sideB() + sideC();
    }

    @Override
    public double getArea() {
        double a = sideA();
        double b = sideB();
        double c = sideC();
        double s = getPerimeter() / 2;
        
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public void translate(int dx, int dy) {
        vertex1.translate(dx, dy);
        vertex2.translate(dx, dy);
        vertex3.translate(dx, dy);
    }

    @Override
    public void scale(int factor, boolean sign) {
        // Scale all three vertices
        vertex1.scale(factor, sign);
        vertex2.scale(factor, sign);
        vertex3.scale(factor, sign);
    }

    @Override
    public String display() {
        return "TRIANGLE: Vertices: [" + vertex1.display() + "], [" + 
               vertex2.display() + "], [" + vertex3.display() + "]" +
               ", Area = " + getArea() + 
               ", Perimeter = " + getPerimeter();
    }

    public coordinates getVertex1() { return vertex1; }
    public coordinates getVertex2() { return vertex2; }
    public coordinates getVertex3() { return vertex3; }
}
