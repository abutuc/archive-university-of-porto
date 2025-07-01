package pt.up.fe.basket;

import net.jqwik.api.*;
import net.jqwik.api.stateful.ActionSequence;

public class BasketPBTest {

    @Property
    public void sequenceOfAdds(
            @ForAll("adds")
            ActionSequence<Basket> actions) {
        actions.run(new Basket());
    }

    @Provide
    public Arbitrary<ActionSequence<Basket>> adds() {
        // This is where the magic happens: jqwik generates random sequences of add actions
        return Arbitraries.sequences(Arbitraries.oneOf(BasketActions.addAction()));
    }

    @Property
    public void sequenceOfRemoves(
            @ForAll("removes")
            ActionSequence<Basket> actions) {
        actions.run(new Basket());
    }

    @Provide
    public Arbitrary<ActionSequence<Basket>> removes() {
        // This is where the magic happens: jqwik generates random sequences of remove actions
        return Arbitraries.sequences(Arbitraries.oneOf(BasketActions.removeAction()));
    }

    @Property // Note: This test reveals a bug
    public void sequenceOfAddsAndRemoves(
            @ForAll("addsAndRemoves")
            ActionSequence<Basket> actions) {
        actions.run(new Basket());
    }

    @Provide
    public Arbitrary<ActionSequence<Basket>> addsAndRemoves() {
        // This is where the magic happens: jqwik generates random sequences of add and remove actions
        return Arbitraries.sequences(Arbitraries.oneOf(BasketActions.addAction(), BasketActions.removeAction()));
    }
}
