public class LogicalOperators {

    public static void main(String[] args) {

        int numberA = 10;
        int numberB = 3;

        boolean result = numberA == numberB;
        System.out.println(result);

        result = numberA > numberB;
        System.out.println(result);

        result = numberA != numberB;
        System.out.println(result);

        result = numberA < numberB;
        System.out.println(result);

        result = numberA <= numberB;
        System.out.println(result);

        boolean result1 = numberA > numberB; //true
        boolean result2 = numberA != numberB; //true
        boolean result3 = numberA < numberB; //false

        System.out.println("conjunction operator: ");
        boolean resultConjunction = result1 && result3;
        System.out.println(resultConjunction);

        System.out.println("alternative operator: ");
        boolean resultAlternative = resultConjunction || result3;
        System.out.println(resultAlternative);


    }
}