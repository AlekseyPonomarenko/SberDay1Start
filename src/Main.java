import conversion.ConversionMain;
import conversion.Temperature;
import figures.FiguresMain;
import sorting.SortingMain;

public class Main {

    public static void main(String[] args) {

        SortingMain.main(args);
        System.out.println("******************************************");
        FiguresMain.main(args);
        System.out.println("******************************************");
        ConversionMain.main(args);

    }
}
