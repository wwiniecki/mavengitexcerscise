package org.winiol.excercises;

import java.util.Scanner;

/**
 * Cwiczenia ze strony www.samouczekprogramisty.pl. Dział "metody w języku java".
 */
public class Methods {
    private Scanner getNumber = new Scanner(System.in);

    // Ćwiczenie 1. Napisz metodę, która zwróci Twoj aktualny wiek.
    public void getAge() {
        System.out.println("Mój wiek to 32 lata.");
    }

    // Ćwiczenie 2. Napisz metodę, która zwróci Twoje imię.
    public void getName() {
        System.out.println("Moje imię to Wojtek");
    }

    // Ćwiczenie 3. Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn,
    public void getPairOfNumbers(int a, int b) {
        System.out.println("Różnica liczb a i b to " + (a - b));
        System.out.println("Suma liczb a i b to " + (a + b));
        System.out.println("Iloczyn liczb a i b to " + (a * b));
    }

    public void getPairOfNumbers() {
        System.out.println("Wprowadź pierwszą liczbę naturalną");
        Integer a = getNumber.nextInt();
        System.out.println("Wprowadź drugą liczbę naturalną");
        Integer b = getNumber.nextInt();
        System.out.println("Różnica liczb a i b to " + (a - b));
        System.out.println("Suma liczb a i b to " + (a + b));
        System.out.println("Iloczyn liczb a i b to " + (a * b));
    }

    // Ćwiczenie 4. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta,
    public boolean ifOdd(int a) {
        if ((a % 2) == 0) return true;
        else return false;
    }

    public boolean ifOdd() {
        int a = getNumber.nextInt();
        if ((a % 2) == 0) return true;
        else return false;
    }

    // Ćwiczenie 5. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5
    public boolean ifDiv(int a) {
        boolean isCorrect = false;
        if ((a % 3) == 0) {
            if ((a % 5) == 0) {
                isCorrect = true;
            }
        }
        return isCorrect;
    }

    public boolean ifDiv() {
        boolean isCorrect = false;
        int a = getNumber.nextInt();
        if ((a % 3) == 0) {
            if ((a % 5) == 0) {
                isCorrect = true;
            }
        }
        return isCorrect;
    }

    //Ćwiczenie 6. Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi,
    public int numberPowerTo3(int a) {
        return a * a * a;
    }

    public int numberPowerTo3() {
        int a = getNumber.nextInt();
        return a * a * a;
    }

    //Ćwiczenie 7. Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy
    //(poczytaj javadoc do klasy Math, znajdziesz tam metodę, która na pewno Ci pomoże)
    public double squareNumber(double a) {
        return Math.sqrt(a);
    }

    public double squareNumber() {
        double a = getNumber.nextDouble();
        return Math.sqrt(a);
    }

    //Ćwiczenie 8. Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true
    //jeśli z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.
    public boolean ifRectangularTriangle(int a, int b, int c) {
        boolean isCorrect = false;
        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;
        if ((a2 + b2) == c2) {
            isCorrect = true;
        } else if ((b2 + c2) == a2) {
            isCorrect = true;
        } else if ((a2 + c2) == b2) {
            isCorrect = true;
        } else isCorrect = false;

        return isCorrect;
    }

    public boolean ifRectangularTriangle() {
        boolean isCorrect = false;
        int a = getNumber.nextInt();
        int b = getNumber.nextInt();
        int c = getNumber.nextInt();
        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;
        if ((a2 + b2) == c2) {
            isCorrect = true;
        } else if ((b2 + c2) == a2) {
            isCorrect = true;
        } else if ((a2 + c2) == b2) {
            isCorrect = true;
        } else isCorrect = false;

        return isCorrect;
    }

}














