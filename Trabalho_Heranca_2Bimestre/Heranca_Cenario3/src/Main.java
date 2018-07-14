public class Main {
    public static void main(String[] args) {

    //CRIAÇÃO DOS OBJETOS
        CDMusica cd1 = new CDMusica();
            cd1.setCodigoProduto(1);
            cd1.setTipoProduto("CD Música");
            cd1.setNomeProduto("AM - Arctic Monkeys");
            cd1.setValorProduto(29.95);
            cd1.setMarca("Sony Music");
            cd1.setQuantidadeMusicas(12);
            cd1.setDuracao(42);
            cd1.setAnoLacamento(2013);

        DVDFilmeSerie dvd1 = new DVDFilmeSerie();
            dvd1.setCodigoProduto(2);
            dvd1.setTipoProduto("DVD Filme");
            dvd1.setNomeProduto("Vingadores: Guerra Infinita Blu-Ray");
            dvd1.setValorProduto(49.98);
            dvd1.setMarca("Marvel");
            dvd1.setDuracao(144);
            dvd1.setClassificacao("+12");
            dvd1.setAnoLacamento(2018);

        PenDrive penDrive1 = new PenDrive();
            penDrive1.setCodigoProduto(3);
            penDrive1.setTipoProduto("Pen-Drive");
            penDrive1.setNomeProduto("Pen-Drive Cruzer Blade");
            penDrive1.setValorProduto(58.95);
            penDrive1.setMarca("Sandisk");
            penDrive1.setCapacidade(64);

        Livro livro1 = new Livro();
            livro1.setCodigoProduto(4);
            livro1.setTipoProduto("Livro");
            livro1.setNomeProduto("Harry Potter e o Prisioneiro de Azkaban Ilustrado");
            livro1.setValorProduto(79.59);
            livro1.setMarca("Rocco");
            livro1.setNumeroPaginas(336);
            livro1.setIdioma("Português");
            livro1.setAcabamento("Capa Dura");
            livro1.setEdicao(1);

        JogoEletronico jogo1 = new JogoEletronico();
            jogo1.setCodigoProduto(5);
            jogo1.setTipoProduto("Jogo Eletrônico");
            jogo1.setNomeProduto("The Last Of Us Remasterizado");
            jogo1.setValorProduto(50.99);
            jogo1.setMarca("Sony Interactive Entertainment");
            jogo1.setPlataforma("PlayStation 4");
            jogo1.setClassificacao("+16");

    //ADICIOANDO AO VETOR
        Produtos produtos [] = new Produtos[5];
            produtos[0] = cd1;
            produtos[1] = dvd1;
            produtos[2] = penDrive1;
            produtos[3] = livro1;
            produtos[4] = jogo1;

    //CHAMANDO RELATÓRIO PARA IMPRESSÃO
        Relatorio relatorio = new Relatorio();
            relatorio.relatorio(produtos);
    }
}