import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.UUID;

public class Main {

    public static void main(String[] args){
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replaceAll("-", "");
        String s = uuid;

        System.out.println("Default: " + uuid);

        //System.out.println("from\nstock\ndf\nf\nd");

        UuidTransformer.UUIDTransformer(s, UuidEnum.UUID, UuidEnum.FRAMED_UUID);
        UuidTransformer.UUIDTransformer(s, UuidEnum.UUID, UuidEnum.DIVIDED_UUID);
        UuidTransformer.UUIDTransformer(s, UuidEnum.UUID, UuidEnum.DIVIDED_FRAMED_UUID);
    }
}