import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Целые числа
        byte b = 127; // -128 : 127 -> 1b
        short sh = 32000; // -32768 до 32767 -> 2b
        int in = 2356735; // -2 147 483 648 до 2 147 483 647 -> 4b
        long lo = 1254653824592356L;


        //Дроби
        double doub = 3.14159265;
        float fl = 3.14159265F;

        //Логический тип
        boolean f = false;
        boolean t = true;


        // Символы
        char sim = 'c'; // от 0 до 65535 -> 2b
        char ch = 1235;

        System.out.println(in);

        double rand = Math.random();
        System.out.println(rand);

        Random random = new Random();
        int randint = random.nextInt(0, 240000);
        System.out.println(randint);


        String str = "Моя строка";
        String bigstr =
                """
                   This is a text
                   yuiyyytvvvvvvvvvvvvvvvvuyi
                   yjttttttttttt
                   tyuibbbbbbbbbbbbbbbb     
                """;




    }

}
