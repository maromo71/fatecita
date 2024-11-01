package utils;

public class CaixaException extends Exception {
    private String errNumber;

    public CaixaException(String errNumber) {
        this.errNumber = errNumber;
    }

    @Override
    public String getMessage() {
        if (errNumber.equalsIgnoreCase("RF01EX01")){
            return "Sem saldo suficiente para o saque";
        }
        if (errNumber.equalsIgnoreCase("RF01EX02")){
            return "Valor do depósito deve ser positivo";
        }
        return "Erro inexperado";
    }
}
