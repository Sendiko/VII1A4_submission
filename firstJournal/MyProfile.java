public class MyProfile {
    public static void main(String[] args){
        String name = "Muhammad Rizky Sendiko";
        long nim = 607062330084L;
        String campusClass = "47-03";
        String formattedOutput = String.format("Nama: %s %nNIM: %d %nKelas: %s", name, nim, campusClass);
        
        System.out.print(formattedOutput);
    }
}
