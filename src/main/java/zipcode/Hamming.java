package zipcode;

public class Hamming {
    String s;
    String s1;
    IllegalArgumentException error = new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    public Hamming(String s, String s1) {
        this.s = s;
        this.s1 = s1;
        if(s.length()!=s1.length()){
            throw error;
        }
    }

    public int getHammingDistance() {
        int count =0;
        char[] c = s.toCharArray();
        char[] c1 = s1.toCharArray();
        for(int i =0;i<c.length;i++){
            if(c[i]!=c1[i]){
                count ++;
            }
        }
        return count;
    }
}
