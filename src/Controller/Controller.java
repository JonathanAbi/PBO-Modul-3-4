package Controller;

import Model.*;
import static Model.Status.hadir;
import View.PrintUserData;
import java.util.ArrayList;

public class Controller {

    ArrayList<User> users = new ArrayList<>();

    public Controller() {
        MataKuliah mk1 = new MataKuliah("IF-101", 2, "Algoritma");
        MataKuliah mk2 = new MataKuliah("IF-102", 3, "Praktek Algoritma");

        Presensi p1 = new Presensi("1/1/2021", 1);
        Presensi p2 = new Presensi("8/1/2021", 0);
        ArrayList<Presensi> presensi1 = new ArrayList<>();
        presensi1.add(p1);
        presensi1.add(p2);
        MatkulAmbil ambilMK1 = new MatkulAmbil(mk1, presensi1, 70, 60, 40);
        MatkulAmbil ambilMK3 = new MatkulAmbil(mk2, presensi1, 80, 90, 70);
        ArrayList<MatkulAmbil> mkAmbil = new ArrayList<>();
        mkAmbil.add(ambilMK1);
        mkAmbil.add(ambilMK3);
        Sarjana sarjana1 = new Sarjana(mkAmbil, 1121060, "IF", "jojo", "mahoni", "131003", "082116681088");

        Presensi p3 = new Presensi("2/1/2021", 0);
        Presensi p4 = new Presensi("9/1/2021", 1);
        ArrayList<Presensi> presensi2 = new ArrayList<>();
        presensi2.add(p3);
        presensi2.add(p4);
        MatkulAmbil ambilMK2 = new MatkulAmbil(mk1, presensi2, 80, 65, 60);
        ArrayList<MatkulAmbil> mkAmbil2 = new ArrayList<>();
        mkAmbil2.add(ambilMK2);
        Magister magister1 = new Magister(mkAmbil2, "Pentingnya berdoa", 1121061, "IF", "jeje", "akasia", "250103", "08211221556");

        PresensiStaff p5 = new PresensiStaff("08.00", "1/1/2021", 1);
        PresensiStaff p6 = new PresensiStaff("07.00", "8/1/2021", 0);
        PresensiStaff p7 = new PresensiStaff("09.00", "15/1/2021", 1);
        ArrayList<PresensiStaff> presensi3 = new ArrayList<>();
        presensi3.add(p5);
        presensi3.add(p6);
        presensi3.add(p7);
        MatkulAjar mkAjar1 = new MatkulAjar(mk1, presensi3);
        PresensiStaff p8 = new PresensiStaff("13.00", "1/1/2021", 1);
        PresensiStaff p9 = new PresensiStaff("17.00", "8/1/2021", 0);
        PresensiStaff p10 = new PresensiStaff("20.00", "15/1/2021", 1);
        ArrayList<PresensiStaff> presensi4 = new ArrayList<>();
        presensi4.add(p8);
        presensi4.add(p9);
        presensi4.add(p10);
        MatkulAjar mkAjar2 = new MatkulAjar(mk2, presensi4);
        ArrayList<MatkulAjar> mkAjar = new ArrayList<>();
        mkAjar.add(mkAjar1);
        mkAjar.add(mkAjar2);
        DosenTetap dosen1 = new DosenTetap(5000000, "IF", 11211, "jono", "cendana", "111195", "0821111000", mkAjar);
        users.add(sarjana1);
        users.add(magister1);
        users.add(dosen1);
    }

    public String printUserData(String nama) {
        int index = -1;
        String txt;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getNama().equals(nama)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            txt = "User tidak ada!";
            return txt;
        } else {
            txt = users.get(index).toString();
            return txt;
        }
    }

    public String printNilaiAkhir(int nim, String kodeMK) {
        int index = -1;
        int hasil = 0;
        for (int i = 0; i < users.size(); i++) {
            User tempUser = users.get(i);
            if (tempUser instanceof Mahasiswa) {
                Mahasiswa tempMhs = (Mahasiswa) tempUser;
                if (tempMhs.getNim() == nim) {
                    index = i;
                }
            }
        }
        if (index == -1) {
            return "User tidak ada";
        } else {
            User temp = users.get(index);
            if (temp instanceof Sarjana) {
                Sarjana mhs = (Sarjana) temp;
                hasil = hitungNilaiAkhir(mhs.getMk(), kodeMK);
                if (hasil == -1) {
                    return "Tidak mengambil mata kuliah ini!";
                } else {
                    return "Nilai akhir dari mata kuliah " + kodeMK + " : " + hasil;
                }
            } else if (temp instanceof Magister) {
                Magister mhs = (Magister) temp;
                hasil = hitungNilaiAkhir(mhs.getMk(), kodeMK);
                if (hasil == -1) {
                    return "Tidak mengambil mata kuliah ini!";
                } else {
                    return "Nilai akhir dari mata kuliah " + kodeMK + " : " + hasil;
                }
            } else {
                Doktor mhs = (Doktor) temp;
                hasil = (mhs.getN1() + mhs.getN2() + mhs.getN3()) / 3;
                return "Nilai akhir : " + hasil;
            }
        }
    }

    public int hitungNilaiAkhir(ArrayList<MatkulAmbil> mk, String kodeMK) {
        for (int i = 0; i < mk.size(); i++) {
            MatkulAmbil temp = mk.get(i);
            if (kodeMK.equals(temp.getMatkul().getKode())) {
                return (temp.getN1() + temp.getN2() + temp.getN3()) / 3;
            }
        }
        return -1;
    }

    public int printRataRataNilaiAkhir(String kodeMK) {
        int total = 0;
        int counter = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) instanceof Sarjana) {
                Sarjana mhs = (Sarjana) users.get(i);
                int nilai = hitungNilaiAkhir(mhs.getMk(), kodeMK);
                if (nilai != -1) {
                    total += nilai;
                    counter++;
                }
            } else if (users.get(i) instanceof Magister) {
                Magister mhs = (Magister) users.get(i);
                int nilai = hitungNilaiAkhir(mhs.getMk(), kodeMK);
                if (nilai != -1) {
                    total += nilai;
                    counter++;
                }
            }
        }
        return total / counter;
    }

    public String printTidakLulus(String kodeMK) {
        int tidakLulus = 0;
        int jmlMhs = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) instanceof Sarjana) {
                Sarjana mhs = (Sarjana) users.get(i);
                int nilai = hitungNilaiAkhir(mhs.getMk(), kodeMK);
                if (nilai != -1) {
                    jmlMhs++;
                    if (nilai < 56) {
                        tidakLulus++;
                    }
                }
            } else if (users.get(i) instanceof Magister) {
                Magister mhs = (Magister) users.get(i);
                int nilai = hitungNilaiAkhir(mhs.getMk(), kodeMK);
                if (nilai != -1) {
                    jmlMhs++;
                    if (nilai < 56) {
                        tidakLulus++;
                    }
                }
            }
        }
        return "<" + tidakLulus + "> dari <" + jmlMhs + "> mahasiswa yang tidak lulus mata kuliah " + kodeMK;
    }

    public String printMatkulAmbil(int nim) {
        int index = -1;
        String str = "";
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) instanceof Mahasiswa) {
                Mahasiswa mhs = (Mahasiswa) users.get(i);
                if (mhs.getNim() == nim) {
                    index = i;
                }
            }
        }
        if (index == -1) {
            return "Tidak ada mahasiswa dengan nim " + nim;
        } else {
            User temp = users.get(index);
            if (temp instanceof Sarjana) {
                Sarjana mhs = (Sarjana) temp;
                ArrayList<MatkulAmbil> mkAmbil = mhs.getMk();
                for (int i = 0; i < mkAmbil.size(); i++) {
                    MatkulAmbil ambilMK = mkAmbil.get(i);
                    str += ambilMK.toString() + "\n\n";
                }
                return str;
            } else if (temp instanceof Magister) {
                Magister mhs = (Magister) temp;
                ArrayList<MatkulAmbil> mkAmbil = mhs.getMk();
                for (int i = 0; i < mkAmbil.size(); i++) {
                    MatkulAmbil ambilMK = mkAmbil.get(i);
                    str += ambilMK.toString() + "\n\n";
                }
                return str;
            } else {
                return "Doktor tidak ada mata kuliah!";
            }
        }
    }

    public String printTotalJamDosen(int nik) {
        int index = -1;
        int jam = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) instanceof Dosen) {
                Dosen temp = (Dosen) users.get(i);
                if (temp.getNik() == nik) {
                    index = i;
                }
            }
        }
        if (index == -1) {
            return "Dosen tidak ada!";
        } else {
            Dosen dosen = (Dosen) users.get(index);
            ArrayList<MatkulAjar> mkAjar = dosen.getMk();
            for (int i = 0; i < mkAjar.size(); i++) {
                MatkulAjar mk = mkAjar.get(i);
                ArrayList<PresensiStaff> presensi = mk.getPresensiStaff();
                int hadir = 0;
                for (int j = 0; j < presensi.size(); j++) {
                    PresensiStaff p = presensi.get(j);
                    if (p.getStatus() == hadir) {
                        hadir++;
                    }
                }
                jam += hadir * 2;
            }
            return "Total jam mengajar dosen : " + jam;
        }
    }

    public String printGajiStaff(int nik) {
        int index = -1;
        int gaji = 0;
        for (int i = 0; i < users.size(); i++) {
            Staff staff = (Staff) users.get(i);
            if (staff.getNik() == nik) {
                index = i;
            }
        }
        if (index == -1) {
            return "Staff tidak terdaftar!";
        } else {
            Staff staff = (Staff) users.get(index);
            if (staff instanceof DosenTetap) {
                DosenTetap dosen = (DosenTetap) staff;
                ArrayList<MatkulAjar> mkAjar = dosen.getMk();
                int unit = 0;
                for (int i = 0; i < mkAjar.size(); i++) {
                    MatkulAjar mk = mkAjar.get(i);
                    ArrayList<PresensiStaff> presensi = mk.getPresensiStaff();
                    for (int j = 0; j < presensi.size(); j++) {
                        PresensiStaff p = presensi.get(i);
                        if (p.getStatus() == hadir) {
                            unit++;
                        }
                    }
                }
                gaji = dosen.getSalary() + (unit * 25000);
            } else if (staff instanceof DosenHonorer) {
                DosenHonorer dosen = (DosenHonorer) staff;
                ArrayList<MatkulAjar> mkAjar = dosen.getMk();
                int unit = 0;
                for (int i = 0; i < mkAjar.size(); i++) {
                    MatkulAjar mk = mkAjar.get(i);
                    ArrayList<PresensiStaff> presensi = mk.getPresensiStaff();
                    for (int j = 0; j < presensi.size(); j++) {
                        PresensiStaff p = presensi.get(i);
                        if (p.getStatus() == hadir) {
                            unit++;
                        }
                    }
                }
                gaji = unit * dosen.getHonorPerSKS();
            } else {
                Karyawan karyawan = (Karyawan) staff;
                ArrayList<PresensiStaff> presensi = karyawan.getPresensi();
                int unit = 0;
                for (int j = 0; j < presensi.size(); j++) {
                    PresensiStaff p = presensi.get(j);
                    if (p.getStatus() == hadir) {
                        unit++;
                    }
                }
                gaji=(unit/22)*karyawan.getSalary();
            }
        }
        return "Gaji Staff : "+gaji;
    }
}
