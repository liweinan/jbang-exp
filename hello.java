import java.nio.file.Path;
import java.nio.file.Paths;

class hello {

    public static void main(String... args) throws Exception {
        System.out.println("HELLO WORLD!");
        String str = "xxx_SPRING_VER_xxx";
//        str.replaceAll("");
        Path path = Paths.get(".");
        System.out.println(path.toAbsolutePath());

    }
}
