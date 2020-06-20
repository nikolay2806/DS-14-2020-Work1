/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.List;
import types.Tovar;

/**
 *
 * @author Nikolay
 */
public interface TovarOperation {
    
    List<Tovar> getListOfTovar ();
    List<Tovar> addNewTovar (Tovar item);
    int getSumOfTovar ();
}
