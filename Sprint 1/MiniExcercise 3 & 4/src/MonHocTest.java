import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MonHocTest {

    @Test
    void testEquals() {
        MonHoc monhoc1 = new MonHoc("CTDL",3,1);
        MonHoc monhoc2 = new MonHoc("CTDL",3,1);
        assertTrue(monhoc1.equals(monhoc2));

        MonHoc monhoc3 = new MonHoc("Cau truc du lieu",3,1);
        assertFalse(monhoc1.equals(monhoc3));
    }

    @Test
    void getTen() {
        MonHoc monHoc = new MonHoc("CTDL",3,1);
        assertEquals("CTDL", monHoc.getTen());
        assertNotEquals("Cau truc du lieu", monHoc.getTen());

        monHoc = new MonHoc(null,3,1);
        assertNull(monHoc.getTen());
    }

    @Test
    void getTcLT() {
    }

    @Test
    void getTcTH() {
    }

    @Test
    void testCollection() {
        List<MonHoc> danhSachMonHoc = new ArrayList<>();
        MonHoc monhoc1 = new MonHoc("CTDL",3,1);
        MonHoc monhoc2 = new MonHoc("OOP",2,1);
        danhSachMonHoc.add(monhoc1);
        danhSachMonHoc.add(monhoc2);

        MonHoc monhoc3 = new MonHoc("CTDL",3,1);
        assertEquals(0, danhSachMonHoc.indexOf(monhoc1));
        assertEquals(0, danhSachMonHoc.indexOf(monhoc3));

        //Try 1
        Collections.sort(danhSachMonHoc);
        System.out.println(danhSachMonHoc);

        Collections.sort(danhSachMonHoc, new Comparator<MonHoc>() {
                    @Override
                    public int compare(MonHoc o1, MonHoc o2) {
                        if(o1.getTcLT() > o2.getTcLT())
                            return 0;
                        else if(o1.getTcLT() < o2.getTcLT())
                            return -1;
                        else
                            return 0;
                    }
                }
        );
        System.out.println(danhSachMonHoc);

        //Try 3 Lambda
        Collections.sort(danhSachMonHoc, (o1, o2) -> {
            if (o1.getTcLT() > o2.getTcLT())
                return 0;
            else if (o1.getTcLT() < o2.getTcLT())
                return -1;
            else
                return 0;
        });
    }

    @Test
    void testSet() {
        Set<MonHoc> danhSachMonHoc = new HashSet<>();
        MonHoc monhoc1 = new MonHoc("CTDL",3,1);
        MonHoc monhoc2 = new MonHoc("OOP",2,1);
        danhSachMonHoc.add(monhoc1);
        danhSachMonHoc.add(monhoc2);

        MonHoc monhoc3 = new MonHoc("CTDL",3,1);
        assertEquals(2, danhSachMonHoc.size());
    }
}