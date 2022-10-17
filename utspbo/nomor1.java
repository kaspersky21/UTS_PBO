import java.util.Scanner;
public class nomor1 {

    public static double convertJam(int wktAwal, int wktAkhir) {
        return 3600 * (wktAkhir-wktAwal); 
    }
    public static double convertMenit(int mntAwal, int mntAkhir) {
        return 60 * (mntAkhir-mntAwal); 
    }
    public static double convertDetik(int dtkAwal, int dtkAkhir) {
        return dtkAkhir-dtkAwal; 
    }
    public static double biayaPulsa(int biaya, int dtkAkhir, int wktAkhir, int mntAkhir, int wktAwal, int mntAwal, int dtkAwal) {
        return ((convertJam(wktAkhir,wktAwal) + convertMenit(mntAkhir,mntAwal) + convertDetik(dtkAkhir,dtkAwal))/5)*biaya ; 
    }

    public static void main(String[] args) {
        Scanner topo = new Scanner(System.in);
        int biaya = 150;
        int wktAwal;
        System.out.print("masukkan jam awal = ");
        wktAwal = topo.nextInt();
        int mntAwal;
        System.out.print("masukkan menit awal = ");
        mntAwal = topo.nextInt();
        int dtkAwal;
        System.out.print("masukkan detik awal = ");
        dtkAwal = topo.nextInt();
        System.out.print(wktAwal + " : " + mntAwal + " : " + dtkAwal);
        System.out.println("");
        int wktAkhir;
        System.out.print("masukkan jam akhir = ");
        wktAkhir = topo.nextInt();
        int mntAkhir;
        System.out.print("masukkan menit akhir = ");
        mntAkhir = topo.nextInt();
        int dtkAkhir;
        System.out.print("masukkan detik akhir = ");
        dtkAkhir = topo.nextInt();
        System.out.print(wktAkhir + " : " + mntAkhir + " : " + dtkAkhir);
        System.out.println("");
        int lamaJam = wktAkhir - wktAwal; 
        int lamaMnt = mntAkhir - mntAwal;
        int lamaDtk = dtkAkhir - dtkAwal;
        System.out.println("lama anda bertelepon adalah = " + lamaJam + ":" + lamaMnt + ":" + lamaDtk);
        System.out.println("");
        System.out.printf("anda dikenakan biaya sebanyak Rp " + biayaPulsa(biaya, dtkAkhir, wktAkhir, mntAkhir, wktAwal, mntAwal, dtkAwal));
    }
}