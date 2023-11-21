public class LoopWhile {

    public static void main(String[] args) {

        int i = 10;
//        while (i <= 20) {
//            System.out.println(i);
//            i++; // ta petla nie wykona sie nigdy gdy warunek nie zostanie spelniony
//        }

        do{
            System.out.println("Jestem w do");
            System.out.println(i);
            i++;
        } while ( i >= 20); // ta petla wykona sie przynajmniej raz gdy warunek nie zostal spelniony


    }
}