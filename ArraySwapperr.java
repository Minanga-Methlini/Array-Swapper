/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayswapperr;
import java.util.Arrays;
/**
 *
 * @author Minanga Methlini
 */
public class ArraySwapperr {

    static Integer[] array = {76,6,107,92,21,23,5,9,8,8143};
    static int outerIndex;
    
    public static void swap (int i, int j){
        //method
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    } 
    
    public static void insert(int endIndex){
    // method
        int i = endIndex;
        while (i > 0 && array[i] < array[i - 1]){
            swap (i, i - 1);
            
            System.out.println(
                    "i = "
                    +outerIndex
                    + "; j = "
                    + (i - 1) 
                    + "; "
                    + "Array State:" +Arrays.deepToString(array));
            
            i--;
        }
    }
    
    public static void insertionSort(){
    //method
        for (outerIndex = 1; outerIndex < array.length; outerIndex++){
            insert(outerIndex);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Array befpre sorting:" + Arrays.deepToString(array));
        
        insertionSort();
        
        System.out.println("Array after sorting:" + Arrays.deepToString(array));
    }
    
    
}
