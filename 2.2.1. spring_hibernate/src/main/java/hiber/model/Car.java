package hiber.model;

import javax.persistence.*;

@Entity
@Table(name="cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="id_car")
    private Long id;
    @Column(name="model")
    private String model;
    @Column(name = "series")
    private int series;
    public Car(){
    }
    public Car(String model,int series){
        this.model = model;
        this.series = series;
    }
    public void setModel(String mod){
        model=mod;
    }
    public void setSeries(int s){
        series=s;
    }
    public String getModel(){
        return model;
    }
    public int getSeries(){
        return series;
    }
    @Override
    public String toString() {
        return  "model: '" + model + '\'' +
                ", series: " + series;
    }
}
