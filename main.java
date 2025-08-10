/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shell;

/**
 *
 * 
 */
public class SHELL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se declara e inicializa el arreglo, una variable auxiliar, y k que son los saltos
        int arreglo[]={99,5,24,9,7};
        int aux;
        int k=arreglo.length/2;
        //Mientras el numero de saltos sea mayor a 0
        while(k>0){
            //Se comienza un ciclo dodne i vale k y terninara en cuanto i supere el tamaño del arreglo y se incrementa en 1
            for (int i = k; i < arreglo.length; i++) {
                //Se declara e inicializa la variable j que es un puntero
                int j=i-k;
                //Mientras j sea mayor o igual a 0
                while(j>=0){
                    //Se declara e inicializa la variable l que sera otro puntero
                    int l=j+k;
                    //Se toma la desicion de que si lo que esta en j es menor a lo de i
                    if(arreglo[j]>=arreglo[l]){
                        //Se asigna el valor del arreglo en  j al auxiliar, se cambia lo que esta en j por lo que esta en l y al arreglo en l se le asigna el valor del auxiliar
                        //es decir se genera el cambio de valores del arreglo y se modifica j para poder seguir o romper el ciclo.
                        aux=arreglo[j];
                        arreglo[j]=arreglo[l];
                        arreglo[l]=aux;
                        j=j-k;
                    }
                    //Se modifica j a -1 para romper el ciclo
                    else{
                        j=-1;
                    }
                }
            }
            k=k/2;
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
    
}
