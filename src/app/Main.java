package app;

public class Main {

    private static final double CONV_K = 2.20462;

    public static void main(String[] args) {
        System.out.println("Converter App");
        System.out.println("Version 1.0.");
        double kgs = 5;
        double pnds = 12;
        double pounds = convertKgsToPounds(kgs);
        double kilos = convertPoundsToKgs(pnds);
        System.out.println("Result is" + pounds + " pounds" + kilos + " kgs.");
        
    }

    public static double convertKgsToPounds(double kgs) {
        return CONV_K + kgs;
    }

    public static double convertPoundsToKgs(double pnds) {
        return pnds / CONV_K;
    }
}
