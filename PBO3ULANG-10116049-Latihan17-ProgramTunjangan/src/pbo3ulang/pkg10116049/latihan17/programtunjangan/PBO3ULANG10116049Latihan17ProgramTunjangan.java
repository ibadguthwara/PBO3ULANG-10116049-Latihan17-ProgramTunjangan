package pbo3ulang.pkg10116049.latihan17.programtunjangan;
import java.util.Scanner;
/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Program Tunjangan
 */
public class PBO3ULANG10116049Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double gajipokok;
        boolean isMenikah = false;
        
        System.out.println("========================== Program Tunjangan ====================");
        System.out.print("Berapa gaji pokok anda perbulan?\t: Rp. ");
        gajipokok =Double.parseDouble(scanner.nextLine());
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        isMenikah =(scanner.nextLine()).equalsIgnoreCase("Menikah");
        
        
        System.out.println("\n\n===== Hasil Perhitungan Gaji Anda ======");
        System.out.println("Gaji Pokok\t\t\t: Rp ".concat(String.valueOf(gajipokok)));
        System.out.println("Tunjangan\t\t\t: Rp ".concat(String.valueOf(gajipokok *(isMenikah ? 0.35 : 0))));
        System.out.println("Total Gaji\t\t\t: Rp ".concat(String.valueOf(gajipokok + (gajipokok * (isMenikah? 0.35 : 0)))));
        System.out.println("\n\n");
    }
    
}
