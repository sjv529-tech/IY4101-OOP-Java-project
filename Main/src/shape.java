public class shape extends coordinates{
    int sides;

    abstract int getCoordinates{
        return x;
        return y;
    }

    abstract int getSides(shape){
        return sides;
    }

    abstract void setCoordinates(coordinates newcoord){
        coordinates = newcoord;
    }

    abstract void translate(int dx, int dy){
    }

    abstract double getArea(){}

    abstract double getPerimeter(){}

    abstract String display(){}


}
