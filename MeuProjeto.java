import java.util.Scanner;

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

        //System.out.print("Digite um texto: ");
        //Scanner sc = new Scanner(System.in);
        //String valorDigitado = sc.nextLine(); // Lê o teclado.
        //sc.close();

        // Exibe o valor digitado pelo teclado.
        //System.out.println(valorDigitado);
        esteProjeto.lerDouble();
    }

    public void lerDouble() {
      System.out.print("Digite um numero real: ");
      Scanner sc = new Scanner(System.in);
      String valorString = sc.nextLine();
      sc.close();
      Double valorDouble = 0.0;
      try {
        valorDouble = Double.parseDouble(valorString);
      } catch (Exception e) {
        System.out.println("Erro ao converter!!");
      }
      valorDouble += 100;
      System.out.print("Valor com a soma de 100: " + valorDouble);
    }

    public static String getNome() {
      return MeuProjeto.nome;
    }
    public static void setNome(String novoNome) {
        MeuProjeto.nome = novoNome;
    }

 }