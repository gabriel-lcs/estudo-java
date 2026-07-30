package util;

public class CurrencyConverter {
    public static double TAX = 6.0 / 100.00;

    public static double converter(double dolar, double dinheiro){
        return (dolar * dinheiro) + (dolar * dinheiro) * TAX;
    }
}
