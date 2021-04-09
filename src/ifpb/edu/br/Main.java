package ifpb.edu.br;

import ifpb.edu.br.buffer.Buffer;
import ifpb.edu.br.buffer.BufferExemplo;
import ifpb.edu.br.consumidor.Consumidor;
import ifpb.edu.br.produtor.Produtor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService teste = Executors.newFixedThreadPool(2);
        Buffer localizacaoCompartilhada = new BufferExemplo();
        try{
            teste.execute(new Produtor(localizacaoCompartilhada));
            teste.execute(new Consumidor(localizacaoCompartilhada));
        } catch (Exception e) {
            e.printStackTrace();
        }
        teste.shutdown();

    }
}
