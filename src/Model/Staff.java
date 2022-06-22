
package Model;

public class Staff extends User{
    protected int nik;

    public Staff(int nik, String nama, String alamat, String ttl, String telepon) {
        super(nama, alamat, ttl, telepon);
        this.nik = nik;
    }

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    @Override
    public String toString() {
        return super.toString()+", Staff{" + "nik=" + nik + '}';
    }
    
}
