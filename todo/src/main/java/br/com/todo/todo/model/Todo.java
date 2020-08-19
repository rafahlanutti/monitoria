package br.com.todo.todo.model;

public class Todo {

    private Integer id;
    private String titulo;
    private String descricao;
    private Boolean completado;
   
    public Todo(Integer id, String titulo, String descricao, Boolean completado) {
        super();
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.completado = completado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getCompletado() {
        return completado;
    }

    public void setCompletado(Boolean completado) {
        this.completado = completado;
    }
    
    
    
    
}
