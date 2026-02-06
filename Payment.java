abstract class Payments {
    abstract void pay(int amount);
}
abstract class type extends Payments {

    void CreditCardPayment(){
      System.out.println("payment type: CreditCardPayment");
    }
    void UpiPaymnet(){
        System.out.println("Payment type : UpiPayment");
    }
}
public void main(String[] args){
    type t = new type() {
        @Override
        void pay(int amount) {
            
        }
    };
    t.pay(30);
    t.CreditCardPayment();
    t.UpiPaymnet();
}
