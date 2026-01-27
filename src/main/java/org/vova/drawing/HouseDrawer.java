package org.vova.drawing;

import static org.vova.drawing.PatternDrawerService.dot;
import static org.vova.drawing.PatternDrawerService.point;

public class HouseDrawer {
    public static HouseDrawer newInstance() {
        return new HouseDrawer();
    }

    public HouseDrawer drawHouseEx(int size) {
        PatternDrawerService p = PatternDrawerService.newInstance();

        int midHeight = size / 2 - 1;
        int center = midHeight + 1;

        p.printDottedLinesEx(
                        center,
                        point(center, -1),
                        point(center, 1)
                )
                .printSolidLine(size)

                .printDottedLinesEx(
                        size - 2,
                        point(0, 0),
                        point(1, 1),
                        point(size - 2, -1),
                        point(size - 1, 0)
                )
                .printSolidLine(size);

        return this;
    }

    HouseDrawer drawHouseWithDottedLines(int size) {
        PatternDrawerService pattern = PatternDrawerService.newInstance();
        int midHeight = size / 2 - 1;

        pattern.printDottedLine(midHeight + 1);

        pattern.printDottedLines(
                midHeight,
                dot(midHeight, -1),
                dot(1, 2)
        );

        pattern.printSolidLine(size);

        pattern.printDottedLines(
                midHeight,
                dot(0, 0),
                dot(0, 1),
                dot(size - 4, -2),
                dot(0, 1)
        );
        pattern.printDottedLines(
                1,
                dot(0, 0),
                dot(midHeight, 0),
                dot(midHeight, 0)
        );
        pattern.printDottedLines(
                midHeight,
                dot(0, 0),
                dot(midHeight - 1, -1),
                dot(1, 2),
                dot(midHeight - 1, -1)
        );

        pattern.printSolidLine(size);

        return this;
    }

    HouseDrawer drawHouseWithDottedLine(int size) {
        PatternDrawerService pattern = PatternDrawerService.newInstance();
        int midHeight = size / 2 - 1;

        pattern.printDottedLine(midHeight + 1);

        for (int i = 0; i < midHeight; i++) {
            pattern.printDottedLine(midHeight - i, 2 * i + 1);
        }

        pattern.printSolidLine(size);

        for (int i = 0; i < midHeight; i++) {
            pattern.printDottedLine(0, i, size - 4 - 2 * i, i);
        }

        pattern.printDottedLine(0, midHeight, midHeight);

        for (int i = 0; i < midHeight; i++) {
            pattern.printDottedLine(0, midHeight - 1 - i, 1 + 2 * i, midHeight - 1 - i);
        }

        pattern.printSolidLine(size);

        return this;
    }

    HouseDrawer drawNewLine() {
        System.out.println();
        return this;
    }
}
