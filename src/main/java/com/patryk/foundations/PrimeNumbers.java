package com.patryk.foundations;

public class PrimeNumbers {
    public static void main(String[] args) {

//        for (int liczbaSprawdzana = 1; liczbaSprawdzana < 100; liczbaSprawdzana++) {
//            for (int dzielnik = 1; dzielnik <= liczbaSprawdzana; dzielnik++) {
//                if (liczbaSprawdzana % dzielnik != 0) {
//                    continue;
//                } else {
//                    System.out.println(liczbaSprawdzana + " jest pierwsz?");
//                }
//            }
//        }

        for (int liczbaSprawdzana = 2; liczbaSprawdzana < 100; liczbaSprawdzana++) {
            boolean czyPierwsza = true;
            for (int dzielnik = 2; dzielnik <= Math.sqrt(liczbaSprawdzana); dzielnik++) {
                if (liczbaSprawdzana % dzielnik == 0) {
                    czyPierwsza = false;
                    break;
                }
            }
            if (czyPierwsza) {
                System.out.println(liczbaSprawdzana + " jest liczb? pierwsz?");
            }
        }

        for (int i = 2; i <= 26; i++) {
            if (26 % i == 0) {
                System.out.println(i + " jest dzielnikiem 26");
            }
        }

    }
}
