//ALTERNATIVA 1
public class PrendaBuilder{
    private Tipo tipoActual;
    private Material materialPrenda;
    private Color colorPrincipal;
    private Color colorSecundario;

    //optamos por un constructor para asi siempre el usuario deba ingresar el tipo de prenda,tela,color primario
    PrendaBuilder(Tipo tipoSolicitado,Material materialSolicitado,Color colorPrincipalSolicitado){
        this.tipoActual = tipoSolicitado;
        this.materialPrenda = materialSolicitado;
        this.colorPrincipal = colorPrincipalSolicitado;
    }

    Categoria cateogoriaDePrenda(){
        return tipoActual.getCategoria();
    }
    void indicarColorSecundario(Color colorAagregar){
        this.colorSecundario = colorAagregar;
    }
}


enum Material{
    TELA, LANA, CUERO, JEAN
}

enum Tipo{
    ZAPATOS(Categoria.CALZADO),
    MUSCULOSA(Categoria.SUPERIOR),
    CAMISA_MANGASCORTAS(Categoria.SUPERIOR),
    CAMISA_MANGASLARGAS(Categoria.SUPERIOR),
    PANTALON(Categoria.INFERIOR),
    ANTEOJOSDESOL(Categoria.ACCESORIO),
    PAÑUELO(Categoria.ACCESORIO),
    ZAPATILLAS(Categoria.CALZADO);


    private Categoria categoria;

    Tipo(Categoria categoriaCorrecta){
        this.categoria = categoriaCorrecta;
    }
    public Categoria getCategoria(){
        return categoria;
    }
    //no hacemos un setter ya que no seria correcto, ya que la categoria de una prenda es siempre estatica
}


enum Categoria{
    SUPERIOR, CALZADO,INFERIOR,ACCESORIO
}
enum Color {
    ROJO, VERDE, AMARILLO, AZUL
}

