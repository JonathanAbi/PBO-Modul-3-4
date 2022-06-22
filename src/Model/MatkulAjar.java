
package Model;

import java.util.ArrayList;

public class MatkulAjar {
    MataKuliah matkul;
    ArrayList<PresensiStaff> presensiStaff;

    public MatkulAjar(MataKuliah matkul, ArrayList<PresensiStaff> presensiStaff) {
        this.matkul = matkul;
        this.presensiStaff = presensiStaff;
    }

    public MataKuliah getMatkul() {
        return matkul;
    }

    public void setMatkul(MataKuliah matkul) {
        this.matkul = matkul;
    }

    public ArrayList<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    public void setPresensiStaff(ArrayList<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    @Override
    public String toString() {
        return super.toString()+", MatkulAjar{" + "matkul=" + matkul + ", presensiStaff=" + presensiStaff + '}';
    }

    
    
}
