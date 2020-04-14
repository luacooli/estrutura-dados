package br.correia;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class PilhaTest {

    private Pilha pilha;
    private final String name1 = "Naka";
    private final String name2 = "Lua";

    @Before
    public void setup() {
        pilha = new Pilha();
    }

    @Test
    public void testIsEmpty() {
        boolean vazia = pilha.isEmpty();

        assertTrue("Uma pilha nova deve iniciar vazia", vazia);
    }

    @Test
    public void testNotEmpty() {
        pilha.push(name1);
        boolean vazia = pilha.isEmpty();

        assertFalse("Uma pilha com um elemento nao deve estar vazia", vazia);
    }

    @Test
    public void testPushOnEmptyStack() {
        pilha.push(name1);
        String out = pilha.show();

        String expected = name1 + "__";

        assertEquals("Apos insercao deve ser exibido " + name1, expected, out);
    }

    @Test
    public void testPushOnNonEmptyStack() {
        pilha.push(name1);
        pilha.push(name2);
        String out = pilha.show();

        String expected = name2 + "__" + name1 + "__" ;

        assertEquals("Apos insercao de dois nomes ambos devem ser exibidos em respeitando ordem", expected, out);
    }

    @Test
    public void testRemoveOnNonEmptyStack() {
        pilha.push(name1);
        pilha.push(name2);

        String nome = pilha.pop().getName();

        String expected = name2;

        assertEquals("Deve ser removido o nome que estava no topo da pilha", expected, nome);
    }

    @Test
    public void testRemoveOnEmptyStack() {

        No removido = pilha.pop();

        assertEquals("Remocao de uma pilha vazia de ve retornar nulo", null, removido);
    }
}
