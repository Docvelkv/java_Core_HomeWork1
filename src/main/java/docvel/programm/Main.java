package docvel.programm;

import docvel.executable_Classes.Mathematics;
import docvel.executable_Classes.Print;

/**
 * Точка входа
 */
public class Main {

    public static void main(String[] args) {
        Print.print(Mathematics.addition(10, 2));
        Print.print(Mathematics.division(12, 0));
        Print.print(Mathematics.division(12, 2));
        Print.print(Mathematics.multiplication(6, 6));
        Print.print(Mathematics.subtraction(3, 17));
    }
}