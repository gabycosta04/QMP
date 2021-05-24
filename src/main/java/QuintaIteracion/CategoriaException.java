package QuintaIteracion;

public class CategoriaException extends RuntimeException {

    CategoriaException(String msg) {
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
