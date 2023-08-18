// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        cria objeto chamado c1
      ContaCorrent c1 = new ContaCorrent();
      c1.cadastrar(123,"Ana",789);
      c1.depositar(1000);
        System.out.println("Saldo da conta: " + c1.consultarsaldo());
        c1.sacar(2000);
    }
}