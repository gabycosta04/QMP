package FirstAlternative;

//ALTERNATIVA 1
public class PrendaBuilder{
    private Tipo tipoActual;
    private Material materialPrenda;
    private Color colorPrincipal;
    private Color colorSecundario;
    private Categoria categoriaActual;

    //optamos por un constructor para asi siempre el usuario deba ingresar el tipo de prenda,tela,color primario
    PrendaBuilder(Tipo tipoSolicitado,Material materialSolicitado,Color colorPrincipalSolicitado, Categoria categoriaSolicitada){
        if (tipoSolicitado == null) {
            throw new TipoException("Debes seleccionar un tipo de atuendo a utilizar");
        }
        this.tipoActual = tipoSolicitado;
        if (materialSolicitado == null) {
            throw new MaterialException("Debes seleccionar un tipo de material para la prenda");
        }
        this.materialPrenda = materialSolicitado;
        if (colorPrincipalSolicitado == null) {
            throw new ColorException("Debes seleccionar un color de prenda");
        }
        this.colorPrincipal = colorPrincipalSolicitado;

        if (categoriaSolicitada == null) {
            throw new CategoriaException("Debes seleccionar una categoria de prenda");
        }
        if(categoriaSolicitada != tipoSolicitado.getCategoria()){
            throw new CategoriaException("La categoria "+categoriaSolicitada +" no coincide correctamente con la categoria "
                    + tipoSolicitado.getCategoria()+ " del tipo de prenda");
        }
        this.categoriaActual = categoriaSolicitada;
    }


    void indicarColorSecundario(Color colorAagregar){
        this.colorSecundario = colorAagregar;
    }
}


/* PRIMER ALTERNATIVA PLANTEADA POR MI
enum Color {
    ROJO, VERDE, AMARILLO, AZUL
}
*/

//Mejor alternativa planteada por Roli
class Color{
    int rojo;
    int azul;
    int amarillo;

    public Color(int rojonSeleccionado, int azulSeleccionado, int amarilloSeleccionado) {
        this.rojo = rojonSeleccionado;
        this.azul = azulSeleccionado;
        this.amarillo = amarilloSeleccionado;
    }
}


enum Material {
    TELA, LANA, CUERO, JEAN
}

enum Categoria{
    SUPERIOR, CALZADO,INFERIOR,ACCESORIO
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
        if(categoriaCorrecta == null){
            throw new CategoriaException("Debe seleccionar una categoria indicada para el nuevo tipo de prenda");
        }
        this.categoria = categoriaCorrecta;
    }   //no hacemos un setter ya que no seria correcto, ya que la categoria de una prenda es siempre estatica
}



