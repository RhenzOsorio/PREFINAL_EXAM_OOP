/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fruitpricesorter;

/**
 *
 * @author User
 */
public class InsertionSort {
    public static void insertionSort(Fruit[] fruits) {

        for (int i = 1; i < fruits.length; i++) {
      
            Fruit key = fruits[i];
            int j = i - 1;

            while (j >= 0 && fruits[j].getPrice() > key.getPrice()) {             
                fruits[j + 1] = fruits[j];
                j--;
            }

            fruits[j + 1] = key;
        }
    }
}


