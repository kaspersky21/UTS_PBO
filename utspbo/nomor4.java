public class nomor4 {
    private double r; 
    private final double PHI = 3.14;

    //method
    public nomor4() {
        this.r = 0;
    }

    public nomor4(double jari) {
        this.r = jari;
    }

    public void setR(double jari) {
        this.r = jari;
    }

    public double getR() {
        return this.r;
    }

    public double luas() {
        return this.PHI * Math.pow(this.r,2);
    }

    public double keliling() {
        return 2 * this.PHI * r;
    }

    public static void main(String[] args) {
        nomor4 Lslingkar = new nomor4();
        Lslingkar.setR(10);
        System.out.println("Luas Lingkaran 1 = " + Lslingkar.luas());

        nomor4 Lslingkar2 = new nomor4();
        Lslingkar2.setR(2);
        System.out.println("Keliling Lingkaran = " + Lslingkar2.keliling());
    }
}

