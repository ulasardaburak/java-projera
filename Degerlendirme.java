public class Degerlendirme {
    public static void main(String[] args) {
        int ogrenciNotu = 100;

        if (ogrenciNotu <= 0 || ogrenciNotu > 100) {
            System.out.println("Geçersiz puan girdiniz.");
        } else {
            String harfNotu = null;
            String mesaj = null;

            if (ogrenciNotu >= 0 && ogrenciNotu < 35) {
                harfNotu = "FF";
                mesaj = " ile kaldiniz";
            } else if (ogrenciNotu >= 35 && ogrenciNotu < 45) {
                harfNotu = "DD";
                mesaj = " ile kaldiniz";
            } else if (ogrenciNotu >= 45 && ogrenciNotu < 50) {
                harfNotu = "DC";
                mesaj = " ile geçtiniz";
            } else if (ogrenciNotu >= 50 && ogrenciNotu < 55) {
                harfNotu = "CC";
                mesaj = " ile geçtiniz";
            } else if (ogrenciNotu >= 55 && ogrenciNotu < 63) {
                harfNotu = "CB";
                mesaj = " ile geçtiniz";
            } else if (ogrenciNotu >= 63 && ogrenciNotu < 71) {
                harfNotu = "BB";
                mesaj = " ile geçtiniz";
            } else if (ogrenciNotu >= 71 && ogrenciNotu < 80) {
                harfNotu = "BA";
                mesaj = " ile geçtiniz";
            } else if (ogrenciNotu >= 80 && ogrenciNotu <= 100) {
                harfNotu = "AA";
                mesaj = " ile geçtiniz";
            } else {
                harfNotu = "";
                mesaj = "";
            }
            System.out.println("Aldığınız puan : " + ogrenciNotu + "\n" + harfNotu + mesaj);
        }

    }
}

