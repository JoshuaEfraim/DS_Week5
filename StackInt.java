interface StackInt<E> {
    E push (E obj);
    E pop();
    E peek();
    boolean isEmpty(); 
}