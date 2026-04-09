/**
 * Nodo genérico para estructuras enlazadas
 */
public class Nodo<T> {

    private T data;
    private Nodo<T> next;

    /**
     * Constructor vacío
     */
    public Nodo() {
        this.data = null;
        this.next = null;
    }

    /**
     * Constructor con dato
     */
    public Nodo(T data) {
        this.data = data;
        this.next = null;
    }

    /**
     * Obtiene el dato almacenado
     */
    public T getData() {
        return data;
    }

    /**
     * Cambia el dato
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Obtiene el siguiente nodo
     */
    public Nodo<T> getNext() {
        return next;
    }

    /**
     * Cambia la referencia al siguiente nodo
     */
    public void setNext(Nodo<T> sig) {
        this.next = sig;
    }

    /**
     * Muestra el dato como texto
     */
    @Override
    public String toString() {
        return data.toString();
    }
}