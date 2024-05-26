package lk.ijse.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class orders {

    private String O_ID;
    private String U_ID;
    private String C_ID;
    private String D_ID;
    private String P_ID;
    private int L_Points_Earned;
    private int O_Time;
    private int O_Date;
    private double Total_Amount;
    private String Status;

    // Default constructor

}
