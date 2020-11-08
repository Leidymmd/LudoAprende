package Cotrolador.Logica;

import java.util.Random;

/**
 * @author Leidy Milena Molano Diaz
 * Herramienta Interactiva Digital "LudoAprende"
 */
public class LogicaJuegoMemoria {
    
    public LogicaJuegoMemoria (){
   
    }
        
    public int[]getCardNumbers(int numeroCartas, int numeroImagenes){
        

        int[]numbers = new int [numeroCartas];
        int count = 0;
        
        while(count<numeroCartas){
            Random r= new Random();
            int na = r.nextInt(numeroImagenes)+1;
            int nvr=0;
            
            for(int i=0;i<numeroCartas;i++){
                if(numbers[i]==na){
                    nvr++;
                }
            }
            if(nvr<2){
                numbers[count]=na;
//                 System.out.println("Impresion- "+numbers[count]);
                count++;
            }
        }
//        System.out.println("Impresion"+numbers);
        return numbers;
    }
    
    
}
