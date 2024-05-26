package lk.ijse.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Data
public class Item {

    private String I_ID;
    private String I_Name;
    private String Brands;
    private int Qty;
    private String Description;
    private double Weight;
    private String St_ID;
    private double Unit_price;

}
