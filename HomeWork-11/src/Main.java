import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * 1.	List nədir, necə işləyir?
         * Müəyyən bir ardıcıllığa əsaslanmış elementlərin siahısıdır.
         *
         * 2.	ArrayList və LinkedList in ferqleri nelerdir hansı nə zaman istifadə olunmalıdır ?
         * ArrayList elemetləri bir massiv List ində saxlayır. Elementlərin axtarışı üçün optimal Listdir.
         * LinkedList elemetlərin əlavə edilib çıxırılması üçün optimal Listdir.
         *
         * 3.	ArrayList və LinkedListi custom olaraq yaradın və istifadə edin
         * custom yaradacagınız classlar içərsində add() , size() , get() , remove()  methodları yer almalıdır
         * MyArrayList cə MyLinkedList class larını cusrom olaraq yaratdım.
         *
         * 4.	Listin ArrayListinden  ve Vectordan istifade ederek  hefdenin günlərini listə daxil edin
          */
        List<String> weakDaysList = new ArrayList<>();
        weakDaysList.add("Monday");
        weakDaysList.add("Tuesday");
        weakDaysList.add("Wednesday");
        weakDaysList.add("Thursday");
        weakDaysList.add("Friday");
        weakDaysList.add("Saturday");
        weakDaysList.add("Sunday");

        Vector<String> weakDaysVector = new Vector<>();
        weakDaysVector.add("Monday");
        weakDaysVector.add("Tuesday");
        weakDaysVector.add("Wednesday");
        weakDaysVector.add("Thursday");
        weakDaysVector.add("Friday");
        weakDaysVector.add("Saturday");
        weakDaysVector.add("Sunday");
        /**
         * 4.1- Iterator və İterable den istifadə edərək hefdənin günlərini çap edin
         */

        Iterator<String> weakDaysIterator = weakDaysList.iterator();
        while (weakDaysIterator.hasNext()) {
            System.out.println(weakDaysIterator.next());
        }

        /**
         * 4.2- listdeki elementlerə get() methodu  ile muraciet edib butun elementləri çap edin
         */
        for (int i = 0; i < weakDaysList.size(); i++) {
            System.out.println(weakDaysList.get(i));
        }

        /**
         * 4.3- Friday -  axtarış edərək çap edin
         */
        for (String day : weakDaysList) {
            if (day.equals("Friday")) {
                System.out.println(day);
            }
        }

        /**
         * 4.4 – listen Sunday – ı silin
         */
        weakDaysList.remove("Sunday");

        /**
         * 5.   Stack yaradın və steke elementler daxil edin silin , get() method undan istifade ederek indexe  gore
         * elemenet cap edin , pop()  və və peek()  methodlarından istifadə edin və fərqlərini qeyd edin
         * push(): Stack-ə yeni element əlavə etmək üçün istifadə edilir.
         * pop(): Stack-in ən üstündəki elementi silir və onu qaytarır.
         * peek(): Stack-in ən üstündəki elementi silmədən qaytarır. Bu, elementi silmədən elementi yoxlamaq üçün istifadə edilir.
         */
        Stack<String> myStack = new Stack<>();
        myStack.push("Monday");
        myStack.push("Tuesday");
        myStack.push("Wednesday");
        myStack.push("Thursday");
        myStack.push("Friday");
        myStack.push("Saturday");
        myStack.push("Sunday");

        System.out.println(myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());


    }
}