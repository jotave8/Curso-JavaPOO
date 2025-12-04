public class Post {
    private String conteudo;
    private String autor;
    private int curtidas;
    private boolean publico;
    
    public Post(String conteudo, String autor) {
        this(conteudo, autor, true);
    }

    public Post(String conteudo, String autor, boolean publico) {
        validarConteudo(conteudo);
        validarAutor(autor);
        this.conteudo = conteudo;
        this.autor = autor;
        this.publico = publico;
    }

    public void curtir(){
        this.curtidas += 1;
        System.out.println("Post curtido! Total de curtidas: " + curtidas);
    }

    public void curtir(int quantidade){
        this.curtidas += quantidade;
        System.out.println("Post curtido! Total de curtidas: " + curtidas);
    }

    private void validarConteudo(String conteudo) {
        if (conteudo == null || conteudo.trim().isEmpty()) {
            throw new IllegalArgumentException("Conteúdo não pode ser vazio");
        }
    }
    private void validarAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("Autor não pode ser vazio");
        }
    }
}
