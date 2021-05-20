package CuartaIteracion;

public class Atuendo {
  Prenda superior;
  Prenda inferior;
  Prenda calzado;
  Prenda accesorio;

  public Atuendo(Prenda superior, Prenda inferior, Prenda calzado, Prenda accesorio) {

    validadorCategoria(superior,Categoria.SUPERIOR);
    validadorCategoria(inferior,Categoria.INFERIOR);
    validadorCategoria(calzado,Categoria.CALZADO);
    validadorCategoria(accesorio,Categoria.ACCESORIO);

    this.superior = superior;
    this.inferior = inferior;
    this.calzado = calzado;
    this.accesorio = accesorio;
  }
  private void validadorCategoria(Prenda prendaActual, Categoria categoriaActual){
    if(prendaActual.categoriaDePrenda() != categoriaActual) {
      throw new CategoriaException("Seleccionaste un tipo de prenda no indicada");
    }
  }
}
