import java.util.*;
import java.io.*;

class CommitGenerator {
    public static final void main(String[] args) {
        new Thread(() -> {
            try {
                File folder = new File("gen");
                
                if (!folder.exists()) {
                    folder.mkdir();
                }

                File fe = new File("gen/README.yml");
                FileWriter fw = new FileWriter(fe);
                BufferedWriter bufferedWriter = new BufferedWriter(fw);

                bufferedWriter.write(new Date().toString());
                bufferedWriter.close();
                fw.close();
                
                System.out.println("Successfully generate file");
            } catch (Exception en) {
                System.out.println("Failed to generate file: " + en.getMessage());
            }
        }).start();
    }
}