package SegundaIteracion;

import SegundaIteracion.CategoriaException;
import SegundaIteracion.ColorException;
import SegundaIteracion.MaterialException;
import SegundaIteracion.TipoException;


public class PrendaBuilder{
    private Tipo tipoSeleccionado;
    private Material materialSeleccionado;
    private Color colorPrincipalSeleccionado;
    private Color colorSecundarioSeleccionado;
    private Trama tramaSeleccionada;


    PrendaBuilder(Tipo tipoSolicitado,Color colorPrincipalSolicitado,Color colorSecundarioSolicitado,Material materialSolicitado, Trama tramaSolicitada){
        //como requerimento primero lo que cargamos es el tipo de prenda solicitado:
        if (tipoSolicitado == null) {
            throw new TipoException("Debes seleccionar un tipo de atuendo a utilizar");
        }
        this.tipoSeleccionado = tipoSolicitado;


        if (colorPrincipalSolicitado == null) {
            throw new ColorException("Debes seleccionar un color de prenda");
        }
        this.colorPrincipalSeleccionado = colorPrincipalSolicitado;
        //puede ser null el color secundario, no deberia generar ninguna excepcion
        this.colorSecundarioSeleccionado = colorSecundarioSolicitado;

        if (materialSolicitado == null) {
            throw new MaterialException("Debes seleccionar un tipo de material para la prenda");
        }
        this.materialSeleccionado = materialSolicitado;

        //trama
        if (tramaSolicitada == null) {
            tramaSolicitada = Trama.LISA;
        }

    }

    Categoria categoriaDePrenda(){
    return tipoSeleccionado.getCategoria();
    }


    void indicarColorSecundario(Color colorAagregar){
        this.colorSecundarioSeleccionado = colorAagregar;
    }
}











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
    PANUELO(Categoria.ACCESORIO),
    ZAPATILLAS(Categoria.CALZADO);

    private Categoria categoria;

    Tipo(Categoria categoriaCorrecta){
        if(categoriaCorrecta == null){
            throw new CategoriaException("Debe seleccionar una categoria indicada para el nuevo tipo de prenda");
        }
        this.categoria = categoriaCorrecta;
    }
    Categoria getCategoria(){
        return categoria;
    }
}


enum Trama{
    LISA,RAYADA,LUNARES,CUADROS,ESTAMPADO
}


