/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Timeline;

/**
 *
 * @author sitian.chen
 */
public class ComputerComponent extends Component{
    public int releaseYear;
    public double price;
    public double modelNumber;
    public String modelName;
    public String manuufacturer;
    public double othercurrency;
    public double exchangerate;
    
    public String getmodelName(){
        return modelName;
    }//close method
    
    public void otherCurrencyprice(double exrate){
        exchangerate = exrate;
        othercurrency = price * exchangerate;
    }//close method
    
    public double getOtherCurrencyprice(){
        return othercurrency;
    }//close method
}//close class
