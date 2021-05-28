/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBancario;

/**
 *Esta subclase hereda de la clase Cuenta y gestiona la creación de una cuenta ahorro
 * @author Daniel
 */
public class CuentaAhorro extends Cuenta{
    
    protected double interesVariable;
    protected double saldoMinimo;

    public CuentaAhorro(double interesVariable, double saldoMinimo, int numeroDeCuenta, double saldo, Cliente titular) {
        super(numeroDeCuenta, saldo, titular);
        this.interesVariable = interesVariable;
        this.saldoMinimo = saldoMinimo;
    }

    public void setInteresVariable(double interesVariable) {
        this.interesVariable = interesVariable;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public double getInteresVariable() {
        return interesVariable;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }
    
    
    /**
     * Este método realiza un retiro de la cuenta de un cliente si no se excede el saldo mínimo
     * @param retiro cantidad que se retira de la cuenta
     * @return mensaje con la cantidad retirada y el saldo actual o mensaje de que no se dispone de suficiente saldo
     */
    @Override
    public String retirar(int retiro) {
        
        if (saldo - retiro >= saldoMinimo) {
            saldo -= retiro;
            return "Ha retirado " + retiro + " €. Su saldo actual es de " + saldo + " €.";
        } else {
            return "No dispone de saldo suficiente";
        }
    }
    
    /**
     * Este método aplica el interés de la cuenta
     * @return mensaje con el saldo tras aplicar los intereses
     */
    @Override
    public String actualizarSaldo(){
        saldo += saldo * interesVariable;
        return "Actualizados los intereses. Su saldo es de: " + saldo + " €.";
    }
    
}