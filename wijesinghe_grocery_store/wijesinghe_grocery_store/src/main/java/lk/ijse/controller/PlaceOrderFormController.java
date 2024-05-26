package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PlaceOrderFormController {

    @FXML
    private JFXButton btnAddToCart;

    @FXML
    private JFXButton btnNEW;

    @FXML
    private JFXButton btnPlaceOrder;

    @FXML
    private JFXButton btngetnettotal;

    @FXML
    private JFXComboBox<?> cmbCustomerId;

    @FXML
    private JFXComboBox<?> cmbDiscountCode;

    @FXML
    private JFXComboBox<?> cmbItemCode;

    @FXML
    private TableColumn<?, ?> colAction;

    @FXML
    private TableColumn<?, ?> colDescription;

    @FXML
    private TableColumn<?, ?> colItemCode;

    @FXML
    private TableColumn<?, ?> colQty;

    @FXML
    private TableColumn<?, ?> colTotal;

    @FXML
    private TableColumn<?, ?> colUnitPrice;

    @FXML
    private TableView<?> tblOrderCart;

    @FXML
    private Label txtCustomerName;

    @FXML
    private Label txtDescription;

    @FXML
    private Label txtDiscountPrice;

    @FXML
    private Label txtDiscountPrice1;

    @FXML
    private Label txtNetTotal;

    @FXML
    private Label txtOrderId;

    @FXML
    private Label txtOrderdate;

    @FXML
    private Label txtPaymentAmount;

    @FXML
    private Label txtPaymentId;

    @FXML
    private Label txtPaymentType;

    @FXML
    private TextField txtQty;

    @FXML
    private Label txtQtyOnHand;

    @FXML
    private Label txtSubTotal;

    @FXML
    private Label txtUnitPrice;

    @FXML
    private Label txtUserId;

    @FXML
    private Label txtUserName;

    @FXML
    void btnAddToCartOnAction(ActionEvent event) {

    }

    @FXML
    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        // Load the dashboard form
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/Dashbord_Form.fxml"));
        Scene scene = new Scene(rootNode);

        // Get the current stage from an existing scene node (using the action event source)
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        // Set the new scene on the existing stage
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Dashboard Form");
        stage.show(); // Ensure the stage is shown
    }

    @FXML
    void btnNewCustomerOnAction(ActionEvent event) {

    }

    @FXML
    void btnPlaceOrderOnAction(ActionEvent event) {

    }

    @FXML
    void cmbCustomerOnAction(ActionEvent event) {

    }

    @FXML
    void cmbDiscountOnAction(ActionEvent event) {

    }

    @FXML
    void cmbItemOnAction(ActionEvent event) {

    }

    @FXML
    void txtQtyOnAction(ActionEvent event) {

    }

    public void btnClearOnAction(ActionEvent actionEvent) {
    }

    public void btnSaveOnAction(ActionEvent actionEvent) {
    }

    public void GetNetTotalonAction(ActionEvent actionEvent) {
    }

    public void PlaceOrderonAction(ActionEvent actionEvent) {

    }

    public void itemCodeOnAction(ActionEvent actionEvent) {
    }

    public void CustomerIdOnAction(ActionEvent actionEvent) {
    }

    public void btnAddtocartOnAction(ActionEvent actionEvent) {
    }

    public void btnplaceOrderOnAction(ActionEvent actionEvent) {
    }

    public void txtQTYOnAction(ActionEvent actionEvent) {
    }

    public void discountcodeOnAction(ActionEvent actionEvent) {
    }

    public void PrintBillOnAction(ActionEvent actionEvent) {
    }
}
