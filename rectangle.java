public class rectangle extends shape {
    private double width;   
    private double length; 

        public rectangle(coordinates pos, double width, double length) {
        super(4, pos); 
        this.width = width;
        this.length = length;
    }
    
    @Override
    public double getArea() {
        return width * length;
    }

        @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public void scale(int factor, boolean sign) {
        if (sign == true) {
            this.width = this.width * factor;
            this.length = this.length * factor;
        } else {
            if (factor != 0) {
                this.width = this.width / factor;
                this.length = this.length / factor;
            }
        }
        getCoordinates().scale(factor, sign);
    }

    @Override
    public String display() {
        return "RECTANGLE: Position " + getCoordinates().display() + 
               ", Width = " + width + ", Length = " + length +
               ", Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }

}
