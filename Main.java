import repo.ARepo;
import repo.BRepo;
import service.Aservice;
import service.Bservice;

public class Main {
 
    

    public static void main(String[] args) {


        Aservice aservice = new Aservice();
       System.out.println(aservice.showA1("A1"));

       
       Bservice bservice = new Bservice();
        System.out.println(bservice.AllBfolder("A3"));
    //    BRepo bRepo = new BRepo();
    //    System.out.println(bRepo.storageB());
    //    System.out.println(bRepo.toString());
       System.out.println(bservice.addB("B3"));

       
      
       
    }
}
