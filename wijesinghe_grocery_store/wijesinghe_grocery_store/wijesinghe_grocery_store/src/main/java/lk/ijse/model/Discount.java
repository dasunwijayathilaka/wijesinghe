package lk.ijse.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Discount {

    private String D_ID;
    private String D_Name;
    private double D_Amount;
    private String V_Period;
    private String Grocery_Categories;
    private int D_Start_Date;
    private int D_End_Date;

}
