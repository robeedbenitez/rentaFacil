/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDTO;

/**
 *
 * @author
 */
public class ReservaDTO {

    private int idReserva;
    private int fechaDeRenta;
    private int fechaDeRetorno;
    private PersonaDTO persona;
    private VehiculoDTO vehiculo;

    public ReservaDTO() {
    }

    public ReservaDTO(int idReserva, int fechaDeRenta, int fechaDeRetorno, PersonaDTO cliente, VehiculoDTO vehiculo) {
        this.idReserva = idReserva;
        this.fechaDeRenta = fechaDeRenta;
        this.fechaDeRetorno = fechaDeRetorno;
        this.persona = cliente;
        this.vehiculo = vehiculo;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getFechaDeRenta() {
        return fechaDeRenta;
    }

    public void setFechaDeRenta(int fechaDeRenta) {
        this.fechaDeRenta = fechaDeRenta;
    }

    public int getFechaDeRetorno() {
        return fechaDeRetorno;
    }

    public void setFechaDeRetorno(int fechaDeRetorno) {
        this.fechaDeRetorno = fechaDeRetorno;
    }

    public PersonaDTO getPersona() {
        return persona;
    }

    public void setPersona(PersonaDTO persona) {
        this.persona = persona;
    }

    public VehiculoDTO getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoDTO vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", fechaDeRenta=" + fechaDeRenta + ", fechaDeRetorno=" + fechaDeRetorno + ", cliente=" + persona + ", vehiculo=" + vehiculo + '}';
    }

}
