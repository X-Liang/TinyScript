package lexer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Keywords {
    static String[] keywords = {
            "var",
            "if",
            "else",
            "for",
            "while",
            "break",
            "func",
            "return",
    };

    static Set<String> keywordSet = new HashSet<>(Arrays.asList(keywords));
    public static boolean isKeyword(String value) {
        return keywordSet.contains(value);
    }
}
