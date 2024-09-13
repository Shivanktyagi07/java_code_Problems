public class ASCIITable {
    public static void main(String[] args) {
        System.out.println("ASCII Table:");
        System.out.println("Character\tASCII Value");

        for (int i = 32; i <= 126; i++) {
            
            System.out.println((char) i + "\t"+"->"+"\t" + i);
        }
    }
}
