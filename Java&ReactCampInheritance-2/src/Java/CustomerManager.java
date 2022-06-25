package Java;

public class CustomerManager {
    public void add(Logger log){
        //musteri ekleme kodları

         // if you have got 1000 line code everywhere is database or want file log
         // you use new with anatoher class this code not sustainable !!!!!
         // System.out.println("musteri eklendi");
         // DatabaseLogger logger = new DatabaseLogger();
         // logger.log();

         //-------------------------------------------------------------------------------------------------------
        System.out.println("musteri eklendi");
        log.log();
    }
}
