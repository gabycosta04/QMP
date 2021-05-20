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

  Atuendo devolverSugerencia(){
    validarTemperaturaEnTodasLasPrendas();
     return new Atuendo(superior,inferior,calzado,accesorio);

  }

  private void validarTemperaturaEnTodasLasPrendas(){
    temperaturaValida(superior);
    temperaturaValida(inferior);
    temperaturaValida(calzado);
    temperaturaValida(accesorio);

  }


  private void temperaturaValida(Prenda prenda){
   if(prenda.getTemperaturaAdecuada() <=(int) this.condicionesClimaticas().get(0).get("WeatherIcon")){
     throw new RuntimeException("No es valida la temperatura de la prenda");
   }
   //aca deberia devolverme la temperatura pero nose como usar la API
 }


  private List<Map<String, Object>> condicionesClimaticas(){
     AccuWeatherAPI apiClimatica = new AccuWeatherAPI();
     return apiClimatica.getWeather("Buenos Aires, Argentina");
  }


}
