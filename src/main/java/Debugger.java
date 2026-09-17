public class Debugger {
    //Opgave 5: Debug
    /* Hvis du kører programmet får du en række fejl.
     * Fix programmet så det kan køre
     * outputtet bliver:
     * "7 is the smallest!"
     *
     *  OBS! Skriv hvad du har gjort som kommentar ud for hver linje du fixer
     */



    void main(){

        int a = 7, b = 42;

        int smaller = minimum(a,b); //Lavet en variabel til at gemme metodens return i.

        if (smaller == a) { // Lavet {} om til ().

            System.out.println("a is the smallest!");

        }

    }

    int minimum(int a, int b) { //Ændret void til int, så den kan retunere.

        if (a < b) {

            int smaller = a;
            return smaller; //Indsat return

        } else  { //Slettede "statement"

            int smaller = b;
            return smaller; //Indsat return

        }


    }

}
