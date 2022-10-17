import java.util.Scanner;

public class nomor3 {
    
    public static int penjumlahan, bilangan;
    public static int penjumlahan() {
        return penjumlahan += bilangan;
    }
    public static void main(String[] args) {
        
        Scanner topo = new Scanner(System.in);

        for (bilangan = 0; bilangan<=10; bilangan++) {
            System.out.print("Input bilangan : ");
            bilangan = topo.nextInt();
            penjumlahan = penjumlahan(); 
        }

        System.out.println("Hasil : " + penjumlahan);
    }
}
