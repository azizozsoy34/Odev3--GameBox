package GameBox;

import java.sql.Date;

import Abstract.CampaignService;
import Concrete.CampaignManager;
import Concrete.CustomerCheckManager;
import Concrete.CustomerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();//fake 
		customer1.setId(0); 
		customer1.setNationalityId("0123456789");
		customer1.setFirstName("Aziz");
		customer1.setLastName("Baskan");
		customer1.setDateOfBirth(new Date(1980,8,23));
		
		CustomerManager customerManager = new CustomerManager(new CustomerCheckManager());
		customerManager.add(customer1);
		    
		CampaignManager campaignManager=new CampaignManager();
		    
		Game game1=new Game();
		game1.setId(0);
		game1.setName("PUBG");
		game1.setUnitPrice(100);
		
		Campaign campaign = new Campaign(1,"camp1", 10);
		SaleManager saleManager = new SaleManager();
		saleManager.Buy(customer1, game1, campaign);

	}

}
