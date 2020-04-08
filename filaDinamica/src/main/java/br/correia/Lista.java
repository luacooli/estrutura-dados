package br.correia;

public class Lista {
  private No first;

  public Lista() {
    first = null;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public void addEnd(String name) {
    No newNode = new No(name);

    if(isEmpty()) {
      first = newNode;
    } else {
      No aux = first;
      while(aux.getProx() != null) {
        aux = aux.getProx();
      }
      aux.setProx(newNode);
    }
  }

  public void addStart(String name) {
    No newNode = new No(name);
    if(isEmpty()) {
      first = newNode;
    } else {
      newNode.setProx(first);
      first = newNode;
    }
  }

  public No removeStart() {
    if(isEmpty()) {
      return null;
    }

    No aux = first;
    first = first.getProx();
    return aux;
  }

  public No removeEnd() {
    if(isEmpty()) {
      return null;
    }

    No aux = first;
    No previous = null;

    while(aux.getProx() != null) {
      previous = aux;
      aux = aux.getProx();
    }

    if(previous != null) {
      previous.setProx(null);
    } else {
      first = null;
    }
    return aux;

  }

  public String show() {
    String out = "";
    No aux = first;

    while(aux != null) {
      out += aux.getInfo() + "__";
      aux = aux.getProx();
    }

    return out;
  }
}