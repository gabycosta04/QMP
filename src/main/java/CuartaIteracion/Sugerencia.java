package CuartaIteracion;

import java.util.List;
import java.util.Map;

public class Sugerencia {

  Prenda superior;
  Prenda inferior;
  Prenda calzado;
  Prenda accesorio;

  // AUNQUE ESTO A FUTURO PODRIA CAMBIAR, YA QUE PODRIA HABER SUGERENCIAS DE MAS PRENDAS.
  // la validez de la sugerencia se realiza en el atuendo que verifica que haya un en las prendas una categoria por prenda
  void elegirPrendaSuperior(Prenda prendaAelegir){
     this.superior = prendaAelegir;
   }
  void elegirPrendaInferior(Prenda prendaAelegir){
    this.inferior = prendaAelegir;
  }
  void elegirPrendaCalzado(Prenda prendaAelegir){
    this.calzado = prendaAelegir;
  }
  void elegirPrendaAccesorio(Prenda prendaAelegir){
    this.accesorio = prendaAelegir;
  }




  //faltaria implementar la logica de realizar una sugerencia pero eso es parte del QMP3 y por ahora no lo vamos a aplicar


  Atuendo devolverSugerencia(){
     return new Atuendo(superior,inferior,calzado,accesorio);
  }

}
