// ### Задания по Java: Введение и Основы

// 1. **Введение в язык программирования Java:**
//    - Каковы основные характеристики языка программирования Java?

//Поддержка независимой платформы, Объектно-ориентированность, Активное сообщество

// 2. **Почему стоит изучать язык программирования Java:**
//    - Какие преимущества предоставляет Java, и почему ее стоит изучать?

// Массовое использование
// Поддержка независимой платформы
// Дополнительные возможности
// Надежность и безопасность

// 3. **История языка программирования Java:**
//    - Какие важные этапы в истории развития Java можно выделить?

// Java была создана Джеймсом Гослингом и его небольшой группой в 1995 году.
// Изначально язык назывался "Oak", но затем был переименован в "Java".

// 4. **Особенности языка программирования Java:**
//    - Что такое "байт-код" в контексте Java, и каково его значение для языка?

//как я поняла благодаря ему java может использоватся на различных платформах

// 5. **Шаги установки необходимых программ для Java:**
//    - Какие шаги нужно предпринять для установки Java Development Kit (JDK) и среды разработки (IDE)?

// Oracle или другие источники предоставляют Java Development Kit.
// а для IDE установите среду разработки Java, такую как Eclipse, IntelliJ IDEA или NetBeans.

// 6. **Шаги написания первой программы на Java:**
//    - Напишите программу "Hello World" на Java и объясните каждый шаг создания этой программы.

public class HelloWorld { //чтобы запустить программу
    public static void main(String[] args){ // передача аргументов командной строки в программу Java через параметр String[] args метода main
        System.out.println("Hello World!"); //вывод информации в консоль и переход на следующую линию
    }
}

// 7. **Шаги компиляции кода на Java:**
//    - Какие этапы нужно пройти для компиляции Java-кода с использованием компилятора `javac`?

// Написать код в файл и в терминале ввести javac HelloWorld.java, чтобы скомпилировать код.


// 8. **Шаги выполнения кода на Java:**
//    - Как можно выполнить скомпилированную Java-программу с использованием команды `java`?

// ввести java HelloWorld в терминале

// 9. **Способы вывода информации в консоль на Java:**
//    - Приведите примеры кода на Java для вывода информации в консоль различными способами.

// System.out.printIn("Это вывод текста а потом переход на слудющую строку")
// System.out.print("Ф это без перехода")

// 10. **Java (Garbage Collection) подробно:**
//     - Как работает сборщик мусора в Java, и почему это важно для управления памятью?

//это делается с помощью коментариев и важно для того чтобы лишние обрывки кода которые могут позже пригодится можно было сохранить но сделать так чтоб в процессе они не мешали и изза них не было ошибок

// 11. **Использование комментариев в Java:**
//     - Приведите примеры однострочных и многострочных комментариев в Java.

// однострочный 
/*
многостройнчый
*/

// 12. **Main метод в Java подробно:**
//     - Почему метод `main` является ключевым для выполнения Java-программы? Как он объявляется?

//Исполнение программы начинается с метода main и вы можете передатьаргументы с помощью него и он объявляется вот так public static void main(String[] args).

// 13. **Java (Command Line Arguments) подробно:**
//     - Как передавать аргументы командной строки в программу Java через метод `main`?

// через параметр String[] args 

// 14. **Java JDK, JRE и JVM подробно:**
//     - Какие функции выполняют JDK, JRE и JVM в Java?

// JDK - написание и компиляцию программ 
// JRE - выполнение программ
// JVM - выполнение скомпилированного кода


// 15. **Платформы Java (Java SE, Java EE, Java ME) подробно:**
//     - В чем различия между Java SE, Java EE и Java ME?

// Java SE - Стандартная платформа Java с основным функционалом
// Java EE - Расширенная платформа для организаций и корпоративных приложений
// Java ME - Платформа для мобильных и других устройств с ограниченными ресурсами


// 16. **Classpath в Java подробно:**
//     - Что представляет собой Classpath в Java и как он используется для поиска классов?

// это система путей для нахождения классов, которые программа требует для выполнения

// 17. **Ввод информации в программу с использованием Scanner в Java:**
//     - Напишите программу на Java, использующую класс Scanner для ввода информации от пользователя.

import java.util.Scanner;
public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите что-то: ");
        String userInput = scanner.nextLine();
        System.out.println("Вы ввели: " + userInput);
        scanner.close();
    }
}


// 18. **Ввод информации в программу с использованием JOptionPane в Java:**
//     - Создайте графический интерфейс с использованием JOptionPane для ввода информации в программу.

import javax.swing.JOptionPane;

public class InputExampleJOptionPane {
    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog("Введите что-то:");
        JOptionPane.showMessageDialog(null, "Вы ввели: " + userInput);
    }
}
