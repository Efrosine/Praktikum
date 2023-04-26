package Laprak2;

public class Arr {
    int[] barisAngka;

    public int[] getBarisAngka() {
        return barisAngka;
    }

    public void setBarisAngka(int[] barisAngka) {
        this.barisAngka = barisAngka;
    }

    public void tampil(int a[]) {
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                data += a[i];
            } else {
                data += ", " + a[i];
            }
        }
        System.out.println(data);
    }
}