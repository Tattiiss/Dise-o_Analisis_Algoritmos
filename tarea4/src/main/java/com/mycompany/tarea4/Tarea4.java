
package com.mycompany.tarea4;

public class Tarea4 {

    public static void main(String[] args) {
        int n = 10000;
        
        int[] info = new int[n];
        for (int i = 0; i<n; i++){
            info[i] = (i+1)*5;
        }
        
        int buscado = 500;
        int lim_inf = 0;
        int lim_sup = info.length -1;
        
        
        int posi = -1;
        boolean resultado = false;
        
        while (lim_inf <= lim_sup){
            posi = (lim_sup + lim_inf)/2;
            if (info[posi] == buscado){
                resultado = true;
                break;
            } else if (info[posi] < buscado){
                lim_inf = posi +1;
            } else {
                lim_sup = posi-1;
            }
        }
        if (resultado){
            System.out.println("El numero "+buscado+" esta en la posicion "+ posi);
        } else {
            System.out.println("No esta");
        }
    }
}
