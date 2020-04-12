package com.android.second;

public class weapon {

    private String Nama;
    private String Deskripsi;
    private int Thumbnail;

    public weapon() {
    }

    public weapon(String nama, String deskripsi, int thumbnail) {
        Nama = nama;
        Deskripsi = deskripsi;
        Thumbnail = thumbnail;
    }

    public String getNama() {
        return Nama;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
