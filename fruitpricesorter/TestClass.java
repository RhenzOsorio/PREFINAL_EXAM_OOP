/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fruitpricesorter;

/**
 *
 * @author User
 */
public class TestClass {

    public static void main(String[] args) {

        
        Fruit[] fruits = {new Fruit("f1", "Apple", 25.50),new Fruit("f2", "Mango", 120.00), new Fruit("f3", "Orange", 20.00), new Fruit("f4", "Grapes", 250.00),new Fruit("f5", "Lanzones", 75.00),new Fruit("f6", "Banana", 60.00),new Fruit("f7", "Strawberry",312.00)};

        System.out.println(" ========LIST OF FRUITS========");
        

        displayFruits(fruits);

       
        InsertionSort.insertionSort(fruits);

        System.out.println("========FRUITS AFTER SORTING========");


        displayFruits(fruits);

       
       
        System.out.println("========TOP 3 CHEAPEST FRUITS========");
        

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + fruits[i]);
        }
    }

    
    public static void displayFruits(Fruit[] fruits) {

        System.out.printf("%-10s %-15s %s%n","Fruit ID", "Name", "Price");
                

        System.out.println("----------------------------------------------");

        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
