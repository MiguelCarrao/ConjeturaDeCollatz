import java.util.ArrayList;
import java.util.Collections;
/**
 * Escreva uma descrição da classe ConjeturaDeCollatz aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ConjeturaDeCollatz
{
    private final static int STOP_NUMBER = 1;
    private int num;
    private ArrayList<Integer> listaValores;
    private int maxNum = 0;
    
    public ConjeturaDeCollatz(int num){
        this.num = num;  
        listaValores = new ArrayList<Integer>();
        this.execute();
    }
    public int getNum(){
        return this.num;
    }
    public ArrayList<Integer> getListaValores(){
        return this.listaValores;
    }
    public int numIteracoes(){
        return this.listaValores.size();
    }
    public int getMaxNum(){
        return this.maxNum;
    }
    public int getMaxNum2(){
        return Collections.max(listaValores);
    }
    /*
     * TODO: rever o encapsulamento neste método!
     */
    void execute(){
        int tempNum = this.num;
         while(tempNum != this.STOP_NUMBER){
             if(tempNum%2==0){
                 tempNum = tempNum/2;
             }else{
                 tempNum = 3* tempNum +1;
             }
             if(tempNum > this.maxNum){
                 this.maxNum = tempNum;
             }
             this.listaValores.add(tempNum);
             System.out.println(this.listaValores);
            }
    }
    public void tostring(){
        System.out.println("num" + this.num + "Máximo: " + this.maxNum);
    }
}