package behavioralPatterns.state;

import lombok.Data;

@Data
public class Auto implements IEstadoAuto {
  
  private IEstadoAuto autoEncendio;
  private IEstadoAuto autoMovimiento;
  private IEstadoAuto autoApagado;
  
  IEstadoAuto estadoActual;
  
  public Auto() {
    this.autoEncendio = new AutoEncender(this);
    this.autoApagado = new AutoApagar(this);
    this.autoMovimiento = new AutoManejar(this);
    
    this.estadoActual = this.autoApagado;
  }
  
  public void encender() {
    this.estadoActual.encender();
  }
  
  public void manejar() {
    this.estadoActual.manejar();
  }
  
  public void apagar() {
    this.estadoActual.apagar();
  }
  
}
