public class circle extends shape {
    private double radius; 
    
    public circle(coordinates pos, double r) {
        super(0, pos);  
        this.radius = r;
    }
    

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public void scale(int factor, boolean sign) {
        if (sign == true) {
            this.radius = this.radius * factor;
        } else {
            if (factor != 0) {
                this.radius = this.radius / factor;
            }
        }
        getCoordinates().scale(factor, sign);
    }
    
    public String display() {
        return "CIRCLE: Center " + getCoordinates().display() + 
               ", Radius = " + radius +
               ", Area = " + getArea() + 
               ", Circumference = " + getPerimeter();
    }

    public double getRadius() {
        return radius;
    }
}
