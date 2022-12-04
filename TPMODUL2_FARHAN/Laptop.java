public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram , float processor, boolean webcam){
        super(drive, ram , processor);
        this.webcam = webcam;
    }

    @Override
    public void informasi(){
        String isWebcam ;
        if (webcam == true) {
            isWebcam = "juga memiliki";
        } else {
            isWebcam = "TIDAK memiliki";
        }
        System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz. Selain itu laptop ini " + isWebcam + " webcam.");
    }

    public void bukagame(String nama_game){
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }

    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim Email ke " + email);
    }

    public void kirimEmail(String email1 , String email2){
        System.out.println("Laptop berhasil mengirim Email ke " + email1 + " dan ke No " + email2);
    }
}
