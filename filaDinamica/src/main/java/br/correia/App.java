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
        Lista lista = new Lista();

        lista.addEnd("Lua");
        lista.addEnd("Naka");
        lista.addStart("Leticia");
        lista.addEnd("Pedro");

        System.out.println(lista.show());

        No removido = lista.removeStart();
        System.out.println("removido " + removido.getInfo());
        System.out.println(lista.show());

        removido = lista.removeEnd();
        System.out.println("removido " + removido.getInfo());
        System.out.println(lista.show());
    }
}
