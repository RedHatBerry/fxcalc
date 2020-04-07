import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;


public class Controller {

    @FXML
    Text resultLabel;

    boolean isTypingNumber = false;
    double firstNumber = 0;
    double secondNumber = 0;
    String operation = "0";

    Model model = new Model();

    public void numberTapped(ActionEvent event){
        String value = ((Button)event.getSource()).getText();

        if(isTypingNumber){
            resultLabel.setText(resultLabel.getText() + value);
        }else {
            resultLabel.setText(value);
            isTypingNumber = true;
        }

    }

    public void calculationTapped(ActionEvent event){
        isTypingNumber = false;
        firstNumber = Double.parseDouble(resultLabel.getText());
        operation = ((Button)event.getSource()).getText();
    }

    public void equalsTapped(ActionEvent event){
        isTypingNumber = false;
        secondNumber = Double.parseDouble(resultLabel.getText());


        double result = model.calculate(firstNumber, secondNumber, operation);

        resultLabel.setText(String.valueOf(result));

    }

    public void resetTapped(ActionEvent event){
        resultLabel.setText("");
        firstNumber = 0;
        secondNumber = 0;
    }

}
