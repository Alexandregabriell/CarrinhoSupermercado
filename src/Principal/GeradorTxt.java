package Principal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GeradorTxt {

    String path = "C:\\Users\\jessi\\ALEXANDRE\\compra.txt";

    public GeradorTxt(ArrayList<String> lines) {
        ProcessarTexto(lines);
    }

    public void ProcessarTexto(ArrayList<String> lines) {
        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
