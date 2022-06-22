
package Model;

import java.util.ArrayList;

public class DosenHonorer extends Dosen{
    private int honorPerSKS;

    public DosenHonorer(int honorPerSKS, String departemen, int nik, String nama, String alamat, String ttl, String telepon, ArrayList<MatkulAjar> mk) {
        super(departemen, nik, nama, alamat, ttl, telepon, mk);
        this.honorPerSKS = honorPerSKS;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString()+", DosenHonorer{" + "honorPerSKS=" + honorPerSKS + '}';
    }
    
}
