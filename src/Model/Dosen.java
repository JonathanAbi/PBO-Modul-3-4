
package Model;

import java.util.ArrayList;

public abstract class Dosen extends Staff{
    protected String departemen;
    ArrayList<MatkulAjar> mk=new ArrayList<>();

    public Dosen(String departemen, int nik, String nama, String alamat, String ttl, String telepon, ArrayList<MatkulAjar> mk) {
        super(nik, nama, alamat, ttl, telepon);
        this.departemen = departemen;
        this.mk=mk;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getMk() {
        return mk;
    }

    public void setMk(ArrayList<MatkulAjar> mk) {
        this.mk = mk;
    }

    @Override
    public String toString() {
        return super.toString()+", Dosen{" + "departemen=" + departemen + ", mk=" + mk + '}';
    }
    
}
