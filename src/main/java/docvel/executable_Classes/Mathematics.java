package docvel.executable_Classes;

public class Mathematics {

    /**
     * Сложение целых чисел
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма
     */
    public static int addition(int a, int b){
        return a + b;
    }

    /**
     * Вычитание целых чисел
     * @param a уменьшаемое число
     * @param b вычитаемое число
     * @return разность
     */
    public static int subtraction(int a, int b){
        return a - b;
    }

    /**
     * Произведение целых чисел
     * @param a множимое
     * @param b множитель
     * @return произведение
     */
    public static int multiplication(int a, int b){
        return a * b;
    }

    /**
     * Деление целых чисел. Если делитель равен 0, то как результат выводится делимое
     * @param a делимое
     * @param b делитель
     * @return частное
     */
    public static int division(int a, int b){
        if ( b != 0 ){
            return a / b;
        }
        else return a;
    }
}