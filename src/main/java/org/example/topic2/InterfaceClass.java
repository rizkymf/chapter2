package org.example.topic2;

public interface InterfaceClass {
    public abstract void interfaceMethod();
    void autoPublicAbstract(); // class interface udah auto public abstract
    void sameMethodName();

    default void defaultMethod() {
        // bisa pake implementasi dengan keyword default
    }

    /**
     * public void gabisaImplement() {
     *
     * }
     */
}
