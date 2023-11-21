public class MathematicalOperators {

    public static void main(String[] args) {

        int numberA = 10;
        int numberB = 3;

        System.out.println(numberA + numberB);
        System.out.println(numberA - numberB);
        System.out.println(numberA * numberB);
        System.out.println(numberA / numberB);
        System.out.println(numberA % numberB);

        int numberC = numberA + numberB;
        System.out.println(numberC);

        System.out.println(numberA + numberB);
        System.out.println(numberA - numberB);
        System.out.println(numberA * numberB);
        System.out.println(numberA / numberB);
        System.out.println(numberA % numberB);
        System.out.println(numberC);

        numberB = 30;

        if (numberA > numberB) {
            System.out.println("number A is greater than number B");
        } else {
            System.out.println("number A is less than number B");
        }
    }
}