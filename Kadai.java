import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class Kadai{
    public static void main(String args[]) {
        try(BufferedReader br =Files.newBufferedReader(
            Paths.get(".", "rtg1000", "scores.csv"))) {
            
            String line;
            while ((line = br.readLine()) != null) {
                    System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}