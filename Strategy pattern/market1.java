import java.util.EventObject;
public class market1 {
    double total = 0.0d;


    public class MyEventArgs extends EventObject {
        private String message;

        public MyEventArgs(Object source, String message) {
            super(source);
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
    private void btnOk_click(Object sender, MyEventArgs e){
        double totalPrices = Double.parseDouble(txtPrice.Text)
    }
}
