package payment;

/**
 * @author Joseph Assayag
 * @version 1.0 18/11/2018 13:13
 */
public class DirectPayment extends Payment {
    private String id;
    private PaymentType paymentType;


    public enum PaymentType {DEBET, CREDIT}
}
