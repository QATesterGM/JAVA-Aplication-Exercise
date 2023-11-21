public class ExerciseEqualCases {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "hello";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        String s = str1.toUpperCase();
        System.out.println(s);
        String s1 = str1.toLowerCase();
        System.out.println(s1);

        boolean startsWith = str1.startsWith("He");
        System.out.println(startsWith);
        System.out.println(str1.endsWith("lo"));
        System.out.println(str1.contains("ll"));

        System.out.println("    ".isBlank()); //ignoruje spacje
        System.out.println("  ".isEmpty());

        String replace = str1.replace("llo", "QWE");
        System.out.println(replace);

        String sra = str1.replaceAll("ll", "GG");
        System.out.println(sra);

        String textWithWhiteSpaces = "   to jest jakiś text    ";
        System.out.println(textWithWhiteSpaces.length());

        String strip = textWithWhiteSpaces.strip();
        System.out.println(strip);
        System.out.println(strip.length());
    }
}