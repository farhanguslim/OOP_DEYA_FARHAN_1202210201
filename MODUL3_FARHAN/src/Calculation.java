public class Calculation implements Runnable {

    private double radius,side,area;
    private double PHI = 3.14;

    //Persegi
    public void setSquare(double side) throws IllegalArgumentException {
        if (side < 1) {
          throw new IllegalArgumentException("Nilai sisi tidak boleh kurang dari 1");
        }
        this.side = side;
        this.area = side * side;
    }

    public double getSquare () {
        return this.area;
    }

    // Lingkaran
    public void setCircle(double radius) throws IllegalArgumentException {
        if (radius < 1) {
          throw new IllegalArgumentException("Nilai jari-jari tidak boleh kurang dari 1");
        }
        this.radius = radius;
        this.area = PHI * radius * radius;
    }

    public double getCircle () {
        return this.area;
    }

    // Trapezoid
    public void setTrapezoid(double a, double b, double t) throws IllegalArgumentException {
        if (a < 1 || b < 1 || t < 1) {
          throw new IllegalArgumentException("Nilai sisi tidak boleh kurang dari 1");
        }
        this.area = (a + b) * t / 2;
    }

    public double getTrapezoid () {
        return this.area;
    }

    @Override
    public void run(){
        System.out.println("====Program will start in====");
        for(int i=3 ; i>=1 ; i--){
            try {
                System.out.println("Starting with thread "+i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error message : " + e);
            }
        }


    }
}
