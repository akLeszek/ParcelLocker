abstract class Parcel {

    private String code;
    private int weight;

    public Parcel(){}

    public Parcel(String code, int weight){
        setCode(code);
        setWeight(weight);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if (code != null && code.matches("^[A-Z]{3}[-][0-9]{5}$")){
            this.code = code;
        } else {
            throw new IllegalArgumentException("Error: Nieprawidłowy kod paczki.");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0){
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Error: Nieprawidłowa waga paczki.");
        }
    }
}
