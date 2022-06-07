
import java.util.*;

public class SinhVien {
    public String mssv;
    public String ten;

    private Set<Diem> monDaHoc = new HashSet<Diem>();

    public SinhVien(String mssv, String ten) {
        this.mssv = mssv;
        this.ten = ten;
    }

    public boolean themDiem(Diem diemMoi) {
        return this.monDaHoc.add(diemMoi);
    }

    //TODO Cau 1
    public double tinhDiemTrungBinh() {
        //Tinh tong diem
        double diemTong = monDaHoc.stream().mapToDouble(Diem::getDiem).sum();
        //Count mon da hoc
        long count = monDaHoc.stream().mapToLong(Diem::getMon).count();
        return (double) diemTong/count;
    }


    //TODO Cau 2
    public String bangDiem() {
        StringBuilder string = new StringBuilder();
        string.append("MSSV : " + mssv);
        string.append("Ten : " + ten);
        System.out.println(string.append("Danh sach diem"));
        System.out.println("STT" + "\t" + " Ten Mon" + "\t" + " Diem" + "\t" + " So tin chi");
        ArrayList<MonHoc> arr = new ArrayList<>();
        for (MonHoc s : arr) {
            string.append(monDaHoc.stream().mapToLong(Diem::getMon).count())
                    .append(s.getTen())
                    .append(monDaHoc.stream().mapToDouble(Diem::getDiem))
                    .append(s.getTcTH());
        }
        string.append("Diem trung binh : " + tinhDiemTrungBinh());
    /*
     MSSV : 0203044
     Ten  : Nguyen Van A
     Danh Sach Diem
     STT  Ten Mon             Diem       So Tin Chi
     1    Cau Truc Du Lieu 1  8          3
     2    Cau Truc Du Lieu 2  8          3
     Diem Trung Binh   8.0
    *
    }


    //TODO Cau 3
    public String xepLoai() {
    /*
    Quy tac xep loai nhu sau
        DiemTB < 5 -> YEU
        DiemTB >= 5 va DiemTB < 6 -> TB
        DiemTB >= 6 va DiemTB < 7 -> TB-KHA
        DiemTB >= 7 va DiemTB < 8 -> KHA
        DiemTB >= 8 -> GIOI
    */

        //...
        return null;
    }
}