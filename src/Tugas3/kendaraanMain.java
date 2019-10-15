
package Tugas3;

import java.util.Scanner;

public class kendaraanMain {

    public static void main(String[] args) {
        Scanner kumbang = new Scanner(System.in);
        
        System.out.print("Masukkan ID Kendaraan(1-3)\t\t: ");
        int id = kumbang.nextInt();
        
        System.out.print("Masukkan Jarak Tempuh Awal\t\t: ");
        float a = kumbang.nextFloat();
        
        System.out.print("Masukkan Jarak Tempuh Kendaraan(0-500)\t: ");
        float b = kumbang.nextFloat();
        while(b<0 || b>500){
            System.out.println("Jarak tempuh diluar batas.");
            System.out.print("Masukkan Jarak Tempuh Kendaraan(0-500)\t: ");
            b = kumbang.nextFloat();
        }
        
        mobil satu = new mobil();
        mobil dua = new mobil();
        motor tiga = new motor();
        
        switch (id){
            case 1:
                satu.setIdKendaraan(id);
                satu.setJarakTempuhAwal(a);
                satu.setJarakTempuh(b);
                satu.setNamaKendaraan("Mitsubisshi Outlander");
                satu.setTipeKendaraan("SUV");
                satu.setKapasitasMesin(2000);
                System.out.print("Masukkan Bahan Bakar(0-500)\t\t: ");
                float bbm1 = kumbang.nextFloat();
                while(bbm1<0 || bbm1>500){
                    System.out.println("Bahan bakar diluar batas.");
                    System.out.print("Masukkan Bahan Bakar(0-500)\t\t: ");
                    bbm1 = kumbang.nextFloat();
                }
                satu.setBahanBakar(bbm1);
                satu.infoKendaraan();
                break;
            case 2:
                dua.setIdKendaraan(id);
                dua.setJarakTempuhAwal(a);
                dua.setJarakTempuh(b);
                dua.setNamaKendaraan("Toyota Camry");
                dua.setTipeKendaraan("Sedan");
                dua.setKapasitasMesin(1800);
                System.out.print("Masukkan Bahan Bakar(0-500)\t\t: ");
                float bbm2 = kumbang.nextFloat();
                while(bbm2<0 || bbm2>500){
                    System.out.println("Bahan bakar diluar batas.");
                    System.out.print("Masukkan Bahan Bakar(0-500)\t\t: ");
                    bbm2 = kumbang.nextFloat();
                }
                dua.setBahanBakar(bbm2);
                dua.infoKendaraan();
                break;
            case 3:
                tiga.setIdKendaraan(id);
                tiga.setJarakTempuhAwal(a);
                tiga.setJarakTempuh(b);
                tiga.setNamaKendaraan("Honda Supra-X");
                tiga.setTipeKendaraan("Bebek");
                tiga.setKapasitasMesin(125);
                System.out.print("Masukkan Bahan Bakar(0-500)\t\t: ");
                float bbm3 = kumbang.nextFloat();
                while(bbm3<0 || bbm3>500){
                    System.out.println("Bahan bakar diluar batas.");
                    System.out.print("Masukkan Bahan Bakar(0-500)\t\t: ");
                    bbm3 = kumbang.nextFloat();
                }
                tiga.setBahanBakar(bbm3);
                tiga.infoKendaraan();
                break;
            default:
                System.out.println("Kendaraan tidak terdaftar.");
                
        }
    }
    
}
