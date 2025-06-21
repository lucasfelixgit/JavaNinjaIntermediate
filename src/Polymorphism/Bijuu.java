package Polymorphism;

public enum Bijuu {

    SHUKAKU(1,"Shukaku","Gaara"),
    MATATABI(2, "Matatabi", "Yugito Nii"),
    ISOBU(3, "Isobu", "Yagura"),
    SON_GOKU(4, "Son Goku", "Roshi"),
    KOKUO(5, "Kokuo", "Han"),
    SAIKEN(6, "Saiken", "Utakata"),
    CHOMEI(7, "Chomei", "Fuu"),
    GYUKI(8, "Gyuki", "Killer Bee"),
    KURAMA(9, "Kurama", "Naruto Uzumaki");

    int tails;
    String bijuuName;
    String jinchuriki;

    Bijuu(int tails, String bijuuName, String jinchuriki) {
        this.tails = tails;
        this.bijuuName = bijuuName;
        this.jinchuriki = jinchuriki;
    }

    Bijuu() {
    }

    public int getTails() {
        return tails;
    }

    public String getBijuuName() {
        return bijuuName;
    }

    public String getJinchuriki() {
        return jinchuriki;
    }

}
