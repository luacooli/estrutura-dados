package br.correia;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.push("Lua");
        pilha.push("Naka");
        pilha.push("Pedro");
        pilha.push("Leticia");

        System.out.println(pilha.show());
        System.out.println("No topo esta o valor: " + pilha.peek());

        No removido = pilha.pop();
        System.out.println("removido " + removido.getInfo());
        System.out.println(pilha.show());
    }
}
