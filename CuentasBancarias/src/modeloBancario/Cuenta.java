/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBancario;

/**
 * Esta clase abstracta establece los aatributos y métodos comunes de los tipos de cuentas
 * que hereden de ella
 * @author Daniel
 */
public abstract class Cuenta {
    
    protected int numeroDeCuenta;
    protected double saldo;
    protected Cliente titular;
    
    public Cuenta() {
        numeroDeCuenta = 0;
        saldo = 0;
        titular = null;
    }

    public Cuenta(int numeroDeCuenta, double saldo, Cliente titular) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    /**
     * Este método realiza un ingreso en la cuenta de un cliente
     * @param ingreso cantidad que se ingresa en la cuenta
     * @return mensaje con la cantidad ingresada y con el saldo actual.
     */
    public String ingresar(int ingreso) {
        saldo += ingreso;
        return "Ha ingresado " + ingreso + "€. Su saldo actual es de " + saldo + "€";
    }
    
    abstract public String retirar(int retiro);
    
    abstract public String actualizarSaldo();
    
}

