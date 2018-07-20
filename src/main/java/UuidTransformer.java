import java.util.regex.Pattern;

public class UuidTransformer {
    public static void UUIDTransformer(String s, Pattern from, UuidEnum to) {
        System.out.println(s.replaceAll(from.pattern(), to.getConvert()));
    }
}