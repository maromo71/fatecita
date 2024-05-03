package exception;

public class ContaException extends Exception{
    private String codigoErro;

    public ContaException(String codigoErro){
        this.codigoErro = codigoErro;
    }

    @Override
    public String getMessage() {
        String mensagem = "";
        if(codigoErro.equalsIgnoreCase("RF01EX01")){
            mensagem = "Sem saldo suficiente para o saque";
        } else if (codigoErro.equalsIgnoreCase("RF01EX02")) {
            mensagem = "Valor inválido para depósito";
        }
        return mensagem;
    }
}
