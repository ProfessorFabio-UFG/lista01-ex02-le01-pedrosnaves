public class Main {
    public static void main(String[] args) {

        Morador m1 = new Morador ("Claudio", "70864285744", "62995874412", "12/10/1956", "masculino", "A", 102, 1565);
        Morador m2 = new Morador ("Ramon", "40122587466", "62980521466", "14/03/1945", "masculino", "B", 903, 2548);
        Morador m3 = new Morador ("Jorge", "00125863633", "62980566624", "10/11/1999", "masculino", "B", 801, 3305);
        Morador m4 = new Morador ("Abadia", "85966410002", "62999568874", "20/12/1975", "feminino", "C", 505, 4023);
        Morador m5 = new Morador ("Hilda", "11235684715", "62988451965", "19/09/1988", "feminino", "A", 302, 5900);

        Cadastro cadastro = new Cadastro();

        cadastro.cadastrarMorador(m1);
        cadastro.cadastrarMorador(m2);
        cadastro.cadastrarMorador(m3);
        cadastro.cadastrarMorador(m4);
        cadastro.cadastrarMorador(m5);

        cadastro.listarMorador();

    }
}
