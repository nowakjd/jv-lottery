package core.basesyntax;

import java.util.Random;

public class Lottery {
    final private Random random = new Random();
    final private ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        return new Ball(1 + random.nextInt(100), colorSupplier.getRandomColor());
    }
}
