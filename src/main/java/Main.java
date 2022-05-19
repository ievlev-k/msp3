public class Main {
    public static void main(String[] args) {

        float x= 1;
        float y = 1;
        float r = 1;
        Result result = new Result( x, y, r);
        result.checkHit();
        String answer = result.toString();
        System.out.println(answer);
    }
}
