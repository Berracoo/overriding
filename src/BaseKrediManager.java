public class BaseKrediManager {

    public double hesapla(double tutar){ // eğer double dan önce final koyarsak bu methodu diğer sınıflar override edemezdi.
        return tutar * 1.18; // 1.18 i faiz oranı olarak aldık.

    }

}
