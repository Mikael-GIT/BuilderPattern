package program;

public class application {
    public static void main(String[] args) {
       Produto produto = new ProdutoBuilder()
        .Id(0)
        .Titulo("TV LCD")
        .Marca("Nova")
        .Modelo("NOVA VIDA")
        .Descricacao("Novinha em folha")
        .Categoria("TELEVISORES")
        .build();

        System.out.println(produto);
    }
}