package topcoder;

/**
 * Created by u6023478 on 2/28/2017.
 */
public class Bullets {
    public static void main(String[] args) {
        Bullets bullets = new Bullets();
        String [] guns = new String[]{"||| |","| | || "};
        String bullet = "|||| ";

        System.out.println(bullets.match(guns,bullet));

    }
    public int match(String[] guns, String bullet){
        int i = 0;
        for(String gun : guns){
            if(matches(gun,bullet))
                return i;
            i++;
        }
        return -1;
    }
    public boolean matches(String gun, String bullet){
        int n = gun.length();
        if(bullet.length()!=n)
            return false;
        for(int i =0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = i; j<n; j++){
                sb.append(gun.charAt(j)+"");
            }
            for(int k=0; k<i; k++){
                sb.append(gun.charAt(k)+"");
            }
            if(sb.toString().equals(bullet))
                return true;
        }
        return false;
    }

}
