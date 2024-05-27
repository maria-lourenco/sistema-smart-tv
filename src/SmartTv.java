/**
 * <h1>SmartTv</h1>
 * A SmartTv contém diversas funcionalidades.
 * <p>
 * <b>Note:<b> Leia atentamente a documentação desta Classe
 * para desfrutar de todos os recursos oferecidos pelo autor.
 * 
 * @author Maria Lourenço
 * @version 1.0
 * @since 24/05/2024
 * 
 */


public class SmartTv {
    /**
     * Este método é utilizado para verificar se a TV esta ligada
     * e verificar o canal e volume que ela se encontra.Sendo assim
     * o ususario pode alternar volume e canal desejados.
     */
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
        
    /**
    * Este método é utilizado para que o ususario tenha liberdade 
    * de digitar o canal desejado.
    */

    public void mudarCanal(int novoCanal){
   
        canal = novoCanal;
    }

    public void  aumentarCanal(){
        canal ++;
    }

    public void  diminuirCanal(){
        canal --;
    }


    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando volume para:" + volume);
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo volume para:" + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }


    
}
