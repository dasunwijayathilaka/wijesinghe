package lk.ijse.model.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemTM {
    private String Itemcode;
    private String name;
    private String description;
    private int QtyONHand;
    private String Brand;
    private double Weight;
    private String StoreID;
    private double Unitprice;



    }




