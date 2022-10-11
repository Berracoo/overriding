public class OgrenciKrediManager extends BaseKrediManager{
    public double hesapla(double tutar){ // base in hesaplasını öğrenci için ezdik
        // hesaplayı base ile aynı imza da yazdığımız için buradaki hesapla çalışıyor.
        return tutar * 1.10;
    }
    //overridable herhangi bir class ı inherit eden herhangi bir class onu ezebilir

}
