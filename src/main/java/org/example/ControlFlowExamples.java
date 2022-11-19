package org.example;

public class ControlFlowExamples {
    public static void main(String args[]) {
        int n = 5, a = 3, b = 8, i = 30;
        int h=0;
        int j=0;
        ifElse(n);
        nestedifelse(n, a, b);
        forexp(i);
        whileexp(i);
        dowhile(i);
        breakexp(n);
        continuexp(n);
        nestedfor(h,j);
        char f='a';
        switchexp(f);

    }

    public static void ifElse(int n) {
        if (n >= 10) {
            System.out.println("he is a kid");
        } else {
            System.out.println("he is not a kid");
        }
    }

    public static void nestedifelse(int n, int a, int b) {
        if ((n > a) && (n > b)) {
            System.out.println(n + "is larger");
        } else if ((a > b) && (a > n)) {
            System.out.println(a + "is larger");
        } else {
            System.out.println(b + "is larger");
        }
    }

    public static void switchexp(char f) {
        switch (f) {
            case 'a':
                System.out.println("vowel");
            case 'e':
                System.out.println(" is vowel");
            case 'b':
                System.out.println("was vowel");
                break;
            default:
                System.out.println(" not vowel");
        }

    }

    public static void forexp(int i) {
        for (i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void nestedfor(int h,int j) {
        for (h = 0; h < 5; h++) {
            for (j = 0; j <= h; j++) {
                System.out.println(h);
            }
        }
    }

    public static void whileexp(int i) {
        while (i <= 20) {
            System.out.println(i);
            i++;
        }
    }

    public static void dowhile(int i) {
        do {
            System.out.println(i);
            i++;
        }
        while (i <= 20);
    }

    public static void breakexp(int n) {
        for (n = 0; n <= 6; n++) {
            if (n == 5) {
                break;

            }
            System.out.println(n);
        }
    }
    public static void continuexp(int n) {
        for (n = 0; n <= 6; n++) {
            if (n == 5) {
                continue;

            }
            System.out.println(n);
        }
    }
}