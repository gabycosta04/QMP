package SegundaIteracion;

import java.util.ArrayList;
import java.util.List;

public class Borrador {
    private Tipo tipoSeleccionado;
    private Material materialSeleccionado;
    private Color colorPrincipalSeleccionado;
    private Color colorSecundarioSeleccionado;
    private Trama tramaSeleccionada;

    PrendaBuilder crearPrenda(){
        return new PrendaBuilder(tipoSeleccionado,colorPrincipalSeleccionado,colorSecundarioSeleccionado,materialSeleccionado,tramaSeleccionada);

    }

    public void modificarTipoSeleccionado(Tipo tipoNuevo) {
        this.tipoSeleccionado = tipoNuevo;
    }

    public void modificarColorPrincipalSeleccionado(Color colorPrincipalNuevo) {
        this.colorPrincipalSeleccionado = colorPrincipalNuevo;
    }

    public void modificarColorSecundarioSeleccionado(Color colorSecundarioNuevo) {
        this.colorSecundarioSeleccionado = colorSecundarioNuevo;
    }

    public void modificarMaterialSeleccionado(Material materialNuevo) {
        this.materialSeleccionado = materialNuevo;
    }
    public void modificarTramaSeleccionado(Trama tramaNuevo) {
        this.tramaSeleccionada = tramaNuevo;
    }

}
