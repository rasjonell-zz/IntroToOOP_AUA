public class Q08AP01_Log extends Q08AP01_Operation1A {
    private int base;

    public Q08AP01_Log(int base) {
        this.base = base;
    }

    @Override
    public double compute(double arg) {
        return Math.log(arg)/Math.log(this.base);
    }
}
