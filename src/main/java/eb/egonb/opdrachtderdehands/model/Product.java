package eb.egonb.opdrachtderdehands.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Gelieve de naam van het product mee te geven!")
    private String productnaam;
    @NotBlank(message = "Er moet een omschrijving bij het product!")
    private String omschrijving;
    @Size(min=4, max=20, message = "Username moet tussen 4 en 20 karakters zijn!")
    private String usernameCP;
    @NotBlank(message = "Dit veld moet ingevuld zijn")
    private String emailCP;
    @DecimalMin("0.50")
    @NotNull(message = "Prijs is verplicht!")
    private BigDecimal vraagPrijs;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductnaam() {
        return productnaam;
    }

    public void setProductnaam(String naam) {
        this.productnaam = naam;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public String getUsernameCP() {
        return usernameCP;
    }

    public void setUsernameCP(String usernameCP) {
        this.usernameCP = usernameCP;
    }

    public String getEmailCP() {
        return emailCP;
    }

    public void setEmailCP(String email) {
        this.emailCP = email;
    }

    public BigDecimal getVraagPrijs() {
        return vraagPrijs;
    }

    public void setVraagPrijs(BigDecimal vraagPrijs) {
        this.vraagPrijs = vraagPrijs;
    }
}
