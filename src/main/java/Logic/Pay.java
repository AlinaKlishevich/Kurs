package Logic;


public class Pay extends Violations{

    private String idpay;
    private String paymentcard;
    private String expirationdate;
    private String cvv;
    private String sum;

    public Pay() {
    }

    public Pay(String idpay, String paymentcard, String expirationdate, String cvv, String sum) {
        this.idpay = idpay;
        this.paymentcard = paymentcard;
        this.expirationdate = expirationdate;
        this.cvv = cvv;
        this.sum = sum;
    }

    public Pay(String idviolations,  Integer fine, String idpay, String paymentcard, String expirationdate, String cvv, String sum) {
        super(idviolations, fine);
        this.idpay = idpay;
        this.paymentcard = paymentcard;
        this.expirationdate = expirationdate;
        this.cvv = cvv;
        this.sum = sum;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }



    public String getIdpay() {
        return idpay;
    }

    public void setIdpay(String idpay) {
        this.idpay = idpay;
    }

    public String getPaymentcard() {
        return paymentcard;
    }

    public void setPaymentcard(String paymentcard) {
        this.paymentcard = paymentcard;
    }

    public String getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(String expirationdate) {
        this.expirationdate = expirationdate;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }
}
