public class Main {
    public static void main(String[] args) {

    //CRIAÇÃO DOS OBJETOS
        Esfera esfera1 = new Esfera();
            esfera1.setNome("Esféra");
            esfera1.setCor("Vermelho");
            esfera1.setRaio(5.65);

        Cubo cubo1 = new Cubo();
            cubo1.setNome("Cubo");
            cubo1.setCor("Azul");
            cubo1.setAresta(2.35);

        Cilindro cilindro1 = new Cilindro();
            cilindro1.setNome("Cilíndro");
            cilindro1.setCor("Amarelo");
            cilindro1.setAreaBase(6.78);
            cilindro1.setAltura(3.45);

        Piramide piramide1 = new Piramide();
            piramide1.setNome("Pirâmide");
            piramide1.setCor("Verde");
            piramide1.setAreaBase(13.26);
            piramide1.setAltura(8.93);


    //ADICIOANDO AO VETOR
        SolidoGeometrico solidos [] = new SolidoGeometrico[4];
            solidos[0] = esfera1;
            solidos[1] = cubo1;
            solidos[2] = cilindro1;
            solidos[3] = piramide1;

    //CHAMANDO RELATÓRIO PARA IMPRESSÃO
        Impressao impressao = new Impressao();
            impressao.imprimir(solidos);
    }
}
