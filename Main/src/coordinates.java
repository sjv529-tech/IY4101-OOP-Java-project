public class coordinates {
    int x;
    int y;

    private int getY(){
        return y;
    }

    private int getX(){
        return x;
    }

    private double distance(int x1, int x2, int y1, int y2){
        return Math.sqrt(Math.pow(2, (x2-x1)) + Math.pow(2, y2-y1));
    }

    public void translate(int dx, int dy){
        x += dx;
        y += dy;
    }

    private void scale(bool method, float scale){
        if (bool){
            x = x*scale;
            y = y*scale;
        }else {
            x = x/scale;
            y = y/scale;
        }
    }

}
