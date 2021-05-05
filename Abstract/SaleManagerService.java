package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface SaleManagerService {
	void Buy(Customer customer,Game game,Campaign campaign);
}
