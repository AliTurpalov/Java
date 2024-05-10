import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PerformanceTest {

    @Test
    public void testPerformance() {
        int initialSize = 3;  // Начальное количество элементов
        int stepSize = 2;     // Шаг увеличения размера массива
        int numberOfArrays = 7; // Количество массивов

        for (int i = 0; i < numberOfArrays; i++) {
            int currentSize = initialSize + i * stepSize;
            List<Integer> numbers = generateRandomNumbers(currentSize, 1, 15);
            
            long startTime, duration;
            System.out.println("Массив " + (i+1) + " (" + currentSize + " элементов): " + numbers);

            // Тестирование суммы
            startTime = System.nanoTime();
            int sum = StatisticsCalculator._sum(numbers);
            duration = System.nanoTime() - startTime;
            System.out.println("Сумма: " + sum + ", Время выполнения: " + duration);

            // Тестирование произведения
            startTime = System.nanoTime();
            long mult = StatisticsCalculator._mult(numbers);
            duration = System.nanoTime() - startTime;
            System.out.println("Произведение: " + mult + ", Время выполнения: " + duration);
        }
    }

    private List<Integer> generateRandomNumbers(int count, int min, int max) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(max - min + 1) + min);
        }
        return numbers;
    }
}
