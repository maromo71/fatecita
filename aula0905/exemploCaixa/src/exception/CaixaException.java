package exception;

public class CaixaException extends Exception{
    private String errCode;

    public CaixaException(String errCode){
        this.errCode = errCode;
    }

    @Override
    public String getMessage() {
        String mensagem = "Erro: ";
        switch (errCode){
            case "RF01EX01":
                mensagem += " sem saldo para o saque";
                break;
            case "RF01EX02":
                mensagem += " depósito inválido. Deve ser positivo";
                break;
            default:
                mensagem += " desconhecido";
        }
        return mensagem;
    }
}
