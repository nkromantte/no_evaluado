package com.company;
import java.lang.String;
import java.util.Scanner;


class matriz{
    int array[][] , array2[][], array3[][];
    Scanner n = new Scanner(System.in);


    public void setSum(){
        int i,j;
        int auxi = 0;
        int auxj = 0;

        for (int k=1; k<=3;k++ ) {
            System.out.println("Matriz numero: " + k );
            System.out.println("Tamaño de la filas");
            i = this.n.nextInt();
            System.out.println("Tamaño de la columnas");
            j = this.n.nextInt();
            if( k == 2){
                if(i == auxi) {
                    if (j == auxj) {
                    } else {
                        System.out.println("Las matrices No son iguales");
                        break;
                    }
                }else{  System.out.println("Las matrices No son iguales");
                    break;
                }
            }

            if( k == 3){
                if(i == auxj) {
                    if (j == auxi) {
                    } else {
                        System.out.println("tamaño invalido para Multiplicacion");
                        break;
                    }
                }else{  System.out.println("Tamñano invalido para Multipliacion Fila M_B distita Columna M_C");
                    break;
                }
            }

            auxi= i;
            auxj= j;
            this.setMatrices(i,j,k);
        }
    }

    public void renderArray(){
        for (int c = 0 ; c< this.array.length;c++){
            for (int f = 0; f< this.array[f].length;f++){
                System.out.println ( this.array[c][f] );
            }
        }
    }

    public void setMatrices(int x,int y, int o){
        switch(o){
            case 1:  this.array = new int[x][y];
                break;
            case 2:  this.array2 = new int[x][y];
                break;
            case 3:  this.array3 = new int[x][y];
                break;
        }
    }
    public matriz(){

    }
}

class    menu{
    Scanner keying;
    boolean result;

    public void renderMenu(){

        System.out.println("1) Suma de Matrices)");
        System.out.println("2) Matriz de tamaño indefinido)");
        System.out.println("3) Matriz identidad)");
        System.out.println("4) Matriz Triaungulo Superior");
        System.out.println("5) Salir del Sistema");
    }

    public void mostrarMenu(){
        matriz array = new matriz();
        while(!this.result) {
            System.out.println("Escoge una opción");
            int e = this.keying.nextInt();
            switch (e) {
                case 1:  array.setSum();
                         this.renderMenu();
                         break;
                case 5: System.out.println("Hasta luego");
                        this.result = true;
                        break;
                default: System.out.println("Opción invalida");
            }
        }
    }

    public menu(){
        this.keying = new Scanner(System.in);
        this.result = false;
    }
}


public class Main {

    public static void main(String[] args) {
	        menu men = new menu();
            men.renderMenu();
            men.mostrarMenu();
    }
}
