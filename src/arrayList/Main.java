package arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


//        Java 8 үчүн практикалык тапшырма

//        1. Жаңы массив тизмесин түзүү үчүн Java программасын жазыңыз,
//        бир нече шаарларды  кошуп, аларды консольго чыгарыныз.
        ArrayList<String >strings=new ArrayList<>();
        strings.add("Karakol");
        strings.add("Bishkek");
        strings.add("Balykchy");
        strings.add("Taraz");
        strings.add("Batken");
        strings.add("Tokmok");
        strings.add("Chui");
        System.out.println("strings = " + strings);
//        2. Массив тизмесине элементти биринчи орунга киргизүү үчүн Java программасын жаз.
        strings.add(0,"ALma-Ata");
        System.out.println(strings);


//        3. Берилген массивдердин тизмесинен элементти (белгиленген индексте) алуу үчүн Java программасын жазыңыз.
        System.out.println("strings1.get(3) = " + strings.get(2));
//        4. Берилген элемент боюнча белгилүү бир массив элементин озгортуу үчүн Java программасын жазыңыз.
        strings.set(0,"Osh");
        System.out.println(strings);
//        5. Массив тизмесинен үчүнчү элементти очуруп салуу үчүн Java программасын жазыңыз.
        strings.remove(2);
        System.out.println(strings);
//        6. Массив тизмесиндеги элементти издөө үчүн Java программасын жазыңыз.
        System.out.println("strings.indexOf(\"Taraz\") = " + strings.indexOf("Taraz"));
        System.out.println("strings.get(2) = " + strings.get(2));
//        7. Берилген массивдердин тизмесин сорттоо үчүн Java программасын жазыңыз.
        Collections.sort(strings);
        System.out.println(strings);
//        8. Бир массив тизмесин экинчи масивге көчүрүү үчүн Java программасын жазыңыз.
        System.out.println("strings.addAll(strings1) = " + strings.addAll(strings));
//        9. Массив тизмесиндеги элементтерди аралаштыруу үчүн Java программасын жазып.
//        Маанилерин консольго чыгарыныз.
        Collections.shuffle(strings,new Random());
        System.out.println(strings);
//        10. Массив тизмесиндеги элементтерди тескери өзгөртүү үчүн Java программасын жазыңыз.
        Collections.reverse(strings);
        System.out.println(strings);
//        11. Аррейлисттин бир бөлүгүн алуу үчүн Java программасын жазыңыз
        System.out.println("strings.subList(2,4) = " + strings.subList(2, 4));
    }
}
