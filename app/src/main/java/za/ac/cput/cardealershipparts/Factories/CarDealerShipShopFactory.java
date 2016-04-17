package za.ac.cput.cardealershipparts.Factories;

import za.ac.cput.cardealershipparts.Domain.CarDealerShipShop;
import za.ac.cput.cardealershipparts.Domain.Cars;

/**
 * Created by Mnisi Sibusiso 211183164 on 4/17/2016.
 */
public class CarDealerShipShopFactory {

    public static CarDealerShipShop createCar(Long id, String dealerShopName, String location, String carAvailable)
    {
        CarDealerShipShop car = new CarDealerShipShop
                .Builder(dealerShopName)
                .location(location)
                .carAvailable(carAvailable)
                .id(id)
                .build();
        return car;
    }
}
