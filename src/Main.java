public class Main {
    public static void main(String[] args) {
        System.out.println("Conversor de temperaturas");
        int celcius = 500;
        float fahrenheit = (float) ((celcius * 1.8) + 32);
        String result = String.format("%d Grados Celsius equivalen a %.1f Grados Fahrenheit", celcius, fahrenheit);
        System.out.println(result);
    }
}