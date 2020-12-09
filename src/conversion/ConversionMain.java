package conversion;

public class ConversionMain {
    public static void main(String[] args) {

        //Реализовать конвертеры температуры. Считаем, что значения будут поступать по шкале Цельсия, конвертеры должны преобразовывать значение в свою шкалу

        System.out.println("Конвертер температуры!");
        //Можно конечно использовать
        //Scanner in = new Scanner(System.in); int num = in.nextInt();
        //Но не буду, т.к. цель другая

        System.out.println(new Temperature(20F));
        System.out.println(new Temperature(21F));
        System.out.println(new Temperature(22F));
        System.out.println(new Temperature(23F));
    }
}
