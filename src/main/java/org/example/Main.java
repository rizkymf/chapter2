package org.example;

import org.example.model.Cleaner;
import org.example.model.Product;
import org.example.model.Robot;
import org.example.topic2.AbstractClass;
import org.example.topic2.AbstractClassImplementasi;
import org.example.topic2.Bulan;
import org.example.topic2.BulanEnum;
import org.example.topic2.InterfaceClass;
import org.example.topic2.InterfaceClassImpl;
import org.example.topic2.InterfaceClassImplementasi;
import org.example.topic2.UtilClass;
import org.example.topic4.BEJException;
import org.example.topic4.ExceptionExample;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("-----------Topic 1-------------");
//        Robot robot = new Robot("Fajar Sadboy", "Hitam");
//        Robot robotBarbie = new Robot("Barbie", "Pink");
//        Robot robotSkripsi = new Robot();
//
//        robotBarbie.melambaikanTangan();
//        robot.melambaikanTangan();
//        robot.melambaikanTangan("");
//
//        robot.setModel("model1");
//        robot.getModel();
//
//        // gabisa karena aksesnya protected
////        robotSkripsi.ngegosip();
////        robotSkripsi.ngomongSendiri();
//        // TODO : cari tau instantiate innerclass
////        Robot.InnerPublic innerPublic = new Robot().InnerPublic();
//
//        robotBarbie.tahunProduksi = 2023;
//
//        robotSkripsi.setNama("Skripsi chan");
//        robotSkripsi.setWarna("Abu-abu");
//        robotSkripsi.setModel("Buku");
//
//        robotSkripsi = Robot.builder()
//                .nama("Skripsi chan")
//                .warna("Abu-abu")
//                .model("Buku")
//                .build();
//
//        robotSkripsi.setWarna("Merah");
//
//        System.out.println("-----------Topic 2-------------");
////        AbstractClass abstractClass = new AbstractClassImplementasi();
//        // Controller, Model, Service
//        // paymentGopay();
//        InterfaceClass interfaceClassImplementasi = new InterfaceClassImplementasi();
//        InterfaceClass interfaceClassImpl = new InterfaceClassImpl();
//
//        interfaceClassImplementasi.interfaceMethod();
//        interfaceClassImpl.interfaceMethod();
//
//        Integer[] angkaBanyak = {1, 5, 2, 9};
//        angkaBanyak = UtilClass.doSort(angkaBanyak);
//        System.out.println(UtilClass.version);
//        UtilClass.version = "v.2.1.0";
//        if(Bulan.JANUARI == 1) {
//            System.out.println("ini bulan januari");
//        }
//        if(BulanEnum.JANUARI.getBulanNum() == 1) {
//            System.out.println("ini bulan pertama");
//        }
//
//        String angkaString = "1";
//        Integer angkaInteger = Integer.valueOf(angkaString);
//
//        System.out.println(angkaString + 1);
        // after gopay paid > push notification

//        InterfaceClass interfaceClass = new InterfaceClassImplementasi();
//        Cleaner cleaner = new Cleaner(interfaceClass);
//        cleaner.gosipinTetangga();

//        Integer[] angka = new Integer[5];
//        angka[0] = 1;
        // ...
//        angka[4] = 2;

        // 1 5 9 .. 10

//        List<Integer> angkaList = new ArrayList<>();
//        angkaList.add(1);
//        angkaList.add(2);
//        angkaList.add(3);
//        for(int i = 0; i < angkaList.size(); i++) {
//            System.out.print(angkaList.get(i));
//        }
//        System.out.println("length angkaList " + angkaList.size());
//        angkaList.remove(1);
//        for(int i = 0; i < angkaList.size(); i++) {
//            System.out.print(angkaList.get(i));
//        }
//        System.out.println("length angkaList " + angkaList.size());
//
//        Queue<String> antrian = new ConcurrentLinkedQueue<>();
//        antrian.add("Rizky");
//        antrian.add("Andika");
//        antrian.add("Solah");
//        antrian.add("Gunawan");
//        System.out.println("jumlah antrian "  + antrian.size());
//
//        System.out.println(antrian.poll());
//        System.out.println("jumlah antrian "  + antrian.size());
//
//        Stack<String> tumpukan = new Stack<>();
//
//        List<String> vector = new Vector<>();
//
//        Set<String> namaStudent = new HashSet<>();
//        namaStudent.add("Rizky");
//        namaStudent.add("Andika");
//        namaStudent.add("Rizky");
//        namaStudent.add("Solah");
//        namaStudent.add("Rizky");
//        namaStudent.add("Gunawan");
//        System.out.println("size nya set : " + namaStudent.size());

//        namaStudent.stream().forEach(val -> {
//            if(val.equals("Gunawan")) {
//                System.out.println("namaStudent set : " + val);
//            }
//        });

//        Map<String, Robot> robotMap = new HashMap<>();
//        robotMap.put("si merah", Robot.builder().nama("red").warna("red").build());
//        robotMap.put("si biru", Robot.builder().nama("blue").warna("blue").build());
//        robotMap.put("si kuning", Robot.builder().nama("yellow").warna("yellow").build());
//
//        Robot robotRed = robotMap.get("si merah");
//        System.out.println("Robot bernama " + robotRed.getNama() + " berwarna " + robotRed.getWarna());
//
//        Map<Integer, Product> productMap = new HashMap<>();
//        productMap.put(1, Product.builder().productName("nasi goreng").harga(15000).build());
//        productMap.get(1);
//        Map<Integer, List<String>> productMapList = new HashMap<>();
//        productMapList.put(1, Arrays.asList("Nasi Goreng", "15000"));

//        Product product = new Product()

//        List<Product> products = new LinkedList<>();
//        Robot robot = null;
//
        ExceptionExample exceptionExample = new ExceptionExample();
//        exceptionExample.contohException(robot);
        Integer harga = null;
        Integer barang = null;
        try
//                (Scanner scan = new Scanner(System.in);
//             PrintWriter printWriter = new PrintWriter(new File("uhu")))
        {
            System.out.print("Harga : ");
            harga = scanner.nextInt();
            System.out.print("Total : ");
            barang = scanner.nextInt();
            if(barang < 0) {
                throw new BEJException("Angka tidak boleh kurang dari 0 ges");
            }
            Integer hargaPerPcs = exceptionExample.hargaPerPcs(harga, barang);
            String hargaSelusin = exceptionExample.hitungHarga(hargaPerPcs, 12);
            System.out.println(hargaSelusin);
        } catch(InputMismatchException ime) {
            System.out.println("Input harus berupa angka / numeric yang positif");
        } catch(NullPointerException|ArrayIndexOutOfBoundsException npe) {
            System.out.println("Input tidak boleh null");
        } catch(Exception e) {
            System.out.println("Ups! Terjadi kesalahan, dikarenakan : " + e.getMessage());
        } finally {
            // block finally akan dijalanin meski error atau tidak
            System.out.println("Block finally");
        }

        System.out.println("Terima kasih sudah berkunjung");
        scanner.close();
    }
}