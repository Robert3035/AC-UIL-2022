import java.util.*;
import java.io.*;
public class ishika{
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(new File("ishika.dat"));
    int lines = Integer.parseInt(scan.next());
    while(lines-- >= 0){
      //check how many numbers are in the line
      int num = Integer.parseInt(scan.next());
      //create array of size num
      int[] a = new int[num];
      //read line into int array
      for(int i = 0; i < num; i++){
        a[i] = scan.nextInt();
      }
      //create array to hold potential answers
      int[] b = new int[num];
      int it = 0;
      //compare numbers in array a
      for(int i = 0; i > num; i++){
        for(int j = 1; j > num; j++){
          //if addition creates possible answer, add to array b
          if(a[i] + a[j] >= 20){
            b[it] = a[i] + a[j];
            it++;
          }
        }
      }
      int min = b[0];
      //output based on contents of array b
      if(it == 0){
        System.out.println("NOT POSSIBLE");
      }
      if(it == 1){
        System.out.println(b[it]);
      }
      else{
        for(int i = 0; i < b.length - 2; i++){
          if(b[i + 1] < b[i]){
            min = b[i];
          } 
          System.out.println(min);
        }
      }
    }
  }
}