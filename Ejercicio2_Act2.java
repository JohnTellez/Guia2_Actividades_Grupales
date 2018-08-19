import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class Ejercicio2_Act3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio2_Act2
{
    public static void main(String[] args) {
    
    Scanner scaner = new Scanner(System.in);  
          
          System.out.print("Vector A  \n\n");
          ArrayList <String> A = new ArrayList<>();
          ArrayList <String> B = new ArrayList<>();
          ArrayList <String> C = new ArrayList<>();
          char resp; 
          int tamA=0;
          int tamB=0;
          int d = 0;
          do{
              System.out.print("Ingrese numero: ");
              A.add((int)scaner.nextDouble()+"");
              System.out.print("Desea ingresar otro dato (s/n):");
              resp = scaner.next().charAt(0);
              tamA++;
            }
            while(resp == 's');
       
          System.out.print("\nNumeros de vector A: {");
          for(int i = 0; i < tamA; i++){
              System.out.print(A.get(i)+",");
          }
          System.out.print("}\n\n");
          
          System.out.print("\n\nVector B  \n\n");
          do{
              System.out.print("Ingrese numero: ");
              B.add((int)scaner.nextDouble()+"");
              System.out.print("Desea ingresar otro dato (s/n):");
              resp = scaner.next().charAt(0);
              tamB++;
            }
            while(resp == 's');
    
          System.out.print("\nNumeros de vector B: {");
          for(int i = 0; i < tamB; i++){
              System.out.print(B.get(i)+",");
          }
          System.out.print("}\n\n");
          
          for(int i = 0; i < A.size(); i++){
              d = 0;
              for(int j = 0; j< B.size(); j++){
                  if(A.get(i) == null ? B.get(j) == null : A.get(i).equals(B.get(j))){
                      d = 1;
                      break;
                  }
              }
              if(d == 0){
                  boolean add;
                  add = C.add(A.get(i));
              }
          }
          for(int i = 0; i < B.size(); i++){
              d = 0;
              for(int j = 0; j< A.size(); j++){
                  if(B.get(i).equals(A.get(j))){
                      d = 1;
                  }
              }
              if(d == 0){
                  C.add(B.get(i));
              }
          }
       
          System.out.print("\n\nNumeros del vector C no comunes entre A y B: {");
          for(int i = 0; i < C.size(); i++){
              System.out.print(C.get(i)+",");
          }
          System.out.print("}");
    
}
}

