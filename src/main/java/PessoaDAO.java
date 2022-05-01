import java.util.ArrayList;

public class PessoaDAO{
    private ArrayList<Pessoa> pessoas = new ArrayList();

    public void adicionar(Pessoa p){
        this.pessoas.add(p);
    }

    public String getPessoa(String nome){
        for(Pessoa pessoa:pessoas) {
            if(pessoa.getNome().equals(nome)){
                return "Nome: " + pessoa.getNome() +
                        "\nIdade: " + pessoa.getIdade();
            }
        }
        return "A pessoa " + nome + " não foi cadastrada";
    }

    public String idadeMenor30(){
        ArrayList<String> menor30 = new ArrayList();
        for(Pessoa pessoa:pessoas){
            if(pessoa.getIdade()<30){
                menor30.add(pessoa.getNome());
            }
        }
        if(menor30.size()==0){
            return "Não há pessoas com menos de 30 anos";
        }
        return menor30.toString();
    }
}
