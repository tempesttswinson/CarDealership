// Interfaces normally follow a naming convention similar to classes
// but they end in '-ible' or '-able'
// Usually adjective because we usually interfaces to provide additional capabilities

interface Leaseable {

    boolean isLeaseable();

    int getLeaseTerm();

    int getMaxMilesPerYear();

    // using default allows us to not have to go in and change classes that
    // implement this interface
    default float getMileablePenalty() {
        return 500.0f;
    }
}