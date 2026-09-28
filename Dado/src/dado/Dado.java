package dado;

import java.util.Random;

public class Dado {
    // a) Campo constante privado de faces (6 lados)
    private static final int QTD_FACES = 6;

    // b) Campo privado para guardar a face atual
    private int valorFace;

    // c) Construtor sem argumentos: inicializa valorFace em 1
    public Dado() {
        this.valorFace = 1;
    }

    // d) Getter e Setter para valorFace
    public int getValorFace() {
        return this.valorFace;
    }

    public void setValorFace(int valorFace) {
        // Valida se o valor está dentro do limite (1 a 6)
        if (valorFace >= 1 && valorFace <= QTD_FACES) {
            this.valorFace = valorFace;
        } else {
            System.out.println("Valor inválido para a face do dado");
        }
    }

    // e) Método para rolar o dado (sorteia entre 1 e QTD_FACES)
    public void rolar() {
        Random random = new Random();
        // nextInt(6) gera de 0 a 5, somando 1 resulta em 1 a 6
        this.valorFace = random.nextInt(QTD_FACES) + 1;
    }

    // f) Método que retorna a quantidade de faces do dado
    public int getQuantidadeFaces() {
        return QTD_FACES;
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        // Criando o objeto
        Dado meuDado = new Dado();

        System.out.println("Quantidade de faces: " + meuDado.getQuantidadeFaces());
        System.out.println("Valor inicial da face: " + meuDado.getValorFace());

        System.out.println("\n--- Rolando o dado 3 vezes ---");
        for (int i = 1; i <= 3; i++) {
            meuDado.rolar();
            System.out.println("Rolagem " + i + ": " + meuDado.getValorFace());
        }

        System.out.println("\n--- Testando o método setValorFace ---");
        // Teste com valor válido
        meuDado.setValorFace(5);
        System.out.println("Novo valor definido: " + meuDado.getValorFace());

        // Teste com valor inválido
        meuDado.setValorFace(8);
    }
}