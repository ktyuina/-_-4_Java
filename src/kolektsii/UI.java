package kolektsii;

import java.util.Scanner;

/**
 * ����� �������������� � �������������.
 * � ��� ������������� ���� � �����
 * @author ktyui
 */
public class UI {
    public void run() {
        Scanner scan = new Scanner(System.in);
        System.out.println("���������: �������� �. ����� �.");
        System.out.println("������� 9");
        System.out.println("�������:");
        System.out.println("������� ������� � ��������� �� ������������� �������. ��������� \n" +
                            "����������� ����� ��������� � ������� ���, ����� � �� ������ ��� \n" +
                            "���������� ���������� �������. ��������� ��������� � ����. ������� \n" +
                            "�������� ��� ���������.");
        MyQueue queue = new MyQueue();
        
        queue.addValueConsole(scan);
        queue.addValueConsole(scan);
        queue.addValueConsole(scan);
        queue.addValueConsole(scan);
        
        System.out.println("�������:");
        queue.printQueue();
        
        queue.cyclicShift();
        System.out.println("����� ������:");
        queue.printQueue();
        
        queue.saveQueueToFile("Test1.txt");
    }
}
