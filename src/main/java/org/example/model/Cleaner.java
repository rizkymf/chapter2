package org.example.model;

import org.example.topic2.InterfaceClass;

public class Cleaner {

    InterfaceClass interfaceClass;

    public Cleaner(InterfaceClass interfaceClass) {
        this.interfaceClass = interfaceClass;
    }

    public void gosipinTetangga() {
        Robot robot = new Robot();

        robot.ngegosip();
        robot.ngomongSendiri();

        interfaceClass.autoPublicAbstract();
    }

}
