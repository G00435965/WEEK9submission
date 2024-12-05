package ie.atu.productv3;

import java.text.NumberFormat;
public class Tv {
        private String Code;
        private String Description;
        private String ScreenSize;
         private String Manufacture;
        private Double Price;
    protected static int count = 0;

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
        this.Description = description;
    }

    public String getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(String screenSize) {
        this.ScreenSize = screenSize;
    }

    public String getManufacture() {
        return Manufacture;
    }

    public void setManufacture(String manufacture) {
        this.Manufacture = manufacture;
    }

    public Double getPrice() {
        return this.Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return Description + "by" + Manufacture;

    }
    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(Price);
    }
    public static int getCount() {
        return count;
    }
}
