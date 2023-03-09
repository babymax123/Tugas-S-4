public class Kota<E> {
    private E element;

    public Kota (E kota){
        element = kota;
    }

    public E getElement(){
        return element;
    }

    public static void main(String[] args) {
        Kota<Integer> JumplahKota = new Kota<Integer>(9);
        Kota<String> NamaKota = new Kota<String>("Malang");
        System.out.println("Jumplah kota Di j=Jawa Timur"+ JumplahKota.getElement() + "Kota");
        System.out.println("Salah Satu KOta di jawa timur" + NamaKota.getElement());
    }


}
