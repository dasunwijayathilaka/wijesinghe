package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PlaceOrderFormController {

    @FXML
    private JFXButton btnAddtocart1;

    @FXML
    private JFXButton btnnewos;

    @FXML
    private JFXButton btnplaceOrder;

    @FXML
    private JFXComboBox<?> cmbCustomerId;

    @FXML
    private JFXComboBox<?> cmbdiscountcode;

    @FXML
    private JFXComboBox<?> cmbitemCode;

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
    private Label labelDescription;

    @FXML
    private Label labelDiscountPrice;

    @FXML
    private Label labelNetTotal;

    @FXML
    private Label labelOrderId;

    @FXML
    private Label labelOrderdate;

    @FXML
    private Label labelPaymentAmount;

    @FXML
    private Label labelPaymentId;

    @FXML
    private Label labelPaymentType;

    @FXML
    private Label labelQtyOnHand;

    @FXML
    private Label labelSubTotal;

    @FXML
    private Label labelUnitPrice;

    @FXML
    private Label labelUserId;

    @FXML
    private Label labelUserName;

    @FXML
    private Label lableCustomerName;

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
    void itemCodeOnAction(ActionEvent event) {

    }

    @FXML
    void txtQTYOnAction(ActionEvent event) {

    }

}
