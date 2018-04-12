package compParts;

public class PC {

    //instance variables
    private Motherboard mthrBord2650;
    private Monitor dellInspiron5225;
    private Case alienWareCaseUFO;

    //constructor
    public PC (Motherboard mthrBord2650, Monitor dellInspiron5225, Case alienWareCaseUFO){
        this.mthrBord2650 = mthrBord2650;
        this.dellInspiron5225 = dellInspiron5225;
        this.alienWareCaseUFO = alienWareCaseUFO;
    }

    //method
    public void drawLogo(){
        this.showLogo();
    }
    public void powerUp(){
        this.pressPowerButton();
        this.drawLogo();
    }



    //getters
    public Motherboard getMthrBord2650() {
        return mthrBord2650;
    }

    public Monitor getDellInspiron5225() {
        return dellInspiron5225;
    }

    public Case getAlienWareCaseUFO() {
        return alienWareCaseUFO;
    }


    @Override
    public String toString() {
        return "PC{" +
                "mthrBord2650=" + mthrBord2650 +
                ", dellInspiron5225=" + dellInspiron5225 +
                ", alienWareCaseUFO=" + alienWareCaseUFO +
                '}';
    }
}
