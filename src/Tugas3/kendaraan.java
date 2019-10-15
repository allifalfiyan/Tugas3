/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Allif Alfiyan
 */
public class kendaraan{
	private int idKendaraan;
	protected float jarakTempuhAwal,jarakTempuh;

    public int getIdKendaraan() {
        return idKendaraan;
    }

    public void setIdKendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public float getJarakTempuhAwal() {
        return jarakTempuhAwal;
    }

    public void setJarakTempuhAwal(float jarakTempuhAwal) {
        this.jarakTempuhAwal = jarakTempuhAwal;
    }

    public float getJarakTempuh() {
        return jarakTempuh;
    }

    public void setJarakTempuh(float jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }
    
    public float totalJarak(){
	float total=getJarakTempuhAwal()+getJarakTempuh();
	return total;
    }
    public float efektivitas(float y){
        float x = getJarakTempuh();
        float z = x/Math.abs(y);
	float e =(float) (Math.exp(z)*Math.log10(2));
        
	return e;	
    }
    
    public void infoKendaraan(){
        System.out.println("");
        System.out.println("==================== INFO KENDARAAN ====================");
	System.out.println("ID Kendaraan\t\t: "+getIdKendaraan());
	System.out.println("Total Jarak\t\t: " + totalJarak()+" km");
    }

}

class mobil extends kendaraan{
    private String namaKendaraan,tipeKendaraan;
    private int kapasitasMesin;
    private float bahanBakar;

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }

    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public float getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
    
    public String statusEfektivitas(){
        String status;
        if(super.efektivitas(getBahanBakar())>0 && super.efektivitas(getBahanBakar())<=0.5){
            status = "Mesin Kendaraan Efektif";
        }
        else{
            status = "Mesin Kendaraan Tidak Efektif";
        }
        return status;
    }

    public void infoKendaraan(){
	super.infoKendaraan();
	System.out.println("Nama Kendaraan\t\t: " + getNamaKendaraan());
	System.out.println("Tipe Kendaraan\t\t: " + getTipeKendaraan());
	System.out.println("Kapasitas Mesin\t\t: " + getKapasitasMesin()+" cc");
	System.out.println("Bahan Bakar\t\t: " + getBahanBakar()+" ml");
        System.out.println("Efektivitas\t\t: " + super.efektivitas(getBahanBakar()));
        System.out.println("Status Efektivitas\t: "+statusEfektivitas());
    }
}

class motor extends kendaraan{
    private String namaKendaraan,tipeKendaraan;	
    private int kapasitasMesin;
    private float bahanBakar;

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }

    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    public float getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
    
    public String statusEfektivitas(){
        String status;
        if(super.efektivitas(getBahanBakar())>0 && super.efektivitas(getBahanBakar())<=0.5){
            status = "Mesin Kendaraan Efektif";
        }
        else{
            status = "Mesin Kendaraan Tidak Efektif";
        }
        return status;
    }
    
    public void infoKendaraan(){
	super.infoKendaraan();
	System.out.println("Nama Kendaraan\t\t: " + getNamaKendaraan());
	System.out.println("Tipe Kendaraan\t\t: " + getTipeKendaraan());
	System.out.println("Kapasitas Mesin\t\t: " + getKapasitasMesin()+" cc");
	System.out.println("Bahan Bakar\t\t: " + getBahanBakar());
        System.out.println("Efektivitas\t\t: " + super.efektivitas(getBahanBakar()));
        System.out.println("Status Efektivitas\t: "+statusEfektivitas());
    }
}

    

