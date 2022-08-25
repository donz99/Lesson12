package Lesson12;

import java.sql.Array;
import java.sql.SQLType;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    static void fillRandom(ArrayList<Integer> mas, int left, int right, int qty) {     //arraylist имя класса, integer - какой в этом классе тип элементов
        Random gen = new Random();
        for (int i = 0; i < qty; i++) {
            mas.add(gen.nextInt(right - left + 1) + left);       //метод add всегда записывает элементы в конец
        }
    }

    static void print(ArrayList<Integer> mas) {
        for (int i = 0; i < mas.size(); i++) {   // size функция которая возвращает текущий размер
            System.out.print(mas.get(i) + " ");   // метод get
        }
        System.out.println();
    }

    static int findPosMin(ArrayList<Integer> mas) {
        int posMin = -1;
        if (mas.size() == 0) return posMin;
        int min = mas.get(0);
        for (int i = 0; i < mas.size(); i++) {
            if (mas.get(i) < min) {
                min = mas.get(i); //аналогия для массива mas[i]
                posMin = i;
            }
        }
        return posMin;
    }

    static int findPosMax(ArrayList<Integer> mas) {
        int posMax = -1;
        if (mas.size() == 0) return posMax;
        int max = mas.get(0);
        for (int i = 0; i < mas.size(); i++) {
            if (mas.get(i) > max) {
                max = mas.get(i); //аналогия для массива mas[i]
                posMax = i;
            }
        }
        return posMax;
    }

    static void swap(ArrayList<Integer> mas, int index1, int index2) {
        int temp = mas.get(index1); //tenp=mas[index1]
        mas.set(index1, mas.get(index2));   //mas[index1] = mas[index2]     //метод set куда а потом что
        mas.set(index2, temp);  //mas[index2]
    }


    //52 элемента туз = 1 очко
    static void initDeck(ArrayList<Integer> deck) {     //arraylist имя класса, integer - какой в этом классе тип элементов
        for (int k = 0; k < 4; k++) {
            for (int i = 1; i < 10; i++) {
                deck.add(i);
            }
            for (int i = 0; i < 4; i++) {
                deck.add(10);
            }
        }
    }

    static void shuffleDeck(ArrayList<Integer> deck) {    //
        Random gen = new Random();
        for (int k = 0; k < 3; k++) {
            for (int i = 0; i < deck.size(); i++) {
                int randomIndex = gen.nextInt(deck.size());    //или gen.nextInt(52);
                swap(deck, i, randomIndex);
            }
        }
    }

    ArrayList<Integer> deck = new ArrayList<>();
    /*initDeck(deck);
    print(deck);
    shuffleDeck(deck);
    print(deck);*/
    //Функции, в эти функции передаём эрей листы

    //Series1. Даны десять вещественных чисел. Найти их сумму.
    static void ser1(ArrayList<Integer> chisla) {
        fillRandom(chisla, 0, 35, 4);
        print(chisla);
    }

    public static void main(String[] args) {
        //ArrayList<Integer> arr = new ArrayList<>();   //Класс Integer, коллекция ArrayList, new выделение памяти (arr хранится в stack (ссылочная переменная), далее по ссылке выделяется память в Heap. MetaSpace описание класса, класс и т.д.)
        //fillRandom(arr, -10, 10, 15);   // от -10 до 10 и 15 штук
        //print(arr);
        //Найти позицию минимального элемента
        //System.out.println(findPosMin(arr));
        //максимального
        //System.out.println(findPosMax(arr));
        //Поменять элементы min max местами
        //swap(arr, findPosMin(arr), findPosMax(arr)); //внутри метода swap
        //print(arr);
        System.out.println();

    }
}













    

