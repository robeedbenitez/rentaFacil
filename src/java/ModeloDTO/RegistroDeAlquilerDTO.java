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
public class RegistroDeAlquilerDTO {

    private int idReserva;
    private double totalPagar;
    private String metodoDePago;

    public RegistroDeAlquilerDTO() {
    }

    public RegistroDeAlquilerDTO(int idReserva, double totalPagar, String metodoDePago) {
        this.idReserva = idReserva;
        this.totalPagar = totalPagar;
        this.metodoDePago = metodoDePago;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public String getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    @Override
    public String toString() {
        return "RegistroDeAlquiler{" + "idReserva=" + idReserva + ", totalPagar=" + totalPagar + ", metodoDePago=" + metodoDePago + '}';
    }

}
