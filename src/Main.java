import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Пусть дан LinkedList с несколькими элементами. Реализуйте метод, " +
                "который вернет “перевернутый” список.\nИсходный список: ");
// Вариант 1: через итератор
        LinkedList<Integer> anotherList = getReverseListV1(5,11);
        System.out.println("Перевернутый список: ");
        System.out.println(anotherList);

// Вариант 2: через for
//        LinkedList<Integer> anotherList = getReverseListV2(5,11);
//        System.out.println("Перевернутый список: ");
//        System.out.println(anotherList);

// Вариант 3: через for без нового ЛинкедЛиста
//        getReverseListV3(5,11);

        System.out.println();
        System.out.println();

        System.out.println("Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. " +
                "Используйте итератор.\nИсходный список: ");
        int sum = getSum(5,11);
        System.out.println("Сумма элементов в исходном списке: " + sum);

        System.out.println();
        System.out.println();

        System.out.println("Работа с новым классом: ");
        newClass();
    }

    static LinkedList<Integer> getLinkedList(int countOfNumbers, int maxRandom) {
        LinkedList<Integer> ls = new LinkedList<>();
        Random random = new Random();

        for (int i = 1; i <= countOfNumbers; i++) {
            ls.add(random.nextInt(maxRandom));
        }
        return ls;
    }
    static LinkedList<Integer> getReverseListV1(int countOfNumbers, int maxRandom) {
        LinkedList<Integer> newList = getLinkedList(countOfNumbers, maxRandom);
        ListIterator<Integer> iter = newList.listIterator(newList.size());
        System.out.println(newList);

        LinkedList<Integer> reverseLs = new LinkedList<>();

        while (iter.hasPrevious()) {
            int num = iter.previous();
            reverseLs.add(num);
        }
        return reverseLs;
    } // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

    static LinkedList<Integer> getReverseListV2(int countOfNumbers, int maxRandom) {
        LinkedList<Integer> newList = getLinkedList(countOfNumbers, maxRandom);
        System.out.println(newList);

        LinkedList<Integer> reverseLs = new LinkedList<>();

        for (int i = newList.size() - 1; i >=0 ; i--) {
            reverseLs.add(newList.get(i));
        }
        return reverseLs;
    } // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

    static void getReverseListV3(int countOfNumbers, int maxRandom) {
        LinkedList<Integer> newList = getLinkedList(countOfNumbers, maxRandom);

        System.out.println(newList);

        for (int i = newList.size() - 1; i >=0 ; i--) {
            System.out.print(newList.get(i) + " ");
        }
    } // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

    static int getSum(int countOfNumbers, int maxRandom) {
        LinkedList<Integer> list = getLinkedList(countOfNumbers, maxRandom);
        System.out.println(list);

        Iterator<Integer> col = list.iterator();
        int sum = 0;

        while (col.hasNext()) {
            int element = col.next();
            sum += element;
        }
        return sum;
    } //Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

    static void newClass(){
        NewClass firstClass = new NewClass();

        firstClass.enqueue(4);
        firstClass.enqueue(5);
        firstClass.enqueue(6);
        System.out.println(firstClass);
        System.out.println(firstClass.first());
        System.out.println(firstClass);
        System.out.println(firstClass.dequeue());
        System.out.println(firstClass);
    }

}