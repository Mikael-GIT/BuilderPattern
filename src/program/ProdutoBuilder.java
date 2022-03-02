package program;

public class ProdutoBuilder {

    private long id;
    private String titulo;
    private String descricacao;
    private String marca;
    private String modelo;
    private String categoria;

    //O Builder é um padrão de projeto criacional, que permite a construção de objetos complexos passo a passo.
    //Ao invés de instanciarmos um objeto de uma vez atraves de um construtor, chamamos uma builder em que poderemos
    //encadear uma serie de chamadas para montar o objeto.
    public ProdutoBuilder() {}

    public ProdutoBuilder Id(long id) {
        this.id = id;
        return this;
    }

    public ProdutoBuilder Titulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public ProdutoBuilder Descricacao(String descricacao) {
        this.descricacao = descricacao;
        return this;
    }

    public ProdutoBuilder Marca(String marca) {
        this.marca = marca;
        return this;
    }

    public ProdutoBuilder Modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public ProdutoBuilder Categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public Produto build(){
        return new Produto(id, titulo, descricacao, marca, modelo, categoria);
    }
    
}