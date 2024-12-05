package ie.atu.productv3;

import java.text.NumberFormat;

public class Music {
private String Artist;
    private String Code;
    private String Description;
    private String Label;

    private Double Price;
    protected static int count = 0;

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        this.Artist = artist;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        this.Code = code;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        this.Label = label;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        this.Price = price;
    }

    @Override
    public String toString() {return Description + "by" + Artist;}

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(Price);
    }
    public static int getCount() {
        return count;
    }

}
