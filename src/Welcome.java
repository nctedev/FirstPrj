import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        String ho_ten;
        String lop_hp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ho ten" );
        ho_ten = sc.nextLine();
        System.out.println("Moi nhap lop hoc phan" );
        lop_hp = sc.nextLine();
        System.out.println("Hello" + ho_ten + " " + lop_hp );
    }
}