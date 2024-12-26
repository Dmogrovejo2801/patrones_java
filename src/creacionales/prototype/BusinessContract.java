package creacionales.prototype;

public class BusinessContract extends Contract {
    private String businessName;

    public BusinessContract(String title, String content, String businessName) {
        super(title, content);
        this.businessName = businessName;
    }

    // Constructor de clonación
    public BusinessContract(BusinessContract prototype) {
        super(prototype);
        this.businessName = prototype.businessName;
    }

    // Implementación del método clone
    @Override
    public BusinessContract clone() {
        return new BusinessContract(this);
    }

    // Getter y setter
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    @Override
    public String toString() {
        return "BusinessContract{" +
                "title='" + getTitle() + '\'' +
                ", content='" + getContent() + '\'' +
                ", businessName='" + businessName + '\'' +
                '}';
    }
}