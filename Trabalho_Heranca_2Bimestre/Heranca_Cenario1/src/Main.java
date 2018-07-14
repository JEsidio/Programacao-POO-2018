public class Main {
    public static void main (String[] args){

    //CRIAÇÃO DOS OBJETOS
        Gato gato1 = new Gato();
            gato1.setNome("Gato");
            gato1.setRaca("Siamês");
            gato1.setPreco(100);
            gato1.setExpectativaDeVida(20);
            gato1.setSexo("Fêmea");
            gato1.setAlturaDoPulo(1.75);
            gato1.setPeloLongo(true);

        BorderCollie borderCollie1 = new BorderCollie();
            borderCollie1.setNome("Cachorro");
            borderCollie1.setRaca("Border Collie");
            borderCollie1.setPreco(200);
            borderCollie1.setExpectativaDeVida(17);
            borderCollie1.setSexo("Macho");
            borderCollie1.setIntensidadeDoLatido(2.39);

        BeijaFlor beijaFlor1 = new BeijaFlor();
            beijaFlor1.setNome("Beija-Flor");
            beijaFlor1.setRaca("Beija-Flor-Rajado");
            beijaFlor1.setPreco(50);
            beijaFlor1.setExpectativaDeVida(5);
            beijaFlor1.setSexo("Fêmea");
            beijaFlor1.setTamanhoDoBico(0.3);

        Aguia aguia1 = new Aguia();
            aguia1.setNome("Águia");
            aguia1.setRaca("Águia-Americana");
            aguia1.setPreco(550);
            aguia1.setExpectativaDeVida(20);
            aguia1.setSexo("Macho");
            aguia1.setAlcanceDaVisao(120);
            aguia1.setTamanhoDoBico(0.9);

        Bigua bigua1 = new Bigua();
            bigua1.setNome("Biguá");
            bigua1.setRaca("Biguá-Albino");
            bigua1.setPreco(225);
            bigua1.setExpectativaDeVida(12);
            bigua1.setSexo("Fêmea");
            bigua1.setTamanhoDoBico(0.6);


    //ADICIOANDO AO VETOR
        Animal animais [] = new Animal[5];
            animais[0] = gato1;
            animais[1] = borderCollie1;
            animais[2] = beijaFlor1;
            animais[3] = aguia1;
            animais[4] = bigua1;

    //CHAMANDO RELATÓRIO PARA IMPRESSÃO
        Impressao impressao = new Impressao();
            impressao.imprimir(animais);
    }
}
