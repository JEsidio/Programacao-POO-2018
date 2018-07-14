public class Main {
    public static void main (String[] args){

    //CRIANDO OBJETOS
        Cliente cliente1 = new Cliente();
            cliente1.setNome("Camila");
            cliente1.setSobrenome("Mendes");
            cliente1.setDataNascimento("03-03-1988");
            cliente1.setRg(6985742);
            cliente1.setCpf("14569852344");
            cliente1.setEndereco("Rua das Palmeiras - Centro. Joinville - SC, Brasil");
            cliente1.setSexo("Feminino");
            cliente1.setEmail("camila_mendes@outlook.com");
            cliente1.setTelefone("(47) 4002-8922");
            cliente1.setPessoaFisica(true);
            cliente1.setRazaoSocial("Camila Mendes");
            cliente1.setNomeFantasia("MENDES, Camila");

        Fornecedor fornecedor1 = new Fornecedor();
            fornecedor1.setNome("Yuri");
            fornecedor1.setSobrenome("Chan");
            fornecedor1.setDataNascimento("19-08-1973");
            fornecedor1.setRg(8523692);
            fornecedor1.setCpf("59862147859");
            fornecedor1.setEndereco("Rua do Príncipe - Centro. Joinville - SC, Brasil");
            fornecedor1.setSexo("Masculino");
            fornecedor1.setEmail("yuri_chan@outlook.com");
            fornecedor1.setTelefone("(47) 0800 777 7000");
            fornecedor1.setPessoaFisica(false);
            fornecedor1.setRazaoSocial("Yuri Chan");
            fornecedor1.setNomeFantasia("Chan's Interprise");
            fornecedor1.setCnpj("51673005000116");

        Vendedor vendedor1 = new Vendedor();
            vendedor1.setNome("Maria");
            vendedor1.setSobrenome("Souza");
            vendedor1.setDataNascimento("08-12-1977");
            vendedor1.setRg(6854236);
            vendedor1.setCpf("87458962516");
            vendedor1.setEndereco("Avenida Júpter - Paraíso. Joinville - SC, Brasil");
            vendedor1.setSexo("Feminino");
            vendedor1.setEmail("maria_souza@outlook.com");
            vendedor1.setTelefone("(47) 5896-9658");
            vendedor1.setPessoaFisica(true);
            vendedor1.setNumeroRegistro(4589658);
            vendedor1.setNumeroCarteiraTrabalho(458796);
            vendedor1.setSerieCarteiraTrabalho("A-589");
            vendedor1.setDepartamento("Vendas");
            vendedor1.setCargo("Vendedor");
            vendedor1.setSalario(1985.50);
            vendedor1.setTurno("Manhã-Tarde");
            vendedor1.setNumeroVendas(17);

        OperadorCompras operadorCompras1 = new OperadorCompras();
            operadorCompras1.setNome("Pedro");
            operadorCompras1.setSobrenome("Silva");
            operadorCompras1.setDataNascimento("28-05-1985");
            operadorCompras1.setRg(1458745);
            operadorCompras1.setCpf("87458962516");
            operadorCompras1.setEndereco("Rua Inambú - Costa e Silva. Joinville - SC, Brasil");
            operadorCompras1.setSexo("Masculino");
            operadorCompras1.setEmail("pedro_silva@outlook.com");
            operadorCompras1.setTelefone("(47) 5263-6985");
            operadorCompras1.setPessoaFisica(true);
            operadorCompras1.setNumeroRegistro(589654);
            operadorCompras1.setNumeroCarteiraTrabalho(258965);
            operadorCompras1.setSerieCarteiraTrabalho("B-596");
            operadorCompras1.setDepartamento("Compras");
            operadorCompras1.setCargo("Operador de Compras");
            operadorCompras1.setSalario(2185.50);
            operadorCompras1.setTurno("Tarde-Noite");

        GerenteDepartamentos gerenteDepartamento1 = new GerenteDepartamentos();
            gerenteDepartamento1.setNome("Lauren");
            gerenteDepartamento1.setSobrenome("Drummond ");
            gerenteDepartamento1.setDataNascimento("27-06-1987");
            gerenteDepartamento1.setRg(5698231);
            gerenteDepartamento1.setCpf("12548965823");
            gerenteDepartamento1.setEndereco("Rua Iririú - Iririú. Joinville - SC, Brasil");
            gerenteDepartamento1.setSexo("Feminino");
            gerenteDepartamento1.setEmail("lauren_drummond @outlook.com");
            gerenteDepartamento1.setTelefone("(47) 3485-5269");
            gerenteDepartamento1.setPessoaFisica(true);
            gerenteDepartamento1.setNumeroRegistro(458963);
            gerenteDepartamento1.setNumeroCarteiraTrabalho(2541896);
            gerenteDepartamento1.setSerieCarteiraTrabalho("C-666");
            gerenteDepartamento1.setDepartamento("Financeiro");
            gerenteDepartamento1.setCargo("Gerente");
            gerenteDepartamento1.setSalario(3985.50);
            gerenteDepartamento1.setTurno("Manhã-Tarde");


    //ADICIOANDO AO VETOR
        Pessoa pessoas [] = new Pessoa[5];
            pessoas[0] = cliente1;
            pessoas[1] = fornecedor1;
            pessoas[2] = vendedor1;
            pessoas[3] = operadorCompras1;
            pessoas[4] = gerenteDepartamento1;

    //CHAMANDO RELATÓRIO PARA IMPRESSÃO
        Impressao impressao = new Impressao();
            impressao.imprimir(pessoas);
    }
}
