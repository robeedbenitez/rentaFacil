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
public class CategoriaDTO {

    private int idCategoria;
    private String claseAutomovil;
    private int cantAutmoviles;

    public CategoriaDTO() {
    }

    public CategoriaDTO(int idCategoria, String claseAutomovil) {
        this.idCategoria = idCategoria;
        this.claseAutomovil = claseAutomovil;
    }

    public CategoriaDTO(int idCategoria, String claseAutomovil, int cantAutmoviles) {
        this.idCategoria = idCategoria;
        this.claseAutomovil = claseAutomovil;
        this.cantAutmoviles = cantAutmoviles;
    }
    
    

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getClaseAutomovil() {
        return claseAutomovil;
    }

    public void setClaseAutomovil(String claseAutomovil) {
        this.claseAutomovil = claseAutomovil;
    }

    public int getCantAutmoviles() {
        return cantAutmoviles;
    }

    public void setCantAutmoviles(int cantAutmoviles) {
        this.cantAutmoviles = cantAutmoviles;
    }

    @Override
    public String toString() {
        return "CategoriaDTO{" + "idCategoria=" + idCategoria + ", claseAutomovil=" + claseAutomovil + ", cantAutmoviles=" + cantAutmoviles + '}';
    }
}
