package com.example.Quiz2020.config;

import java.util.ArrayList;
import java.util.List;

public  class r {


//        public String checkIt(String s) {
//            if (s.length() == 0 || s == null) {
//                return "EMPTY";
//            } else
//                return "NOT EMPTY";
//        }
//
//        public static void main(String[] args) {
//            r a = new r();
//            System.out.println(a.checkIt(null));
//        }
//
//
//        public static void main(String[] args) {
//            someMethod();
//        }
//
//        static void someMethod(Object parameter) {
//            System.out.println("Value is " + parameter);
//
//            int tab[] = int[];
//            tab.length
//        }


//        private static String str;
//
//        public static void main(String[] args) {
//            System.out.println(str);
//        }

//    class Base {
//        public short getValue() { //1
//            return 1;
//        }
//    }
//
//    class Base2 extends Base {
//        public byte getValue() { //2
//            return 2;
//        }
//    }
//
//
//        public static void main(String[] args) {
//            Base b = new Base2(); //3
//            System.out.println(b.getValue());
//
//    }

//    public static void main(String[] args) {
//        String str1 = "one";
//        String str2 = "two";
//        System.out.println(str1.equals(str1=str2));
//    }

//    public static void main(String[] args) {
//        String myStr = "good";
//        char[] myCharArr = { 'g', 'o', 'o', 'd' };
//        String newStr = null;
//        for (char ch : myCharArr) {
//            newStr = newStr + ch;
//        }
//        System.out.println((newStr == myStr) + " " + (newStr.equals(myStr)));
//        System.out.println(newStr);
//    }

    // public static void main( String[] args){
//        try{
//            int i = 0;
//            i =  Integer.parseInt( args[0] );
//        }
//        catch(NumberFormatException e){
//            System.out.println("Problem in " + i );
//        }
//        List<Integer> ss = new ArrayList<>();
//
//    }

//
//    public static void main(String[] args) {
//        java.time.LocalDateTime.of(2019, 1, 2, 10, 10);
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(1 + 5 < 3 + 7);
//        System.out.println((2 + 2) >= 2 + 3);
//    }
//
//}


//    interface House {
//        default String getAddress() {
//            return "101 Main Str";
//        }
//    }
//
//    interface Bungalow extends House {
//        default String getAddress() {
//            return "101 Smart Str";
//        }
//    }
//
//    class MyHouse implements Bungalow, House {
//    }
//
//
//        public static void main(String[] args) {
//            House ci = new MyHouse();  //1
//            System.out.println(ci.getAddress()); //2
//        }

//    public static void main(String[] args) {
//        System.out.println("" + 5 + 6);
//        System.out.println(5 + "" + 6);
//        System.out.println(5 + 6 + "");
//        System.out.println(5 + 6);
//    }


//    public static void main(String[] args) {
//        boolean b1 = false;
//        boolean b2 = false;
//        if (b2 != b1 = !b2) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//    }

//    public static void main(String args[]) {
//        String str1 = "str1";
//        String str2 = "str2";
//        System.out.println(str1.concat(str2));
//        System.out.println(str1);
//    }

//    public int getNumber(int a) {
//        return 2;
//    }
//
//
//    public class SubClass extends r {
//        public int getNumber(int a, char ch) {
//            return 4;
//        }
//
//        public static void main(String[] args) {
//            System.out.println(new SubClass().getNumber(4));
//        }
//    }

//    public static void testInts(Integer object, int value) {
//        object = value++;
//        object++;
//    }
//
//    public static void main(String[] args) {
//        Integer five = new Integer(5);
//        int nine = 9;
//        testInts(five++, ++nine);
//        System.out.println(five + " " + nine);
//    }


//    public static void main(String args[]) {
//        A o1 = new C();
//        B o2 = (B) o1;
//        System.out.println(o1.m1());
//        System.out.println(o2.i);
//    }
//
//}
//class A {
//    int i = 10;
//
//    int m1() {
//        return i;
//    }
//}
//
//class B extends A {
//    int i = 20;
//
//    int m1() {
//        return i;
//    }
//}
//
//class C extends B {
//    int i = 30;
//
//    int m1() {
//        return i;
//    }
//}


//    abstract void calculate();
//
//    public static void main(String[] args) {
//        System.out.println("calculating");
//        r x = null;
//        x.calculate();
//    }
}