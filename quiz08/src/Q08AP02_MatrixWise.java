public class Q08AP02_MatrixWise {
    private double array[][];

    public Q08AP02_MatrixWise(int height, int width) {
        this.array = new double[height][width];
    }

    public void set(int row, int col, double value) {
        this.array[row][col] = value;
    }

    public double get(int row, int col) {
        return this.array[row][col];
    }

    public void reset() {
        this.array = new double[this.array.length][this.array[0].length];
    }

    public void apply(Q08AP01_Operation1A operation) {
        for (int i = 0; i < this.array.length; i++) {
            for (int j =0; j < this.array[i].length; j++) {
                this.array[i][j] = operation.compute(this.array[i][j]);
            }
        }
    }
}
