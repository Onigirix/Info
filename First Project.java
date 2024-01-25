import java.io.File;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!"); 
    }
    //TODO: Testen
    public static String readFile(String path) {
        try{
            File object = new File(path);
            Scanner reader = new Scanner(object);
            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                return data;
            }
            reader.close();
        } catch(FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
            return;
        }
    }
    //TODO: Testen
    public static void appendToFile(String path, String content) {
        try {
            FileWriter writer = new FileWriter(path, true);
            writer.write(content);
            writer.close();
        } catch(IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
            return;
        }
    }
    //TODO: Inhalte eines Ordners in Datei
    //TODO: Metadaten in die Datei
    //TODO: Screenshots
    //TODO: Passwörter
    //TODO: Dateien löschen
    //TODO: Netzwerkkomponenten
}
