package nl.tudelft.jpacman;

import nl.tudelft.jpacman.board.*;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Test suite for the BoardFactory class.
 */
public class BoardFactoryTest {

    private BoardFactory boardFactory;
    private PacManSprites spriteStore;
    private Sprite groundSprite;
    private Sprite wallSprite;

    @BeforeEach
    void setUp() {
        // Create a mock sprite store and mock sprites for ground and wall.
        spriteStore = Mockito.mock(PacManSprites.class);
        groundSprite = Mockito.mock(Sprite.class);
        wallSprite = Mockito.mock(Sprite.class);

        // Define behavior for the mock sprite store.
        when(spriteStore.getGroundSprite()).thenReturn(groundSprite);
        when(spriteStore.getWallSprite()).thenReturn(wallSprite);

        // Instantiate the board factory with the mocked sprite store.
        boardFactory = new BoardFactory(spriteStore);
    }

    /**
     * Test creating a ground square.
     */
    @Test
    void testCreateGround() {
        Square ground = boardFactory.createGround();

        // Check that a Ground object was created and uses the correct sprite.
        assertNotNull(ground);
        assertEquals(groundSprite, ground.getSprite());
        assertTrue(ground.isAccessibleTo(Mockito.mock(Unit.class)));
    }

    /**
     * Test creating a wall square.
     */
    @Test
    void testCreateWall() {
        Square wall = boardFactory.createWall();

        // Check that a Wall object was created and uses the correct sprite.
        assertNotNull(wall);
        assertEquals(wallSprite, wall.getSprite());
        assertFalse(wall.isAccessibleTo(Mockito.mock(Unit.class)));
    }

    /**
     * Test creating a board with a grid of squares.
     */
    @Test
    void testCreateBoard() {
        // Create a 2x2 grid of squares
        Square[][] grid = {
                {boardFactory.createGround(), boardFactory.createWall()},
                {boardFactory.createGround(), boardFactory.createGround()}
        };

        // Create the board
        Board board = boardFactory.createBoard(grid);

        // Validate board dimensions
        assertEquals(2, board.getWidth());
        assertEquals(2, board.getHeight());

        // Validate that each square in the board has correct neighbors
        // Square (0,0) has neighbors (0,1), (1,0), (1,1) in a toroidal manner
        assertEquals(grid[0][1], grid[0][0].getSquareAt(Direction.NORTH));
        assertEquals(grid[1][0], grid[0][0].getSquareAt(Direction.EAST));

        assertEquals(grid[1][1], grid[0][1].getSquareAt(Direction.EAST));
        assertEquals(grid[0][0], grid[0][1].getSquareAt(Direction.NORTH));

        assertEquals(grid[1][1], grid[1][0].getSquareAt(Direction.SOUTH));
        assertEquals(grid[0][0], grid[1][0].getSquareAt(Direction.WEST));

        // Square (1,1) has neighbors (0,1), (1,0), (0,0) in a toroidal manner
        assertEquals(grid[0][1], grid[1][1].getSquareAt(Direction.WEST));
        assertEquals(grid[1][0], grid[1][1].getSquareAt(Direction.NORTH));
    }

    /**
     * Test creating a board with a null grid should throw an assertion error.
     */
    @Test
    void testCreateBoardNullGrid() {
        assertThrows(AssertionError.class, () -> boardFactory.createBoard(null));
    }

    /**
     * Test the board creation with different grid sizes.
     */
    @Test
    void testCreateBoardDifferentGridSizes() {
        // 1x1 grid
        Square[][] grid1x1 = {
                {boardFactory.createGround()}
        };
        Board board1x1 = boardFactory.createBoard(grid1x1);
        assertEquals(1, board1x1.getWidth());
        assertEquals(1, board1x1.getHeight());

        // 3x3 grid
        Square[][] grid3x3 = {
                {boardFactory.createGround(), boardFactory.createWall(), boardFactory.createGround()},
                {boardFactory.createWall(), boardFactory.createGround(), boardFactory.createWall()},
                {boardFactory.createGround(), boardFactory.createWall(), boardFactory.createGround()}
        };
        Board board3x3 = boardFactory.createBoard(grid3x3);
        assertEquals(3, board3x3.getWidth());
        assertEquals(3, board3x3.getHeight());
    }


    @Test
    void testToroidalWrappingWithNegativeMutation() {
        // Create a 2x2 grid to isolate toroidal behavior on small grids
        Square[][] grid = {
                {boardFactory.createGround(), boardFactory.createWall()},
                {boardFactory.createWall(), boardFactory.createGround()}
        };

        // Create the board with the provided grid
        Board board = boardFactory.createBoard(grid);

        // Assert that board dimensions are correct
        assertEquals(2, board.getWidth());
        assertEquals(2, board.getHeight());

        // Check each square's neighbor links based on correct toroidal wrapping

        // Square (0,0)
        assertSame(grid[0][1], grid[0][0].getSquareAt(Direction.NORTH), "Expected (0,1) to be east of (0,0)");
        assertSame(grid[1][0], grid[0][0].getSquareAt(Direction.WEST), "Expected (1,0) to be south of (0,0)");

        // Square (0,1)
        assertSame(grid[0][0], grid[0][1].getSquareAt(Direction.NORTH), "Expected (0,0) to be west of (0,1)");
        assertSame(grid[1][1], grid[0][1].getSquareAt(Direction.EAST), "Expected (1,1) to be south of (0,1)");

        // Square (1,0)
        assertSame(grid[0][0], grid[1][0].getSquareAt(Direction.WEST), "Expected (0,0) to be north of (1,0)");
        assertSame(grid[1][1], grid[1][0].getSquareAt(Direction.SOUTH), "Expected (1,1) to be east of (1,0)");

        // Square (1,1)
        assertSame(grid[0][1], grid[1][1].getSquareAt(Direction.WEST), "Expected (0,1) to be north of (1,1)");
        assertSame(grid[1][0], grid[1][1].getSquareAt(Direction.NORTH), "Expected (1,0) to be west of (1,1)");
    }


}
