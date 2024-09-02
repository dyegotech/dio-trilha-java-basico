public class CepInvalidoException extends Exception {
    
    public CepInvalidoException() {
        super();
    } 
    
    public CepInvalidoException(String msg) {
        super("O cep \"" + msg + "\" está fora dos padrões");
    } 
}
