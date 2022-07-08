package mycode;


public class apple {
    public static void main (String[] args){
  
 int num [][]= {{1,3,4,5},{3,5,3,2},{8,4,5,3}};
 
  
 int shali [][]= {{1,3,2,4},{2},{2,3,4,5}};
 System.out.println("first array");
 display(num);
 
 System.out.println("second array");
 display(shali);
 
  }
    
    public static void display(int x[][]){
    
    for (int row=0 ; row <x.length; row++){
        
       for (int col =0 ; col <x[row].length; col++){
           
           System.out.print(x[row][col] + "\t");
       }
       System.out.println("");
       }
    }
        
    }
