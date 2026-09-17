public class Debugger {
    //Opgave 5: Debug
    /* Hvis du kører programmet får du en række fejl.
     * Fix programmet så det kan køre
     * outputtet bliver:
     * "7 is the smallest!"
     *
     *  OBS! Skriv hvad du har gjort som kommentar ud for hver linje du fixer
     */


    int smaller = 0; // Lavet en global variabel
    void main() {

        int a = 7, b = 42;

        minimum(a,b);

        if (smaller == a) { // Lavet {} om til ().

            System.out.println("a is the smallest!");

        }

    }

    int minimum(int a, int b) { //Ændret void til int, så den kan retunere.

        if (a < b) {

            int smaller = a;

        } else  { //Slettede "statement"

            int smaller = b;

        }

        return smaller;

    }

}
