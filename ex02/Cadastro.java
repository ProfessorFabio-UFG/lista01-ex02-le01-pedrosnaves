import java.util.ArrayList;

public class Cadastro {
    private ArrayList<Morador> morador;

    public Cadastro() {
        morador = new ArrayList<>();
    }

    public void cadastrarMorador(Morador m) {
        morador.add(m);
    }

    public void listarMorador() {
        for (Morador m : morador) {
            System.out.println(m);
        }
    }

}
