public class Q08AP01_Mult extends Q08AP01_Operation1A {
    private double scale;
    public Q08AP01_Mult(double scale) {
        this.scale = scale;
    }

    @Override
    public double compute(double arg) {
        return arg * scale;
    }
}
