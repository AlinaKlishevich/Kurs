package Logic;

public class Violations  {
    private String idviolations;
    private String numberauto;
    private String article;
    private int fine;
    private String violationdate;
private String idpayment;


    public Violations() {
    }

    public Violations(String idviolations,Integer fine) {
        this.idviolations = idviolations;
        this.fine = fine;
    }

    public Violations(String idviolations, String numberauto, String article, Integer fine, String violationdate,String idpayment) {
        this.idviolations = idviolations;
        this.numberauto = numberauto;
        this.article = article;
        this.fine = fine;
        this.violationdate = violationdate;
        this.idpayment=idpayment;
    }

    public String getIdpayment() {
        return idpayment;
    }

    public void setIdpayment(String idpayment) {
        this.idpayment = idpayment;
    }

    public String getIdviolations() {
        return idviolations;
    }

    public void setIdviolations(String idviolations) {
        this.idviolations = idviolations;
    }

    public String getNumberauto() {
        return numberauto;
    }

    public void setNumberauto(String numberauto) {
        this.numberauto = numberauto;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Integer getFine() {

        return fine*35;
    }

    public void setFine(Integer fine) {
        this.fine = fine;
    }

    public String getViolationdate() {
        return violationdate;
    }

    public void setViolationdate(String violationdate) {
        this.violationdate = violationdate;
    }
}

