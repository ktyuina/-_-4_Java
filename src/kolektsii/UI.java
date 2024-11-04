package kolektsii;

import java.util.Scanner;

/**
 * Класс взаимодействия с пользователем.
 * В нем осуществяется ввод и вывод
 * @author ktyui
 */
public class UI {
    public void run() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выполнили: Кутасина А. Тюина Е.");
        System.out.println("Вариант 9");
        System.out.println("Задание:");
        System.out.println("Опишите очередь и заполните ее вещественными числами. Выполните \n" +
                            "циклический сдвиг элементов в очереди так, чтобы в ее начале был \n" +
                            "расположен наибольший элемент. Результат сохранить в файл. Создать \n" +
                            "итератор для коллекции.");
        MyQueue queue = new MyQueue();
        
        queue.addValueConsole(scan);
        queue.addValueConsole(scan);
        queue.addValueConsole(scan);
        queue.addValueConsole(scan);
        
        System.out.println("Очередь:");
        queue.printQueue();
        
        queue.cyclicShift();
        System.out.println("После сдвига:");
        queue.printQueue();
        
        queue.saveQueueToFile("Test1.txt");
    }
}
