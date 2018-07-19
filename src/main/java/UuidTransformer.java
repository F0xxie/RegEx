import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UuidTransformer {
    public static void UUIDTransformer(String s, UuidEnum from, UuidEnum to){
        if (to == from){
            System.out.println(s);
        }

        switch (to){
            case DIVIDED_UUID: {
                dividedUuid(s);
                break;
            }
            case FRAMED_UUID: {
                framedUuid(s);
                break;
            }
            case DIVIDED_FRAMED_UUID: {
                dframedUuid(s);
                break;
            }
        }
        //return null;
    }


    private static void dframedUuid(String s) {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("{");
        sb.append(s);
        sb.insert(9, "-");
        sb.insert(14, "-");
        sb.insert(19, "-");
        sb.insert(24, "-");
        sb.append("}");
        System.out.println("DF: " + sb);
    }

    private static void framedUuid(String s) {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("{");
        sb.append(s);
        sb.append("}");
        System.out.println("F: "+sb);
    }

    private static void dividedUuid(String s) {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(s);
        sb.insert(9, "-");
        sb.insert(14, "-");
        sb.insert(19, "-");
        sb.insert(24, "-");
        System.out.println("D: " + sb);
        return;
    }
}


