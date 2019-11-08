import java.lang.Math;
class Darts {
    private double x;
    private double y;
    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        double radiusSqaured = Math.pow(x,2) + Math.pow(y,2);
        double radius = Math.sqrt(radiusSqaured);
        int points;

        if ((radius >=0) && (radius <=1)){
            points = 10;
        }else if ((radius >1) && (radius <=5)){
            points = 5;
        }else if ((radius >5) && (radius <=10)){
            points = 1;
        }else{
            points = 0;
        }

        return points;
    }

}
