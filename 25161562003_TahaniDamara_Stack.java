

package pkg25161562003_tahanidamara_stack.java;


// Nama  : Tahani Damara
// NPM   : 25161562003
// Kelas : 2A

public class TiketBioskop {

    // === BAGIAN 1: Deklarasi Stack ===
    static String[] stack = new String[10];
    static int top = -1;

    // === BAGIAN 2: Operasi Stack ===
    // TODO: Lengkapi method push()
    static void push(String tiket) {
        if (top == stack.length - 1) {
            System.out.println("Stack penuh!");
        } else {
            top++;
            stack[top] = tiket;
        }
    }

    // TODO: Lengkapi method pop()
    static String pop() {
        if (top == -1) {
            return "Stack kosong!";
        } else {
            String data = stack[top];
            top--;
            return data;
        }
    }

    // TODO: Lengkapi method peek()
    static String peek() {
        if (top == -1) {
            return "Stack kosong!";
        } else {
            return stack[top];
        }
    }

    static boolean isEmpty() {

        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    static void tampilkanStack() {
        System.out.println("=== Isi Stack (TOP -> BOTTOM) ===");
        for (int i = top; i >= 0; i--) {
            System.out.println("| " + stack[i] + " |");
        }
        System.out.println("=================================");
    }

    
    static void hitungTotal() {
        int total = 0;
        for (int i = 0; i <= top; i++) {
            if (stack[i].contains("50000")) {
                total = total + 50000;
            } else {
                total = total + 45000;
            }
        }

        System.out.println("Total transaksi: Rp" + total);
    }

    // === BAGIAN 3: Main Program ===
    public static void main(String[] args) {

        push("Tiket-A01: Avengers Rp50.000");
        push("Tiket-B02: Interstellar Rp45.000");
        push("Tiket-C03: Inception Rp45.000");

        hitungTotal();

        tampilkanStack();

        // TODO: tampilkan tiket paling atas (peek)
        System.out.println("Tiket terakhir masuk: " + peek());

        // TODO: batalkan 1 transaksi teratas (pop) dan tampilkan
        System.out.println("Tiket dibatalkan: " + pop());

        tampilkanStack();
    }
}

#RUN ATAU HASIL NYA

run:
Total transaksi: Rp135000
=== Isi Stack (TOP -> BOTTOM) ===
| Tiket-C03: Inception Rp45.000 |
| Tiket-B02: Interstellar Rp45.000 |
| Tiket-A01: Avengers Rp50.000 |
=================================
Tiket terakhir masuk: Tiket-C03: Inception Rp45.000
Tiket dibatalkan: Tiket-C03: Inception Rp45.000
=== Isi Stack (TOP -> BOTTOM) ===
| Tiket-B02: Interstellar Rp45.000 |
| Tiket-A01: Avengers Rp50.000 |
=================================
BUILD SUCCESSFUL (total time: 0 seconds)





