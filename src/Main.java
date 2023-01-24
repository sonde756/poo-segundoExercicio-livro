import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Edson", 23, 'M');
        p[1] = new Pessoa("Hudson", 13, 'M');
       p[2] = new Pessoa("Helena", 21, 'F');

        l[0] = new Livro("Java is life","Edson Rafael",300,p[0]);
        l[1] = new Livro("Java is Love","Lula",213,p[1]);
        l[2] = new Livro("Como o Kotlin matou o java ","Bolsonaro",250,p[2]);



        l[0].abrir();
        l[0].folhear(3232);
        System.out.print(l[0].detalhes());
    }
}