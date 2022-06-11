package model;

import java.io.Serializable;

public class QuocGia implements Serializable {
    private int img;
    private String name;
    private int dan;

    public QuocGia() {
    }

    public QuocGia(int img, String name, int dan) {
        this.img = img;
        this.name = name;
        this.dan = dan;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDan() {
        return dan;
    }

    public void setDan(int dan) {
        this.dan = dan;
    }
}
