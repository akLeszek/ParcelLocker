import java.util.ArrayList;
import java.util.Iterator;

public class ParcelLocker {
    private ArrayList<Parcel> parcels = new ArrayList<>();
    private int lockerCapacity = 15;

    public void addPackage(Parcel parcel){
        if (lockerCapacity != 0){
            parcels.add(parcel);
            lockerCapacity--;
        }else {
            throw new IllegalArgumentException("Paczkomat jest pełny.");
        }
    }

    public void listPackages(){
        for (Parcel p : parcels){
            System.out.println(p.getCode());
        }
    }

    public void removeAllPackages(){
        for (Iterator<Parcel> parcelIterator = parcels.iterator();parcelIterator.hasNext();){
            if (parcelIterator.next() != null){
                parcelIterator.remove();
            }
        }
    }

    public void removePackage(String code){
        boolean parcelExsist = false;
        for (Iterator<Parcel> parcelIterator = parcels.iterator();parcelIterator.hasNext();){
            if (parcelIterator.next().getCode().matches(code)){
                parcelExsist = true;
                parcelIterator.remove();
            }
        }
        if (!parcelExsist){
            throw new IllegalArgumentException("Error: Brak szukanej paczki");
        }
    }

    public void numberOfParcel(){
        int count = 0;
        for (Iterator<Parcel> parcelIterator = parcels.iterator(); parcelIterator.hasNext();){
            if (parcelIterator.next() != null) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        ParcelLocker parcelLocker = new ParcelLocker();
        try {
            parcelLocker.addPackage(new PackageA("POL-11111",1500));
            parcelLocker.addPackage(new PackageB("POL-22222",1500));
            parcelLocker.addPackage(new PackageA("POL-33333",1500));
        }catch (IllegalArgumentException ex){
            System.err.println(ex.getMessage());
        }
        parcelLocker.listPackages();
        parcelLocker.numberOfParcel();
    }
}
