//Pyramid Command Line Art
//Jan 2023

public class Pyramid{
public static void main(String[] args){  //Main method
    int n = 8; //Initialize n to 8
    for (int i = n-1; i >= 1; i--){ //Outer loop
        for (int j = 1; j < i; j++){ //Inner loop
            System.out.print(" | "); //Create lined background
        }
        for (int k = i; k <= n; k++){ //Inner loop
            System.out.print(k+" * "); //Places "*" symbol between nums
        }  
        System.out.println(); //Output
    }
    for (int i = 1; i <= n; i++){  
        for (int j = 1; j < i; j++){
            System.out.print(" | ");  
        }  
        for (int k = i; k <= n; k++){
            System.out.print(k+" * ");
        }
        System.out.println();  
    }
    for (int i = n-1; i >= 1; i--){
        for (int j = 1; j < i; j++){
            
            System.out.print(" | ");
        }
        for (int k = i; k <= n; k++){
            System.out.print(k+" * ");
        }  
        System.out.println();
    } 
    for (int i = 1; i <= n; i++){  
        for (int j = 1; j < i; j++){
            System.out.print(" | ");  
        }  
        for (int k = i; k <= n; k++){
            System.out.print(k+" * ");
        }
        System.out.println();  
    }
    for (int i = n-1; i >= 1; i--){
        for (int j = 1; j < i; j++){
            System.out.print(" | ");
        }
        for (int k = i; k <= n; k++){
            System.out.print(k+" * ");
        }  
        System.out.println();
    }
    for (int i = 1; i <= n; i++){  
        for (int j = 1; j < i; j++){
            System.out.print(" | ");  
        }  
        for (int k = i; k <= n; k++){
            System.out.print(k+" * ");
        }
        System.out.println();  
    }

}
}