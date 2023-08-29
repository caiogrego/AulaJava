
  public class MeuProjeto {
    static String nome;
    public int idade = 36;
    public double peso = 87.5;
    public char letra = 'a';

    static void meuMetodo(String par) {
      System.out.println(par);
    }

    public static void main(String[] args) {
        MeuProjeto esteProjeto = new MeuProjeto();
        esteProjeto.idade = 34;
        esteProjeto.letra = 'c';
        esteProjeto.peso = 3.56;
        String texto = "Valor: ";
        String MeuNovoNome = "Caio";
        MeuProjeto.setNome(MeuNovoNome);
        meuMetodo(MeuProjeto.getNome());
        System.out.println(texto + esteProjeto.peso);
        meuMetodo("" + esteProjeto.idade + esteProjeto.peso);
        meuMetodo(esteProjeto.idade + esteProjeto.peso + "");
    }

    public static String getNome() {
      return MeuProjeto.nome;
    }
    public static void setNome(String novoNome) {
        MeuProjeto.nome = novoNome;
    }

 }