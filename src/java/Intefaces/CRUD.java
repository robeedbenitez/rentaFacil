package Intefaces;

import java.util.List;

public interface CRUD<A> {

    public List<A> listar();

    public A list(int a);

    public boolean add(A a);

    public boolean edit(A a);

    public boolean eliminar(int a);

}
