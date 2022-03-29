
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> inventory = new ArrayList<String>();
    static Scanner input = new Scanner(System.in);
public static void main(String[] args) {
inventory.add("Kendaraan");
kendaraan();
}    
    static void kendaraan(){
        System.out.println(" Motor Bekas P.T Zaidan");
        System.out.println("----------------------------------------------------");
        System.out.println("1. Masukkan Nama Kendaraan");
        System.out.println("2. Buka Gudang"); 
        System.out.println("3. Ganti Kendaraan");
        System.out.println("4. Hapus Kendaraan");
        System.out.println("5. EXIT");
        System.out.println("----------------------------------------------------");
        System.out.println("Pilih[1-4] = ");
        int p = input.nextInt();
        switch (p){
        case 1:
                pilihkendaraan();
                break;
        case 2:
                bukagudang();
                break;
        case 3:
                ganti();
                break;
        case 4:
                hapus();
                break;
        case 5:
                System.out.println("gudang ditutup");
                break;
        default:
        kendaraan(); 
        } 
    }

    static void pilihkendaraan(){
        System.out.println("Nama Kendaraan = ");
        String pick = input.next();
        inventory.add(pick);
        kendaraan();
        }

    static void bukagudang(){
        for(int i = 0 ; i < inventory.size();i++){
        System.out.println("inventory["+ i +"] : "+ inventory.get(i));
        }
        kendaraan();
}

    static void ganti(){
    for(int i = 0 ; i < inventory.size();i++){
        System.out.println("inventory["+ i +"] : "+ inventory.get(i));}
        System.out.println("masukkan no = ");
        int a = input.nextInt();
        System.out.println("ganti = ");
        String iv = input.next();
        inventory.set(a, iv);
        kendaraan();
}

    static void hapus(){
        System.out.println("masukkan no = ");
        int t = input.nextInt();
        inventory.remove(t);
        kendaraan();
}

}