public class KolkoIKrzyzyk {

//    wersja z wątkami


    public static void main(String[] args) {

        Okno oknoGlowne = new Okno();
        oknoGlowne.setVisible(true);
        new Polacz(oknoGlowne);

    }
}
