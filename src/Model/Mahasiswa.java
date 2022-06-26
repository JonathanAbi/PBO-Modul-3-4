
package Model;

public abstract class Mahasiswa extends User {
    protected int nim;
    protected String jurusan;

    public Mahasiswa(int nim, String jurusan, String nama, String alamat, String ttl, String telepon) {
        super(nama, alamat, ttl, telepon);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return super.toString()+"\nNIM\t:"+this.nim+"\nJurusan\t:"+this.jurusan;
    }
    
    
}
