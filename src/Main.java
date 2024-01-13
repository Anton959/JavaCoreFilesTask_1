import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static StringBuilder log = new StringBuilder();

    public static void main(String[] args) {

        File src = new File("C:\\Users\\Администратор\\Desktop\\Games\\src"); //src
        createDirectory(src);

        File res = new File("C:\\Users\\Администратор\\Desktop\\Games\\res"); //res
        createDirectory(res);

        File saveGames = new File("C:\\Users\\Администратор\\Desktop\\Games\\saveGames"); //saveGames
        createDirectory(saveGames);

        File temp = new File("C:\\Users\\Администратор\\Desktop\\Games\\temp"); // temp
        createDirectory(temp);

        File main = new File("C:\\Users\\Администратор\\Desktop\\Games\\src\\main"); // main
        createDirectory(main);

        File test = new File("C:\\Users\\Администратор\\Desktop\\Games\\src\\test"); // test
        createDirectory(test);

        File Main = new File("C:\\Users\\Администратор\\Desktop\\Games\\src\\main\\Main.java");
        createFile(Main);

        File Utils = new File("C:\\Users\\Администратор\\Desktop\\Games\\src\\main\\Utils.java");
        createFile(Utils);

        File drawables = new File("C:\\Users\\Администратор\\Desktop\\Games\\res\\drawables");
        createDirectory(drawables);

        File vectors = new File("C:\\Users\\Администратор\\Desktop\\Games\\res\\vectors");
        createDirectory(vectors);

        File icons = new File("C:\\Users\\Администратор\\Desktop\\Games\\res\\icons");
        createDirectory(icons);

        File Temp = new File("C:\\Users\\Администратор\\Desktop\\Games\\temp\\Temp.txt");
        createFile(Temp);

        String tempPath = Temp.getPath();
        appendUsingFileWriter(tempPath, log.toString());
    }

    public static void createDirectory(File f){
        if(f.mkdir())
            log.append("Директория " + f + " успешно создана \n");
        else
            log.append("При создании директории " + f + " что-то пошло не так \n");
    }

    public static void createFile(File f){
        try {
            if(f.createNewFile()){
                log.append("Файл успешно создан в " + f);
            }
        } catch (IOException exception){
            log.append("Ошибка создания файла: " + exception);
        }
    }

    // добавляем информацию в файл с помощью FileWriter
    private static void appendUsingFileWriter(String filePath, String text) {
        File file = new File(filePath);
        FileWriter fr = null;
        try {
            fr = new FileWriter(file,true);
            fr.write(text);

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}