import java.util.regex.Pattern;

public enum UuidEnum {
    DIVIDED_UUID("^(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{12})", "$1-$2-$3-$4-$5"),
    FRAMED_UUID("^(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{12})", "{$1$2$3$4$5}"),
    DIVIDED_FRAMED_UUID("^(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{12})", "{$1-$2-$3-$4-$5}"),
    UUID("^(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{12})", "$1$2$3$4$5");

    Pattern pattern;
    String convert;

    UuidEnum(String format, String convert) {
        pattern = Pattern.compile(format);
        this.convert = convert;
    }

    public Pattern getFormat() {
        return pattern;
    }

    public String getConvert() {
        return convert;
    }
}