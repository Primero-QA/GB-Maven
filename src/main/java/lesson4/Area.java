package lesson4;

public class Area {
    public static double getArea(Integer a, Integer b, Integer c) throws NonPositiveException {
        if (a <= 0 || b <= 0 || c<= 0) {
            throw new NonPositiveException("Такого треугольника не существует!");
        }
        double p = (0.5 * (a + b + c));
        double area = Math.sqrt(p * (p -a) * (p - b) * (p - c));
        return area;
    }
 }
