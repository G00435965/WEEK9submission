package ie.atu.productv3;

import ie.atu.productv1.Book;
import ie.atu.productv2.Software;

public class ProductDB {
    public static Product getProduct(String productCode) {
        Product myItem = null;
        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
        }
        else if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
        }
        else if (productCode.equalsIgnoreCase("Queen")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Bohemian Rhapsody");
            myMusic.setArtist("Queen");
            myMusic.setPrice(59.50);
            myMusic.setLabel("Island Records");
            myItem = myMusic
        }
        else if (productCode.equalsIgnoreCase("Kanye West")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Graduation");
            myMusic.setArtist("Kanye West");
            myMusic.setPrice(20.50);
            myMusic.setLabel("GOOD Music");
        }
        else if (productCode.equalsIgnoreCase("Travis Scott")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Goosebumps");
            myMusic.setArtist("Travis Scott");
            myMusic.setPrice(19.50);
            myMusic.setLabel("Cactus Jack Records");
        }
        else if (productCode.equalsIgnoreCase("Flat-screen")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("4k, 50 inch, Smart TV");
            myTv.setScreenSize("50 inch");
            myTv.setPrice(1200.29);
            myTv.setManufacture("Island Records");
            myItem = myTv
        }
        else if (productCode.equalsIgnoreCase("Monitor")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("4k, 22 inch, Smart Monitor");
            myTv.setScreenSize("22 inch");
            myTv.setPrice(1000.20);
            myTv.setManufacture("LG");
        }
        else if (productCode.equalsIgnoreCase("Plasma")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("120hz, 60 inch, Smart TV");
            myTv.setScreenSize("60 inch");
            myTv.setPrice(900.80);
            myTv.setManufacture("Baird");
        }


        return myItem;
    }

    }

    //  public static Book or Software getProduct(String productCode) {
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data

    //We need all the book and software objects, but what kind of object do we return?
    //}
}

