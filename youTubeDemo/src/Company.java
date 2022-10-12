public class Company extends Customer{
    public String TaxNumber;
    public int Id;
    public String CompanyName;

    public String getCompanyName() {
        return CompanyName;
    }
    public void setCompanyName() {
        this.CompanyName = CompanyName;
    }
    public String getTaxNumber() {
        return TaxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.TaxNumber = taxNumber;
    }
}
