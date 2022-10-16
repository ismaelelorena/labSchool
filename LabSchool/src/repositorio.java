
import java.util.ArrayList;
import java.util.List;
public class repositorio {

    private List<Pessoa> cadastro = new ArrayList<>();

    public void adicionar(Pessoa pessoa) {
        cadastro.add(pessoa);
    }

    public List<Pessoa> consultar() {
        return cadastro;
    }

}
