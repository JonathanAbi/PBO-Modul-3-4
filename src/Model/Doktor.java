
package Model;

public class Doktor extends Mahasiswa{
    private String judulPenelitianDisertasi;
    private int n1,n2,n3;

    public Doktor(String judulPenelitianDisertasi, int n1, int n2, int n3, int nim, String jurusan, String nama, String alamat, String ttl, String telepon) {
        super(nim, jurusan, nama, alamat, ttl, telepon);
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public String getJudulPenelitianDisertasi() {
        return judulPenelitianDisertasi;
    }

    public void setJudulPenelitianDisertasi(String judulPenelitianDisertasi) {
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return super.toString()+"Doktor{" + "judulPenelitianDisertasi=" + judulPenelitianDisertasi + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + '}';
    }
    
}
