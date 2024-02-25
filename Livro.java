public class Livro {
    private String titulo;
    private String autor;
    private String assunto;
    private int qtdePaginas;
    private String editora;
    private String ISBN;

    public Livro(String titulo, String autor, String assunto, int qtdePaginas, String editora, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.assunto = assunto;
        this.qtdePaginas = qtdePaginas;
        this.editora = editora;
        this.ISBN = ISBN;
    }

    public void imprimirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Assunto: " + assunto);
        System.out.println("Quantidade de páginas: " + qtdePaginas);
        System.out.println("Editora: " + editora);
        System.out.println("ISBN: " + ISBN);
    }

    public static void main(String[] args) {
        Livro coraline = new Livro("Coraline", "Neil Gaiman", "Fantasia", 176, "Intrínseca", "978-85-8057-170-8");

        coraline.imprimirDados();
    }
}
