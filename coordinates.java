public class coordinates {
    private int x;
    private int y;

    public coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Calculates Euclidean distance between this point and another
    public double distance(coordinates p) {
        int xDiff = this.x - p.getX();
        int yDiff = this.y - p.getY();

        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }

    // Moves point by adding dx and dy to current coordinates
    public void translate(int dx, int dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    // Scales coordinates relative to origin: multiply if sign=true, divide if false
    public void scale(int factor, boolean sign) {
        if (sign == true) {
            this.x = this.x * factor;
            this.y = this.y * factor;
        } else {
            if (factor != 0) {  // Prevent division by zero
                this.x = this.x / factor;
                this.y = this.y / factor;
            }
        }
    }

    // Returns formatted string representation of coordinates
    public String display() {
        return "X = " + x + " Y = " + y;
    }
}
