import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class XOREncryption {

    public static void main(String[] args) {

        File dataFile = new File("data.txt");
        File keyFile = new File("key.txt");
        File outputFile = new File("encrypted.txt");

        try {
            FileInputStream dataStream = new FileInputStream(dataFile);
            FileInputStream keyStream = new FileInputStream(keyFile);

            byte[] dataBytes = new byte[dataStream.available()];
            byte[] keyBytes = new byte[keyStream.available()];

            dataStream.read(dataBytes);
            keyStream.read(keyBytes);

            dataStream.close();
            keyStream.close();

            for (int i = 0; i < dataBytes.length; i++) {
                int keyIndex = i % keyBytes.length;
                dataBytes[i] = (byte) (dataBytes[i] ^ keyBytes[keyIndex]);
            }

            FileOutputStream outputStream = new FileOutputStream(outputFile);
            outputStream.write(dataBytes);
            outputStream.close();

            System.out.println("Encryption complete.");

        } catch (IOException e) {
            System.out.println("No file.");
        }
    }
}
