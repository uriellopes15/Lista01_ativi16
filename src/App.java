import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner ler = new Scanner(System.in);

double a, b, l, p, c, latas, total;

System.out.printf("Entre com o valor em metros quadrados a ser pintado : ");
a = ler.nextDouble();

l = a/3;
p = 80.0;
c = 18;
if ( a%54 == 0)
latas = l/c;
else

latas = (int)(l/c) + 1;
total = latas*p;

System.out.printf(" Voce precisa de %.1f latas e custará %.2f reais ", latas, total);
}
}

