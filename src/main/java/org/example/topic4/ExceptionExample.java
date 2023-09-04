package org.example.topic4;

import org.example.model.Robot;

public class ExceptionExample {

    public void contohException(Robot robot) {
        int nilai;
//        Robot robot; // null
//        Robot robot = new Robot();
//        Robot robot = null;
        String introduction = "Hello nama saya " + robot.getNama();
        System.out.println(introduction);
    }

    public Integer hargaPerPcs(Integer harga, Integer totalBarang) throws NullPointerException, ArithmeticException {
        Integer result = harga / totalBarang;
        System.out.println("Harga per pcs adalah : " + result);
        return result;
    }

    public String hitungHarga(Integer hargaPerPcs, Integer lusin) throws NullPointerException {
        Integer hargaTotal = hargaPerPcs * lusin;
        return "Total harga adalah : " + hargaTotal.doubleValue();
    }
}
