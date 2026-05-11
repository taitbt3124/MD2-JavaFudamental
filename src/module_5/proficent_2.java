package module_5;

public class proficent_2 {
    public static void main(String[] args) {
        int iterations = 100_000;

        long startTime = System.currentTimeMillis();
        String str = "Hello";
        for (int i = 0; i < iterations; i++) {
            str += " World";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < iterations; i++) {
            sb.append(" World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 0; i < iterations; i++) {
            sbf.append(" World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (endTime - startTime) + " ms");
    }
}
