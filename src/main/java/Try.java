import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Try {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("dep/pom.xml");
        Charset charset = StandardCharsets.UTF_8;

        String content = new String(Files.readAllBytes(path), charset);
//        System.out.println(content);

        Pattern pattern = Pattern.compile("<version\\.org\\.springframework>(.*)</version\\.org\\.springframework>");

        Matcher matcher = pattern.matcher(content);
        System.out.println(matcher.find());
        System.out.println(matcher.group(1));
    }
}
