public class Student {
    private String matricula;
    private String nome;
    private int idade;
    private String curso;

    public Student(String matricula, String nome){
        validarMatricula(matricula);
        this.matricula = matricula;
        this.nome = nome;
    }

    public Student(String matricula, String nome, int idade){
        this(matricula, nome);
        this.idade = idade;
    }

    public Student(String matricula, String nome, int idade, String curso){
        this(matricula, nome, idade);
        this.curso = curso;
    }

    public String getMatricula() { return matricula; }
    public String getNome() { return nome; }
    private int getIdade() { return idade; }
    private String getCurso() { return curso; }

    private void validarMatricula(String matricula){
        if(matricula == null || matricula.trim().isEmpty()){
            throw new IllegalArgumentException("Matricula não pode ser vazio.");
        }
    }

    public void display(){
        System.out.print("Matricula: " + getMatricula() + "\nNome: " + getNome() + "\nCurso: " + getCurso() + "\n\n");
    }
}
