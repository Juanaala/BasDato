/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasDato;

/**
 *
 * @author Wall-E
 */
abstract interface ElimTablaDAO {
    abstract String eliminaTabla(String pNombre, String pBase);
    abstract String cargaTablas(String pBase);
}