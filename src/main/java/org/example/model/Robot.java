package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Robot {

    private String nama;
    private String warna;
    private String model;

    public Integer tahunProduksi; // JANGAN GUNAKAN ACCESS MODIFIER PUBLIC SEPERTI INI

    public Robot(String nama) {
        this.nama = nama;
        System.out.println("Halo saya " + this.nama);
    }

    public Robot(String nama, String warna) {
        this.model = "";
        this.nama = nama;
        this.warna = warna;
        System.out.println("Halo saya " + this.nama + " dengan warna " + this.warna);
    }

    /**
     * Setter - Getter klasik dengan buat method manual
     * tidak perlu lagi karena sudah pake @Data dari library lombok
     */
//    public String getNama() {
//        return nama;
//    }
//
//    public void setNama(String nama) {
//        this.nama = nama;
//    }
//
//    public String getWarna() {
//        return warna;
//    }
//
//    public void setWarna(String warna) {
//        this.warna = warna;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }

    /**
     * Polymorphism method overloading hanya akan berfungsi jika :
     * 1. jumlah parameter berbeda
     * 2. Tipe data parameter berbeda
     *
     * Robot.melambaikanTangan(String, String, Integer);
     * Robot.melambaikanTangan(String, String, Integer);
     */
    public void melambaikanTangan() {
        System.out.println(this.nama + " melambaikan tangannya");
    }

    public void melambaikanTangan(String beda) {
        System.out.println(this.nama + " melambaikan tangannya");
    }

    public void melambaikanTangan(Integer totalLambaikanTangan) {

    }

    public void melambaikanTangan(String beda, Integer totallambaikanTangan) {
        if(beda != null && beda.equals("")) {

        }
        if(totallambaikanTangan != null && beda.equals("")) {

        }
    }

    private void bisikBisik() {
        System.out.println("Robotnya bisik-bisik");
    }

    protected void ngegosip() {
        System.out.println("Robotnya gosipin yang punya");
    }

    void ngomongSendiri() {

    }

    public void testInnerClass() {
        InnerPrivate inner1 = new InnerPrivate();
        InnerProtected inner2 = new InnerProtected();
    }

    // innerClass
    private class InnerPrivate {

    }

    protected class InnerProtected {

    }

    public class InnerPublic {

    }
}
