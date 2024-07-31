package src;

public class ContaTerminal {

    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo)
    {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public ContaTerminal()
    {
        this.numero = 0;
        this.agencia = "";
        this.nomeCliente = "";
        this.saldo = 0.0d;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
