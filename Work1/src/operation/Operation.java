/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.List;
import types.*;

/**
 *
 * @author Nikolay
 */
public interface Operation {
    List<Zapchasty> getListA ();
    List<Brands> getListB ();
    List<Akcii> getListP ();
    List<Postavki> getListS ();
    List<Garantiya> getListW ();
    
    List<Zapchasty> remListA (int sr);
    List<Brands> remListB (int sr);
    List<Akcii> remListP (int sr);
    List<Postavki> remListS (int sr);
    List<Garantiya> remListW (int sr);
    
    List<Zapchasty> addNewAutopart (Zapchasty item);
    List<Brands> addNewBrand (Brands item);
    List<Akcii> addNewPromotion (Akcii item);
    List<Postavki> addNewSupplier (Postavki item);
    List<Garantiya> addNewWarranty (Garantiya item);
    
    int getSum ();
}
