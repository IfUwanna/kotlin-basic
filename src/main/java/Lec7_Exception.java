import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/**
 * Created by jihun.park@navercorp.com on 2022-09-27.
 */
public class Lec7_Exception {

    public static void main(String[] args) throws IOException {
        readFile("/");
    }

    private int parseIntOrThrow(@NotNull String str){
        try{
            return Integer.parseInt(str);
        }catch(NumberFormatException e){
            throw new IllegalArgumentException(String.format("주어진 %s는 숫자가 아닙니다.",str));
        }
    }
    private Integer parseIntOrThrowV2(@NotNull String str){
        try{
            return Integer.parseInt(str);
        }catch(NumberFormatException e){
            return null;
        }
    }

    public static void readFile() throws IOException {
        File currentFile = new File(".");
        File file = new File(currentFile.getAbsolutePath() + "/a.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        System.out.println(reader.readLine());
        reader.close();

    }

    public static void readFile(String path) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            System.out.println(reader.readLine());
    }
}

}
