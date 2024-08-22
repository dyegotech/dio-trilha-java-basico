public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void Ligar(){
        ligada = true;
    }
    
    public void Desligar(){
        ligada = false;
    }

    public void MudarCanal(int c){
        canal = c;
    }

    public void AumentarVolume(){
        volume++;
    }
    
    public void DiminuirVolume(){
        volume--;
    }

    public void SubirCanal(){
        canal++;
    }
    
    public void DescerCanal(){
        canal--;
    }
}
