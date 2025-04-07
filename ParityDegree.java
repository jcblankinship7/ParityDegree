public class Main {

  public static int solution(int N) {
    int result = 0;

    for (int i = 0; Math.pow(2, i) <= N; i++) { 
        if (N % (1 << i) == 0) { 
            result = i;
        }
    }
    return result;
  }
    
  public static void main(String[] args) {
  	int n = 24;
    int result = solution(n);
		
	System.out.println("The highest power of 2 that divides "+ n + " is: " + result);
  }
}
