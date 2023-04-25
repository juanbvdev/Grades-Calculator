/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grades.calculator;

import java.util.Scanner;

/**
 *
 * @author éojuas
 */
public class GradesCalculator {

    public static void bimestre(float n1, float n2, float n3, float n4){
        
        float med, medschool, max, bi = 0;
        int op = 0;
        System.out.print("Insira a nota máxima da escola: ");
        max = f.nextFloat();
        System.out.print("Insira a média da escola: ");
        medschool = f.nextFloat();
        bi = max / 4;
        
        System.out.println("1 - Calcular quanto falta\n2 - ");
        System.out.print("Escolha");
        op = i.nextInt();
        
        switch(op){
            case 1 -> {
                med = n1 + n2 + n3 + n4;
                
                System.out.println("Nota: " + med);
                
                if(med > medschool){
                    System.out.println("Aprovado!");
                }else{
                    if(medschool - med <= bi){
                        System.out.println("Faltam " + (medschool - med) + " pontos!");
                    }else{
                        System.out.print("Reprovado! faltou " + (medschool - med) + " pontos");
                        System.out.println(" para atingir a média.");
                        System.out.println("Só é possível tirar " + bi + " pontos por bimestre...");
                    }
                    
                }
            }
        }
        
    }
    
    public static void trimestre(float n1, float n2, float n3){
        
        float med, medschool, max, tri = 0;
        int op = 0;
        System.out.print("Insira a nota máxima da escola: ");
        max = f.nextFloat();
        System.out.print("Insira a média da escola: ");
        medschool = f.nextFloat();
        tri = max / 3;
        
        System.out.println("1 - Calcular quanto falta\n2 - ");
        System.out.print("Escolha");
        op = i.nextInt();
        
        switch(op){
            case 1 -> {
                med = n1 + n2 + n3;
                
                System.out.println("Nota: " + med);
                
                if(med > medschool){
                    System.out.println("Aprovado!");
                }else{
                    if(medschool - med <= tri){
                        System.out.println("Faltam " + (medschool - med) + " pontos!");
                    }else{
                        System.out.print("Reprovado! faltou " + (medschool - med) + " pontos");
                        System.out.println(" para atingir a média.");
                        System.out.println("Só é possível tirar " + tri + " pontos por trimestre...");
                    }
                    
                }
            }
        }
        
    }
    
    public static void semestre(float n1, float n2){
        
        float med, medschool, max, sem = 0;
        int op = 0;
        System.out.print("Insira a nota máxima da escola: ");
        max = f.nextFloat();
        System.out.print("Insira a média da escola: ");
        medschool = f.nextFloat();
        sem = max / 2;
        
        System.out.println("1 - Calcular quanto falta\n2 - ");
        System.out.print("Escolha");
        op = i.nextInt();
        
        switch(op){
            case 1 -> {
                med = n1 + n2;
                
                System.out.println("Nota: " + med);
                
                if(med > medschool){
                    System.out.println("Aprovado!");
                }else{
                    if(medschool - med <= sem){
                        System.out.println("Faltam " + (medschool - med) + " pontos!");
                    }else{
                        System.out.print("Reprovado! faltou " + (medschool - med) + " pontos");
                        System.out.println(" para atingir a média.");
                        System.out.println("Só é possível tirar " + sem + " pontos por trimestre...");
                    }
                    
                }
            }
        }
        
    }
    
    static Scanner i = new Scanner(System.in);
    static Scanner s = new Scanner(System.in);
    static Scanner f = new Scanner(System.in);
    
//------------------------------------------------------------------------------
    
    public static void main(String[] args) {
        
        float notas[] = new float[4];
        
        int op, c = 0;
        
//------------------------------------------------------------------------------
        
        System.out.println("Grades Calculator\n\n");
        
        System.out.print("1 - bimestre\n2 - trimestre\n3 - semestre\nEscolha: ");
        op = i.nextInt();
        
        switch(op){
            
            case 1 -> {
                
                for(c = 0; c <= 3; c++){
                    
                    System.out.print("Nota " + (c+1) + ": ");
                    notas[c] = f.nextFloat();
                    
                }
                bimestre(notas[0], notas[1], notas[2], notas[3]);
            }
                
            
            case 2 -> {
                
                for(c = 0; c <= 2; c++){
                    
                    System.out.print("Nota " + (c+1) + ": ");
                    notas[c] = f.nextFloat();
                    
                }
                trimestre(notas[0], notas[1], notas[2]);
            }
                
            
            case 3 -> {
                
                for(c = 0; c <= 1; c++){
                    
                    System.out.print("Nota " + (c+1) + ": ");
                    notas[c] = f.nextFloat();
                    
                }
                semestre(notas[0], notas[1]);
            }
        }
    }
}
