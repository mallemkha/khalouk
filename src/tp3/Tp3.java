package tp3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.Writer;

/**
 *
 * @author ABDELKHALEK
 */
public class Tp3 {
    
    static Cesar cesar = new Cesar();
    static int cle = 2;
    static String msg = "";
    static String decyted = "";
    static String cipher = "";  
    public static void main(String[] args) throws Exception {
        
        //File encFile = new File("enc.txt");
        //FileInputStream fread = new FileInputStream(encFile); 
        
        FileReader reader = new FileReader(new File("C:\\Users\\ABDELKHALEK\\Documents\\NetBeansProjects\\tp3\\src\\tp3\\enc.txt"));
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            msg += line;
        }
        reader.close();
        
        // cryptage 
        cipher = cesar.crypter(cle, msg);
        System.out.println("Message crypter: " + cipher);
        
        // decryptage 
        decyted = cesar.derypter(cle, cipher);
        System.out.println("Message decrypter (Original): " + decyted);
        
        Writer fileWriter = new FileWriter(new File("C:\\Users\\ABDELKHALEK\\Documents\\NetBeansProjects\\tp3\\src\\tp3\\dec.txt"));
        fileWriter.write(cipher);

    }
    
}
