package model;

import java.util.ArrayList;

import edu.csc.truonglehao.R;

public class SaleQuocGia {
    private ArrayList QuocGia;

    public SaleQuocGia() {
        QuocGia = new ArrayList();
    }

    public ArrayList getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(ArrayList quocgia) {
        QuocGia = quocgia;
    }

    public void generateQuocGia() {
        QuocGia.clear();
        QuocGia.add(new QuocGia(R.mipmap.vn, "Việt Nam", 98000000));
        QuocGia.add(new QuocGia(R.mipmap.usa, "Mỹ", 320000000));
        QuocGia.add(new QuocGia(R.mipmap.kor, "Hàn Quốc", 82000000));
        QuocGia.add(new QuocGia(R.mipmap.nga, "Liên Ban Nga", 142000000));
        QuocGia.add(new QuocGia(R.mipmap.jp, "Nhật Bản", 54000000));
        QuocGia.add(new QuocGia(R.mipmap.phap, "Pháp", 254000000));

    }

    private static SaleQuocGia saleQuocGia;

    public static SaleQuocGia get() {
        if (saleQuocGia == null)
            saleQuocGia = new SaleQuocGia();
        return saleQuocGia;
    }
}

