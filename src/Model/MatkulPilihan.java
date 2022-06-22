
package Model;

public class MatkulPilihan extends MataKuliah{
    private int jumlahMinMhs;

    public MatkulPilihan(int jumlahMinMhs, String kode, int sks, String nama) {
        super(kode, sks, nama);
        this.jumlahMinMhs = jumlahMinMhs;
    }

    public int getJumlahMinMhs() {
        return jumlahMinMhs;
    }

    public void setJumlahMinMhs(int jumlahMinMhs) {
        this.jumlahMinMhs = jumlahMinMhs;
    }

    @Override
    public String toString() {
        return super.toString()+", MatkulPilihan{" + "jumlahMinMhs=" + jumlahMinMhs + '}';
    }
    
}
