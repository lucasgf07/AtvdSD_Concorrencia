package ifpb.edu.br.produtor;

import ifpb.edu.br.buffer.Buffer;

import java.util.Random;

public class Produtor  implements Runnable{

    private static Random gerador = new Random();
    private Buffer localizacaoCompartilhada;

    public Produtor(Buffer compartilhado){
        localizacaoCompartilhada = compartilhado;
    }

    @Override
    public void run() {
        for(int contador=1; contador<=10;contador ++){
            try{
                Thread.sleep(gerador.nextInt(3000));
                localizacaoCompartilhada.set((contador));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("\n%s\n%s\n", "Produtor produz!!!!!",
 "Fim do Produtor.");
    }
}
