public class Arr006 {
    public static void main(String[] args) {

        System.out.println("[ ver-1 ]");
        float[] arrfloat = new float[6];

        for (int i = 1; i < arrfloat.length; i++) {
            arrfloat[i] += 1 + ((float) i / 10f);
            System.out.print(arrfloat[i] + "\t");
        }

        System.out.println();
        System.out.println("[ ver-2 ]");
        float data = 1.f;
        float[] arrfloat2 = new float[5];
        for (int i = 0; i < arrfloat2.length; i++) {
            data += 0.1f;
            arrfloat2[i] = data;
            System.out.print(String.format("%.1f", data) + "\t");
        }
    }
}
