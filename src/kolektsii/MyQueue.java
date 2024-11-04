
package kolektsii;

/**
 *
 * @author ktyui
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Iterator;

public class MyQueue{
    /**
     * ������� ������������ �����
     */
    private Queue<Double> queue = new LinkedList<>();

    /**
     * ���������� �������� � ����� �������
     * @param value ������������ �����
     */
    public void addValue(Double value){
        queue.offer(value);
    }
    
    /**
     * ��������� �������� � ������� � �������
     * @param scan 
     */
    public void addValueConsole(Scanner scan) {
        while (true) {
            if (scan.hasNextDouble()) {
                queue.offer(scan.nextDouble());
                break;
            } else {
                System.out.println("������: ������� ������������ �����");
                scan.next(); 
            }
        }
    }

    /**
     * ����������� ����� �������, ����� ���� �������� ���� � ������
     */
    public void cyclicShift(){
       double max = queue.peek();
       int index = 0;

       int i = 1;
       for (double num:queue){
           if (num > max){
               max = num;
               index = i;
           }
           i++;    
       }

       for (int j = 0; j < index; j++){
           queue.offer(queue.remove());
       }
    }

    /**
     * ������� ������� �� �������
     */
    public void printQueue(){
        Iterator<Double> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    /**
     * ���������� ������� � ����
     * @param filename ��� ����� 
     */
    public void saveQueueToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            if (!queue.isEmpty()) {
                Iterator<Double> iterator = queue.iterator();
                while (iterator.hasNext()) {
                    writer.write(iterator.next() + " ");
                }
            }
        } catch (IOException e) {
            System.out.println("������ ��� ������ � ����: " + e.getMessage());
        }
    }
}
