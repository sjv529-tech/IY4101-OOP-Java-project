public class square extends shape {
    private double side;  // All four sides are equal length

    public square(coordinates pos, double s) {
        super(4, pos);  // Square has 4 sides
        this.side = s;
    }

    @Override
    public double getArea() {
        return side * side;  // Area = side²
    }

    @Override
    public double getPerimeter() {
        return 4 * side;  // Perimeter = 4 × side
    }

    // Scales side length and position coordinates
    @Override
    public void scale(int factor, boolean sign) {
        if (sign == true) {
            this.side = this.side * factor;
        } else {
            if (factor != 0) {
                this.side = this.side / factor;
            }
        }
        getCoordinates().scale(factor, sign);
    }

    @Override
    public String display() {
        return "SQUARE: Top-Left " + getCoordinates().display() +
                ", Side = " + side +
                ", Area = " + getArea() +
                ", Perimeter = " + getPerimeter();
    }

    public double getSide() {
        return side;
    }
}
