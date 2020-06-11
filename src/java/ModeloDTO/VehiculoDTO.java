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
public class VehiculoDTO {

    private int id;
    private String matricula;
    private String marca;
    private String modelo;
    private String descripcion;
    private String color;
    private String img;
    private double tarifa;
    private int disponible;
    private CategoriaDTO categoria;


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public VehiculoDTO() {
    }

    public VehiculoDTO(int id, String matricula, String marca, String modelo, String descripcion, String color, String img, double tarifa, int disponible, CategoriaDTO categoria) {
        this.id = id;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.color = color;
        this.img = img;
        this.tarifa = tarifa;
        this.disponible = disponible;
        this.categoria = categoria;
    }

    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    public CategoriaDTO getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDTO categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "-INFORMACION DEL VEHICULO: " + "Matricula: " + matricula + ", Marca: "
                + marca + ", Color: " + color + ", Tarifa: "
                + tarifa + ", Disponibilidad: "
                + getDisponible();
    }
}
