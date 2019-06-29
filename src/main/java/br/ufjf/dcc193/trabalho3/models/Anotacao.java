package br.ufjf.dcc193.trabalho3.models;

public class Anotacao {

    private long idAnotacao;
    private String descricao;
    private String url;
    private Usuario usuario;
    private String dataInclusão;
    private String dataAlteracao;

    public Anotacao() {
    }

    public Anotacao(long idAnotacao, String descricao, String url, Usuario usuario, String dataInclusão, String dataAlteracao) {
        this.idAnotacao = idAnotacao;
        this.descricao = descricao;
        this.url = url;
        this.usuario = usuario;
        this.dataInclusão = dataInclusão;
        this.dataAlteracao = dataAlteracao;
    }

    public long getIdAnotacao() {
        return idAnotacao;
    }

    public void setIdAnotacao(long idAnotacao) {
        this.idAnotacao = idAnotacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDataInclusão() {
        return dataInclusão;
    }

    public void setDataInclusão(String dataInclusão) {
        this.dataInclusão = dataInclusão;
    }

    public String getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(String dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }
}
