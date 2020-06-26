package Topic2.Assignment4;

public class TestAssignment4 {
	public static void main(String[] args) 
	{
	CreditCardPayment x = new CreditCardPayment(2.12, "George bush","11/27", "************1234");

			CashPayment p = new CashPayment(20.03);

	CreditCardPayment y = new CreditCardPayment(11.22, "Trump Henry","22/11","987654321");

			CashPayment q = new CashPayment(55.12);
			
			x.paymentDetails();
			p.paymentDetails();
			y.paymentDetails();
			q.paymentDetails();
		}
}

