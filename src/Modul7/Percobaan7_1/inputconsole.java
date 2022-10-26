package Modul7.Percobaan7_1;

import java.io.*;

public class inputconsole {
    public static String readString() {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String string = "";
        try {
            string = bfr.readLine();
        } catch (Exception e) {
            System.out.println(e);
        }
        return string;
    }

    public int readInt() {
        return Integer.parseInt(readString());
    }

    public static double readDouble() {
        return Double.parseDouble(readString());
    }
}
