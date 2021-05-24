package QuintaIteracion;

import java.util.ArrayList;
import java.util.List;

public class Guardaropas {
    String criterio; // por ahora es un string porque si fuera una clase no tiene ningun comportamiento
    List<Usuario> usuariosPermitidos = new ArrayList<>();

    void agregarUsuario(Usuario usuario){
      usuariosPermitidos.add(usuario);
    }



}



class Usuario{

  private String nombre; // cada usuario se diferencia a traves de un nombre y apellido (por ahora)
  private String apellido;
  private Guardaropas guardarropasActual;

  private List<Prenda> prendasSolicitadasAAgregar = new ArrayList<>();
  private List<Prenda> prendasSolicitadasAQuitar = new ArrayList<>();



  public Usuario(String nombre, String apellido,Guardaropas guardarropas) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.guardarropasActual = guardarropas;
  }

  public void compartirGuardarropasConOtroUsuario(Usuario invitado){
    guardarropasActual.agregarUsuario(invitado);
  }

  public void aceptarModificacionDeAgregado(Prenda prenda,List<Prenda> prendasSolicitadas){
   if(!this.prendaSeEncuentraEntreModificaciones(prenda,prendasSolicitadas)){
     throw new RuntimeException("No se encuentra la prenda solicitada en la lista para realizar el tipo de modificaciones seleccionada");
   }
   //aca depende de la lista, deberia o quitarlo o agregarlo en el guardarropas
   this.actualizarPrendaSolicitadaAModificaciones(prenda, prendasSolicitadas);
  }

  private void actualizarPrendaSolicitadaAModificaciones(Prenda prenda, List<Prenda> lista){
    lista.remove(prenda);
  }

  private void rechazarModificacion(Prenda prenda){
    //no deberia hacer nada por ahora xq no hay requerimentos que especifiquen sobre ello ....
  }







  public void proponerAgregarPrendaTentativamente(Prenda prenda, Usuario usuario){
    usuario.addPrendasSolicitadasAAgregar(prenda);
  }

  public void proponerQuitarPrendaTentativamente(Prenda prenda, Usuario usuario){
    usuario.addPrendasSolicitadasAQuitar(prenda);
  }

  public void addPrendasSolicitadasAAgregar(Prenda prendaNueva){
    this.prendaAgregadaAlista(prendaNueva,prendasSolicitadasAAgregar);
  }
  public void addPrendasSolicitadasAQuitar(Prenda prendaNueva) {
    this.prendaAgregadaAlista(prendaNueva, prendasSolicitadasAQuitar);
  }


  ///METODOS DE LA CLASE, QUE NO SE DEBERIAN DE USAR POR AFUERA

  private void prendaAgregadaAlista(Prenda prenda, List<Prenda> prendasSolicitadas){
    prendasSolicitadas.add(prenda);
  }
  private boolean prendaSeEncuentraEntreModificaciones(Prenda prenda,List<Prenda> prendasSolicitadas){
    return prendasSolicitadas.contains(prenda);
  }




}