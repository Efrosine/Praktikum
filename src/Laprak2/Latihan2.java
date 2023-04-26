package Laprak2;

public class Latihan2 {
    int[] deret;

    public int[] getDeret() {
        return deret;
    }

    public void setDeret(int[] deret) {
        this.deret = deret;
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

    public void tampil(double a[]) {
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
