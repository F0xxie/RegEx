import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.UUID;

public class Main {

    public static void main(String[] args){
        String s = UUID.randomUUID().toString();
        s = s.replaceAll("-", "");

        System.out.println("Default: " + s);
        UuidTransformer.UUIDTransformer(s, UuidEnum.FRAMED_UUID.getFormat(), UuidEnum.DIVIDED_FRAMED_UUID);
        UuidTransformer.UUIDTransformer(s, UuidEnum.UUID.getFormat(), UuidEnum.DIVIDED_FRAMED_UUID);
        UuidTransformer.UUIDTransformer(s, UuidEnum.FRAMED_UUID.getFormat(), UuidEnum.FRAMED_UUID);
        UuidTransformer.UUIDTransformer(s, UuidEnum.UUID.getFormat(), UuidEnum.DIVIDED_UUID);
        UuidTransformer.UUIDTransformer(s, UuidEnum.UUID.getFormat(), UuidEnum.DIVIDED_FRAMED_UUID);
        UuidTransformer.UUIDTransformer(s, UuidEnum.DIVIDED_UUID.getFormat(), UuidEnum.DIVIDED_FRAMED_UUID);
    }
}