public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Morganna", 32);
        Pessoa p2 = new Pessoa("Lissa", 15);
        Pessoa p3 = new Pessoa("Pachi", 31);

        PessoaDAO d = new PessoaDAO();
        d.adicionar(p1);
        d.adicionar(p2);
        d.adicionar(p3);

        System.out.println(d.getPessoa("Pachi"));
        System.out.println(d.getPessoa("Naw"));

        System.out.println(d.idadeMenor30());
    }
}
