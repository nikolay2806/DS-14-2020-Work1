/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.ArrayList;
import java.util.List;
import types.*;

/**
 *
 * @author Nikolay
 */

public class OperationImpl implements Operation {
    static List<Zapchasty> lstA = new ArrayList<Zapchasty>();
    static List<Brands> lstB = new ArrayList<Brands>();
    static List<Akcii> lstP = new ArrayList<Akcii>();
    static List<Postavki> lstS = new ArrayList<Postavki>();
    static List<Garantiya> lstW = new ArrayList<Garantiya>();
    static {
        lstB.add(new Brands("Lada","Марка автомобилей, производимых АО «АвтоВАЗ»"));
        lstB.add(new Brands("Reno","Французская автомобилестроительная корпорация"));
        lstB.add(new Brands("KIA","Южнокорейская автомобилестроительная компания"));
        lstP.add(new Akcii("Под Охраной","01.05.2020",25,"Установка сигнализации"));
        lstP.add(new Akcii("Зима","06.11.2020",50,"Зимняя резина в подарок"));
        lstP.add(new Akcii("Купи сейчас","06.11.2020",60,"Скидка 10%"));
        lstS.add(new Postavki("ИНКОМ-Авто","г. Ухта, ул. Печорская, д. 36, лит. Б",78216785875L,23568906));
        lstS.add(new Postavki("ОВЕН-АВТО","г. Сыктывкар, ул. Гаражная, д. 1",78212288599L,35902146));
        lstS.add(new Postavki("NEXT запчасти RENAULT","г. Сыктывкар, ул. Сысольское шоссе, д. 20", 88212577907L,39045651));
        lstS.add(new Postavki("MGM MOTORS","г. Ухта, ул. Ветлосяновская, д. 2", 88216750710L,49890650));
        lstW.add(new Garantiya("Стандарт Lada",14));
        lstW.add(new Garantiya("Люкс Reno",24));
        lstW.add(new Garantiya("Бизнес KIA",60));
    }
    
    @Override
    public List<Zapchasty> getListA (){
    return lstA;
    }
    
    @Override
    public List<Brands> getListB (){
    return lstB;  
    }
    
    @Override
    public List<Akcii> getListP (){
    return lstP;
    }
    
    @Override
    public List<Postavki> getListS (){
    return lstS;
    }
    
    @Override
    public List<Garantiya> getListW (){
    return lstW;
    }
    
    @Override
    public List<Zapchasty> remListA (int sr){
        lstA.remove(sr);
        return lstA;
    }
    
    @Override
    public List<Brands> remListB (int sr){
        lstB.remove(sr);
        return lstB;
    }
    
    @Override
    public List<Akcii> remListP (int sr){
        lstP.remove(sr);
        return lstP;
    }
    
    @Override
    public List<Postavki> remListS (int sr){
        lstS.remove(sr);
        return lstS;
    }
    
    @Override
    public List<Garantiya> remListW (int sr){
        lstW.remove(sr);
        return lstW;
    }
    
    @Override
    public List<Zapchasty> addNewAutopart (Zapchasty item){
    lstA.add(item);
    return lstA;
    }
    
    @Override
    public List<Brands> addNewBrand (Brands item){
    lstB.add(item);
    return lstB;
    }
    
    @Override
    public List<Akcii> addNewPromotion (Akcii item){
    lstP.add(item);
    return lstP;
    }
    
    @Override
    public List<Postavki> addNewSupplier (Postavki item){
    lstS.add(item);
    return lstS;
    }
    
    @Override
    public List<Garantiya> addNewWarranty (Garantiya item){
    lstW.add(item);
    return lstW;
    }
    
    @Override
    public int getSum (){
        int sum = 0;
        for (Zapchasty autoparts: lstA)
        {
            sum += autoparts.getKol()*autoparts.getPrice();
        }
        return sum;
    }
}
