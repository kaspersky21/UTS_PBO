import java.util.Scanner;
public class nomor2 {

    public static double berat,tinggi,bmi,convertTinggi;
    public static double tinggi() {
        return convertTinggi = tinggi/100;
    }

    public static double bmi() {
        return berat / (tinggi() * tinggi());
    }
    

    public static void main(String[] args) {
        Scanner topo = new Scanner(System.in);

        System.out.print("Masukkan berat : ");
        berat = topo.nextDouble();
        
        System.out.print("Masukkan tinggi : ");
        tinggi = topo.nextDouble();

        bmi = bmi();

        System.out.printf("hasil : %.2f " , bmi);
        System.out.println("");

        if(bmi > 22.9) {
            System.out.println("overweight");
        } 
        else if(bmi < 18.5) {
            System.out.println("underweight");
        }
        else {
            System.out.println("normal");
        }
    }
}
