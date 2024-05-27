package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class OdFormController {

    @FXML
    private JFXButton btnAddtocart1;

    @FXML
    private JFXButton btnNEW;

    @FXML
    private JFXButton btnplaceOrder;

    @FXML
    private JFXComboBox<?> cmbCustomerId1;

    @FXML
    private JFXComboBox<?> cmbdiscountcode;

    @FXML
    private TableColumn<?, ?> colDescription;

    @FXML
    private TableColumn<?, ?> colItemCode;

    @FXML
    private TableColumn<?, ?> colQty;

    @FXML
    private TableColumn<?, ?> colUnitPrice;

    @FXML
    private TableColumn<?, ?> colaction;

    @FXML
    private TableColumn<?, ?> colitemName;

    @FXML
    private Label labelCustomerName;

    @FXML
    private Label labelDescription;

    @FXML
    private Label labelDiscountprice;

    @FXML
    private Label labelOrderId;

    @FXML
    private Label labelOrderdate;

    @FXML
    private Label labelPaymenamount;

    @FXML
    private Label labelUnitprice;

    @FXML
    private Label labelUsername;

    @FXML
    private Label labelnettotal;

    @FXML
    private Label labelpaymentId;

    @FXML
    private Label labelqty;

    @FXML
    private Label labelsubtotal;

    @FXML
    private Label labeluserId;

    @FXML
    private TableView<?> tblOrderCart;

    @FXML
    private JFXTextField txtQTY;

    @FXML
    void CustomerIdOnAction(ActionEvent event) {

    }

    @FXML
    void PrintBillOnAction(ActionEvent event) {

    }

    @FXML
    void btnAddtocartOnAction(ActionEvent event) {

    }

    @FXML
    void btnBackOnAction(ActionEvent event) {

    }

    @FXML
    void btnNewCustomerOnAction(ActionEvent event) {

    }

    @FXML
    void btnplaceOrderOnAction(ActionEvent event) {

    }

    @FXML
    void discountcodeOnAction(ActionEvent event) {

    }

    @FXML
    void txtQTYOnAction(ActionEvent event) {

    }

}
