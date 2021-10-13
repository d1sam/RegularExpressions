package ua.od.atomspace;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*
        * \\d - одна цифра
        * \\w - одна буква
        * + - один или более
        * * - ноль или более
        * ? - ноль или один (может быть, а может и не быть)
        * (x|y|z) - одна строка из множества строк
        * [A-Za-z] - все англ буквы
        * [0-9] = \\d
        * [A-Za-z] = \\w
        * [abc] = (a|b|c)
        * [^xyz] - отрицание (мы хотим все символы, кроме xyz)
        * [^a-z] - вс символы, кроме маленьких англ букв
        * . - любой символ
        * {} - задает точное количество символов
        * {2} - два символа
        * {2,} - от двух до бесконечности символов
        * {2,5} - от двух до пяти символов
        * */

        String a = "123";
        System.out.println(a.matches("123"));// true
        System.out.println(a.matches("1234"));// false
        a="1";
        System.out.println(a.matches("\\d"));// true
        a="12";
        System.out.println(a.matches("\\d"));// false
        System.out.println(a.matches("\\d+"));// true
        System.out.println(a.matches("\\d*"));// true
        a="-124";
        System.out.println(a.matches("-?\\d*"));// true
        a="124";
        System.out.println(a.matches("-?\\d*"));// true
        a="+124";
        System.out.println(a.matches("-?\\d*"));// false
        System.out.println(a.matches("(\\+|-)?\\d*"));// true
        a="b113";
        System.out.println(a.matches("[A-Za-z]\\d*"));// true
        a="113";
        System.out.println(a.matches("[A-Za-z]\\d*"));// false
        a="gfhfhghfh67";
        System.out.println(a.matches("[A-Za-z]\\d*"));// false
        System.out.println(a.matches("[A-Za-z]*\\d*"));// true
        a="gf232hfhgs232332hfh67";
        System.out.println(a.matches("[A-Za-z]*\\d*"));// false
        System.out.println(a.matches("[A-Za-z23]+\\d*"));// true
        a="e23323";
        System.out.println(a.matches("[^a-z]\\d*"));// false
        a="*23323";
        System.out.println(a.matches("[^a-z]\\d*"));// true
        a="hello";
        System.out.println(a.matches("[^xyz]*"));// true
        a="hellox";
        System.out.println(a.matches("[^xyz]*"));// false
        String url = "https://www.google.com";
        System.out.println(url.matches("https://www\\..+\\.(com|ru)"));// true
        url = "https://www.yandex.ru";
        System.out.println(url.matches("https://www\\..+\\.(com|ru)"));// true
        url = "hello there";
        System.out.println(url.matches("https://www\\..+\\.(com|ru)"));// false
        a="23";
        System.out.println(a.matches("\\d{2}"));// true
        System.out.println(a.matches("\\d{3}"));// false
        a="sasgadgsfa";
        System.out.println(a.matches("\\w+"));// true
        String string = "Hello ma dear guys";
        String[] array = string.split(" ");// делит строку на массив по словам с помощью разделителя " "
        System.out.println(Arrays.toString(array));// [Hello, ma, dear, guys]
        string = "Hello231ma3423dear3242guys";
        array = string.split("\\d+");// делит строку на массив по словам с помощью разделителя "\\d+"
        System.out.println(Arrays.toString(array));// [Hello, ma, dear, guys]
        string = "Hello.ma.dear.guys";
        System.out.println(string.replace("."," "));// replace для замены символов в строке другой строкой : Hello ma dear guys
        System.out.println(string.replaceAll("\\w+","wo"));// replaceAll для замены символов в строке другой строкой с помозью рег. выражений
        // : wo.wo.wo.wo
        System.out.println(string.replaceFirst("\\w+","-"));// replaceFirst для замены символов в строке другой строкой
        // с помозью первого вхождения рег. выражений
        // -.ma.dear.guys
    }
}
