package program;

public class Produto {
    private long id;
    private String titulo;
    private String descricacao;
    private String marca;
    private String modelo;
    private String categoria;

    public Produto(long id, String titulo, String descricacao, String marca, String modelo, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.descricacao = descricacao;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricacao() {
        return this.descricacao;
    }

    public void setDescricacao(String descricacao) {
        this.descricacao = descricacao;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", descricacao='" + getDescricacao() + "'" +
            ", marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", categoria='" + getCategoria() + "'" +
            "}";
    }

}