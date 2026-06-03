
public class Main {
    static void main() {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
OUTPUT:
        *
        **
        ***
        ****
        *****



public class Main {
    static void main() {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

OUTPUT:
        *****
        ****
        ***
        **
        *

public class Main {
    static void main() {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
OUTPUT:
        1
        12
        123
        1234
        12345


public class Main {
    static void main() {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
OUTPUT:
        1
        22
        333
        4444
        55555

public class Main {
    static void main() {
        int n=5;
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }

}
OUTPUT:
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15


public class Main {
    static void main() {
        int n=5;
        int k=10;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k-- + " ");
            }
            System.out.println();
        }
    }

}
OUTPUT:
        10
        9 8
        7 6 5
        4 3 2 1
        0 -1 -2 -3 -4


import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main {
    static void main() {
        int n=4;
        // int k=10;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

OUTPUT:
           *
          ***
         *****
        *******
