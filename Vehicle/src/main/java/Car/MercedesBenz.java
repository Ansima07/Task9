package Car;
import exchangerate.rates;
public class MercedesBenz {
    String MercedesBenzBrand;
    int MercedesBenzId;
    double MercedesBenzPrice;
    String ClearanceDay;

    public MercedesBenz(String MercedesBenzBrand, int MercedesBenzId, double MercedesBenzPrice, String ClearanceDay) {
        this.MercedesBenzBrand = MercedesBenzBrand;
        this.MercedesBenzId = MercedesBenzId;
        this.MercedesBenzPrice = MercedesBenzPrice;
        this.ClearanceDay = ClearanceDay;
    }

    public double GetMercedesBenzCost(int NumberOfCar) {
        double cost = MercedesBenzPrice * NumberOfCar;
        return cost;
    }

    public <GetMercedesBenzCost> double ExchangeRates(String from, String to, int NumberOfCar) {
        double ActualRates = rates.displayRates(from, to);
        double cost = GetMercedesBenzCost(NumberOfCar);
        double ActualCost;
        ActualCost = cost;
        return ActualRates * ActualCost;
    }
}


