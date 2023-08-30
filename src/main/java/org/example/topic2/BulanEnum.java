package org.example.topic2;

// Enum itu panjangnya adalah enumerations
public enum BulanEnum {
    JANUARI(1),
    FEBRUARI(2),
    MARET(3),
    APRIL(4);

    private Integer bulanNum;

    BulanEnum(Integer bulanNum) {
        this.bulanNum = bulanNum;
    }

    public Integer getBulanNum() {
        return bulanNum;
    }
}
