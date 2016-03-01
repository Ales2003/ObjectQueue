/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectqueue;

/**
 *
 * @author Алекс1
 */
public class QueueTest
{
    public static void main(String[] arg) {
        ObjectQueue queue = new ObjectQueue();
 
        for(int i=0; i<10; i++) {
            // В данном случае мы складываем в очередь строки
            queue.push("Строка:" + i);
        }
 
        while(queue.size() > 0) {
            // Мы делаем жесткое приведение типа, т.к. знаем, что там лежат строки
            String s = (String)queue.pull();
            System.out.println(s);
            System.out.println("Размер очереди:" + queue.size());
        }
    }
}