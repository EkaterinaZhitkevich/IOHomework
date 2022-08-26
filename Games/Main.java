package Games;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) throws IOException {
        createDirectory("C:\\Users\\Екатерина\\Documents\\Games", "src");
        createDirectory("C:\\Users\\Екатерина\\Documents\\Games", "res");
        createDirectory("C:\\Users\\Екатерина\\Documents\\Games", "savegames");
        createDirectory("C:\\Users\\Екатерина\\Documents\\Games", "temp");

        createDirectory("C:\\Users\\Екатерина\\Documents\\Games\\src", "main");
        createDirectory("C:\\Users\\Екатерина\\Documents\\Games\\src", "test");

        createFile("C:\\Users\\Екатерина\\Documents\\Games\\src\\main", "Main.java");
        createFile("C:\\Users\\Екатерина\\Documents\\Games\\src\\main", "Utils.java");

        createDirectory("C:\\Users\\Екатерина\\Documents\\Games\\res", "drawables");
        createDirectory("C:\\Users\\Екатерина\\Documents\\Games\\res", "vectors");
        createDirectory("C:\\Users\\Екатерина\\Documents\\Games\\res", "icons");

        createFile("C:\\Users\\Екатерина\\Documents\\Games\\temp", "temp.txt");

//        System.out.println(stringBuilder);

        try (FileWriter fileWriter = new FileWriter("C:\\Users\\Екатерина\\Documents\\Games\\temp\\temp.txt")) {
            fileWriter.write(String.valueOf(stringBuilder));
            fileWriter.flush();
        } catch (IOException e){
            e.getMessage();
        }
    }

    public static void createFile(String dirPath, String fileName) {
        File file = new File(dirPath, fileName);
        try {

            if (file.createNewFile()) {
                stringBuilder.append("Файл успешно создан ");
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static void createDirectory(String dirPath, String directoryName) {
        File dir = new File(dirPath, directoryName);
        if (dir.mkdir()) {
            stringBuilder.append("Каталог успешно создан ");
        }
    }
}
