package CuartaIteracion;

public class CategoriaException extends RuntimeException {

    public CategoriaException(String msg) {
        super(msg);
    }


    /*
    CategoriaException(Categoria actual, Categoria contraria){
        super("No estas seleccionando una prenda de categoria "+ actual.toString() +
                " como se debe,sino que estas seleccionando una prenda de categoria " +
                contraria.toString());
    }
    ver a futuro
    */

}
