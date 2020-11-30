package com.kodilla.good.patterns.rental;

public class RentalProcessor {

    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository rentalRepository;

    public RentalProcessor(final InformationService informationService, final RentalRepository rentalRepository) {
        this.informationService = informationService;

        this.rentalRepository = rentalRepository;
    }

    public RentalDto process(final RentRequest rentRequest) {
        boolean isRented = RentalService.rent(rentRequest.getUser(), rentRequest.getRentFrom(), rentRequest.getRentTo());
        if(isRented) {
            InformationService.inform();
            RentalRepository.rented(rentRequest.getUser(), rentRequest.getRentFrom(), rentRequest.getRentTo());
            return new RentalDto(rentRequest.getUser(), true);
        }
        else {
            return new RentalDto(rentRequest.getUser(), false);
        }
    }
}
