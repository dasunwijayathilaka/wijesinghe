package lk.ijse.model.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReturnTM {
    private String ReturnID;
    private String OrderID;
    private String ReturnReason;
    private String ReturnStatus;
    private boolean ExchangeRequest;
    private Date ReturnDate;
    private double Refoundamount;










}
