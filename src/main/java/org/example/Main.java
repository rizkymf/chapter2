package org.example;

import org.example.model.Robot;
import org.example.topic2.AbstractClass;
import org.example.topic2.AbstractClassImplementasi;
import org.example.topic2.Bulan;
import org.example.topic2.BulanEnum;
import org.example.topic2.InterfaceClass;
import org.example.topic2.InterfaceClassImpl;
import org.example.topic2.InterfaceClassImplementasi;
import org.example.topic2.UtilClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Topic 1-------------");
        Robot robot = new Robot("Fajar Sadboy", "Hitam");
        Robot robotBarbie = new Robot("Barbie", "Pink");
        Robot robotSkripsi = new Robot();

        robotBarbie.melambaikanTangan();
        robot.melambaikanTangan();
        robot.melambaikanTangan("");

        robot.setModel("model1");
        robot.getModel();

        // gabisa karena aksesnya protected
//        robotSkripsi.ngegosip();
//        robotSkripsi.ngomongSendiri();
        // TODO : cari tau instantiate innerclass
//        Robot.InnerPublic innerPublic = new Robot().InnerPublic();

        robotBarbie.tahunProduksi = 2023;

        robotSkripsi.setNama("Skripsi chan");
        robotSkripsi.setWarna("Abu-abu");
        robotSkripsi.setModel("Buku");

        robotSkripsi = Robot.builder()
                .nama("Skripsi chan")
                .warna("Abu-abu")
                .model("Buku")
                .build();

        robotSkripsi.setWarna("Merah");

        System.out.println("-----------Topic 2-------------");
//        AbstractClass abstractClass = new AbstractClassImplementasi();
        // Controller, Model, Service
        // paymentGopay();
        InterfaceClass interfaceClassImplementasi = new InterfaceClassImplementasi();
        InterfaceClass interfaceClassImpl = new InterfaceClassImpl();

        interfaceClassImplementasi.interfaceMethod();
        interfaceClassImpl.interfaceMethod();

        Integer[] angkaBanyak = {1, 5, 2, 9};
        angkaBanyak = UtilClass.doSort(angkaBanyak);
        System.out.println(UtilClass.version);
        UtilClass.version = "v.2.1.0";
        if(Bulan.JANUARI == 1) {
            System.out.println("ini bulan januari");
        }
        if(BulanEnum.JANUARI.getBulanNum() == 1) {
            System.out.println("ini bulan pertama");
        }

        String angkaString = "1";
        Integer angkaInteger = Integer.valueOf(angkaString);

        System.out.println(angkaString + 1);
        // after gopay paid > push notification
    }
}