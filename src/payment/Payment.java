package payment;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Joseph Assayag
 * @version 1.0 16/11/2018 13:39
 */
public class Payment {
    private PaymentState response;
    private LocalDateTime time;
    private String detail;
    private Money bedrag;


    public enum PaymentState {PAYED, DUE}
}
