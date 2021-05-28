/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBancario;

/**
 * Esta subclase hereda de la clase Cuenta y gestiona la creación de una cuenta corriente
 * @author Daniel
 */
public class CuentaCorriente extends Cuenta{
    
    protected final double interesFijo = 0.15;

    public CuentaCorriente(int numeroDeCuenta, double saldo, Cliente titular) {
        super(numeroDeCuenta, saldo, titular);
    }
    
    public double getInteresFijo() {
        return interesFijo;
    }
    
    /**
     * Este método realiza un retiro de la cuenta de un cliente si hay cantidad suficiente
     * @param retiro cantidad que se retira de la cuenta
     * @return mensaje con la cantidad retirada y el saldo actual o mensaje de que no se dispone de suficiente saldo
     */
    @Override
    public String retirar(int retiro) {
        if (retiro <= saldo) {
            saldo -= retiro;
            return "Ha retirado " + retiro + " €. Su saldo actual es de " + saldo + " €.";
        } else {
            return "No dispone de saldo suficiente.";
        }
    }
    
    /**
     * Este método aplica el interés de la cuenta
     * @return mensaje con el saldo tras aplicar los intereses
     */
    @Override
    public String actualizarSaldo() {
        saldo += saldo * interesFijo;
        return "Actualizados los intereses. Su saldo es de: " + saldo + " €.";
    }
    
}
