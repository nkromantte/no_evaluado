package com.company;
import java.lang.String;
import java.util.Scanner;


class matriz{
    int array[][] , array2[][], array3[][], arrayR[][];
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
        this.setArrays(1);
        this.resolverSuma();
    }
    public void setIdefinida(){
        int i,j;
        System.out.println("Tamaño de la filas");
        i = this.n.nextInt();
        System.out.println("Tamaño de la columnas");
        j = this.n.nextInt();

        this.setMatrices(i,j,2);

        for (int f = 0; f < this.array2.length; f++) {
            for (int c = 0; c < this.array2[f].length; c++) {
                this.arrayR[f][c] = 23*((f*f*f*f)) +20*((c*c*c)) -3;
                System.out.print(this.arrayR[f][c]);
                if(c < this.array2[f].length -1)
                System.out.print(", ") ;
            }
            System.out.println(", ") ;
        }
    }


    public void setIdentidad(){
        int i,j;
        int e=0;
        System.out.println("Tamaño de la filas");
        i = this.n.nextInt();
        System.out.println("Tamaño de la columnas");
        j = this.n.nextInt();

        this.setMatrices(i,j,1);
        this.setArrays(2);

        for (int f = 0; f < this.array.length; f++) {
            for (int c = 0; c < this.array[f].length; c++) {
                if(c==f ){
                    if(this.array[c][f]==1){

                    }else{ e++;  }
                }
                if(c!=f ){
                    if(this.array[c][f]==0){

                    }else{ e++; }
                }

            }
        }
        if ( e == 0){System.out.println("Es una matriz identidad");
        }else{
            System.out.println("No es una matriz identidad");
        }
        for (int f = 0; f < this.array.length; f++) {
            for (int c = 0; c < this.array[f].length; c++) {
                System.out.print(this.array[f][c]);
                if(c < this.array[f].length -1)
                    System.out.print(", ") ;
            }
            System.out.println(", ") ;
        }
    }

    public void setTriangulo(){
        int i,j,e;
        e=0;
        System.out.println("Tamaño de la filas");
        i = this.n.nextInt();
        System.out.println("Tamaño de la columnas");
        j = this.n.nextInt();

        this.setMatrices(i,j,2);
        this.setArrays(2);

        for (int f = 0; f < this.array.length; f++) {
            for (int c = 0; c < this.array[f].length; c++) {
                if (c >= f) {
                    if (this.array[c][f] >= 1) {

                    } else {
                        e++;
                    }
                }

                if (f > c) {
                    if (this.array[c][f] == 0) {

                    } else {
                        e++;
                    }
                }
            }
        }
        if ( e == 0){
            System.out.println("Es una matriz identidad");
        }else{
            System.out.println("No una matriz Triangulo Superior");
        }
        for (int f = 0; f < this.array.length; f++) {
            for (int c = 0; c < this.array[f].length; c++) {
                System.out.print(this.array[f][c]);
                if(c < this.array[f].length -1)
                    System.out.print(", ") ;
            }
            System.out.println(", ") ;
        }
    }




    public void setArrays(int o){
        int contador= 1;
        System.out.println("Rellene la matriz:"+ contador);


        if ( o > 1) {
            for (int f = 0; f < this.array.length; f++) {
                for (int c = 0; c < this.array[f].length; c++) {
                        System.out.println("Posición:" + "["+ c + "," + f + "]") ;
                        this.array[f][c] = this.n.nextInt();
                }
            }

        }else{
            for (int f = 0; f < this.array.length; f++) {
                for (int c = 0; c < this.array[f].length; c++) {
                    System.out.println("Posición:" + "["+ c + "," + f + "]") ;
                    this.array[f][c] = this.n.nextInt();
                }
            }

            for (int f = 0; f < this.array2.length; f++) {
                for (int c = 0; c < this.array2[f].length; c++) {
                    System.out.println("Posición:" + "["+ c + "," + f + "]") ;
                    this.array2[f][c] = this.n.nextInt();
                }
            }

            for (int f = 0; f < this.array3.length; f++) {
                for (int c = 0; c < this.array3[f].length; c++) {
                    System.out.println("Posición:" + "["+ c + "," + f + "]") ;
                    this.array3[f][c] = this.n.nextInt();
                }
            }

        }
        contador++;
    }

    public void resolverSuma(){


        for (int f = 0; f < this.array.length; f++) {
            for (int c = 0; c < this.array[f].length; c++) {
               this.arrayR[f][c] = this.array[f][c] + this.array2[f][c];
            }
        }
        System.out.println("Matriz resultande de la Suma M_1 + M_2");
        for (int f = 0; f < this.arrayR.length; f++) {
            for (int c = 0; c < this.arrayR[f].length; c++) {
               System.out.println( this.arrayR[f][c]);
            }
        }

        for (int f = 0; f < this.arrayR.length; f++) {
            for (int c = 0; c < this.arrayR[f].length; c++) {
                this.arrayR[f][c] = this.arrayR[f][c] * this.array3[c][f];
            }
        }

        System.out.println("Matriz resultande de la Multiplicacion (M_1 + M_2) * M_3");
        for (int f = 0; f < this.arrayR.length; f++) {
            for (int c = 0; c < this.arrayR[f].length; c++) {
                System.out.println( this.arrayR[f][c]);
            }
        }
    }

    public void renderArray(int[][] a){
        for (int c = 0 ; c< a.length;c++){
            for (int f = 0; f< a[f].length;f++){
                System.out.println ( a[f][c] );
                System.out.print(",");
            }
            System.out.println(" ");
        }
    }

    public void setMatrices(int x,int y, int o){
        switch(o){
            case 1:  this.array = new int[x][y];
                break;
            case 2:  this.array2 = new int[x][y];
                     this.arrayR = new int[x][y];
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
                case 2: array.setIdefinida();
                        this.renderMenu();
                        break;
                case 3: array.setIdentidad();
                        this.renderMenu();
                        break;
                case 4: array.setTriangulo();
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
