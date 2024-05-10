import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExtendedFunctionalityTest {

    @Test
    public void testRandomArrayOperations() {
        // Генерация массива из 15 случайных чисел от 1 до 10
        List<Integer> numbers = generateRandomNumbers(15, 1, 10);
        
        // Вывод сгенерированного массива
        System.out.println("Сгенерированный массив: " + numbers);

        // Выполнение функций и вывод результатов
        System.out.println("Минимальное значение: " + StatisticsCalculator._min(numbers));
        System.out.println("Максимальное значение: " + StatisticsCalculator._max(numbers));
        System.out.println("Сумма всех чисел: " + StatisticsCalculator._sum(numbers));
        System.out.println("Произведение всех чисел: " + StatisticsCalculator._mult(numbers));
    }

    // Метод для генерации списка случайных чисел
    private List<Integer> generateRandomNumbers(int count, int min, int max) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(max - min + 1) + min);
        }
        return numbers;
    }
}
