package org.example.topic2;

public abstract class AbstractClass implements InterfaceClass {

    private String namaKelas;

    public AbstractClass() {

    }

    public abstract void methodAbstract();
    public abstract void sameMethodName();

    public void directImplement() {
        System.out.println("Direct Implementation of abstract class");
    }

}
