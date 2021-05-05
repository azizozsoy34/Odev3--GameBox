package Concrete;

import Abstract.SaleManagerService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SaleManager implements SaleManagerService{

	@Override
	public void Buy(Customer customer, Game game, Campaign campaign) {
		
		System.out.println(customer.getFirstName() + " - " + campaign.getName() + " uygulandý");
		
	}

}
