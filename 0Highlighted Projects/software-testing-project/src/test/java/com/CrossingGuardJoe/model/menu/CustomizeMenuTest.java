package com.CrossingGuardJoe.model.menu;

import com.CrossingGuardJoe.model.Position;
import com.CrossingGuardJoe.viewer.images.Font.FontImageFactory;
import com.CrossingGuardJoe.viewer.images.defined.CarImage;
import com.CrossingGuardJoe.viewer.images.defined.JoeImages;
import com.CrossingGuardJoe.viewer.images.defined.KidImages;
import com.CrossingGuardJoe.viewer.images.generator.Shape;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class CustomizeMenuTest {
    private CustomizeMenu customizeMenu;

    @BeforeEach
    public void setUp() {
        customizeMenu = new CustomizeMenu();
    }

    @ParameterizedTest
    @MethodSource("provideConstructor")
    public void testConstructor(Option a, Option b) {
        assertTrue(booleanCompareOptions(a, b));
    }

    @Test
    public void testGetMenuLevelsNotEmpty() {
        assertFalse(customizeMenu.getMenuLevels().isEmpty());
    }

    @Test
    public void testNavigateLeft() {
        setCurrentLevel(2);
        setOptionsSelect(5);

        customizeMenu.navigateLeft();

        assertEquals(1, getCurrentLevel());
        assertEquals(4, getOptionsSelect());
    }

    @Test
    public void testNavigateRight() {
        setCurrentLevel(2);
        setOptionsSelect(5);

        customizeMenu.navigateRight();

        assertEquals(2, getCurrentLevel());
        assertEquals(1, getOptionsSelect());
    }

    @Test
    public void testNavigateUp() {
        setOptionsSelect(5);

        customizeMenu.navigateUp();

        assertEquals(4, getOptionsSelect());
    }

    @Test
    public void testNavigateDown() {
        setCurrentLevel(2);
        setOptionsSelect(1);

        customizeMenu.navigateDown();

        assertEquals(1, getOptionsSelect());
    }

    @Test
    public void testIsSelectedJoeCustomize() {
        assertTrue(customizeMenu.isSelectedJoeCustomize());
    }

    @Test
    public void testIsNotSelectedJoeCustomize() {
        setCurrentLevel(2);
        assertFalse(customizeMenu.isSelectedJoeCustomize());
    }

    @Test
    public void testIsSelectedJoeCap() {
        setCurrentLevel(0);
        setOptionsSelect(1);

        assertTrue(customizeMenu.isSelectedJoeCap());
        assertEquals('<', customizeMenu.getSelectedColorChar());
    }

    @Test
    public void testIsNotSelectedJoeCap() {
        setCurrentLevel(2);
        setOptionsSelect(1);

        assertFalse(customizeMenu.isSelectedJoeCap());
        assertNotEquals('<', customizeMenu.getSelectedColorChar());

    }

    @Test
    public void testIsSelectedJoeClothes() {
        setCurrentLevel(0);
        setOptionsSelect(2);

        assertTrue(customizeMenu.isSelectedJoeClothes());
        assertEquals('!', customizeMenu.getSelectedColorChar());

    }

    @Test
    public void testIsNotSelectedJoeClothes() {
        setCurrentLevel(0);
        setOptionsSelect(1
        );
        assertFalse(customizeMenu.isSelectedJoeClothes());
        assertNotEquals('!', customizeMenu.getSelectedColorChar());

    }

    @Test
    public void testIsSelectedJoeVest() {
        setCurrentLevel(0);
        setOptionsSelect(3);

        assertTrue(customizeMenu.isSelectedJoeVest());
        assertEquals('+', customizeMenu.getSelectedColorChar());

    }

    @Test
    public void testIsNotSelectedJoeVest() {
        setCurrentLevel(1);
        setOptionsSelect(1);

        assertFalse(customizeMenu.isSelectedJoeVest());
        assertNotEquals('+', customizeMenu.getSelectedColorChar());

    }

    @Test
    public void testIsSelectedJoeShoes() {
        setCurrentLevel(0);
        setOptionsSelect(4);

        assertTrue(customizeMenu.isSelectedJoeShoes());
        assertEquals('*', customizeMenu.getSelectedColorChar());

    }

    @Test
    public void testIsNotSelectedJoeShoes() {
        setCurrentLevel(1);
        setOptionsSelect(1);

        assertFalse(customizeMenu.isSelectedJoeShoes());
        assertNotEquals('*', customizeMenu.getSelectedColorChar());

    }

    @Test
    public void testIsSelectedKidsCustomize() {
        assertFalse(customizeMenu.isSelectedKidsCustomize());
    }

    @Test
    public void testIsNotSelectedKidsCustomize() {
        setCurrentLevel(1);

        assertTrue(customizeMenu.isSelectedKidsCustomize());
    }

    @Test
    public void testIsSelectedKidsShirt() {
        setCurrentLevel(1);
        setOptionsSelect(1);

        assertTrue(customizeMenu.isSelectedKidsShirt());
        assertEquals('\'', customizeMenu.getSelectedColorChar());

    }

    @Test
    public void testIsNotSelectedKidsShirt() {
        setCurrentLevel(2);
        setOptionsSelect(1);

        assertFalse(customizeMenu.isSelectedKidsShirt());
        assertNotEquals('\\', customizeMenu.getSelectedColorChar());

    }

    @Test
    public void testIsSelectedKidsPants() {
        setCurrentLevel(1);
        setOptionsSelect(2);

        assertTrue(customizeMenu.isSelectedKidsPants());
        assertEquals('(', customizeMenu.getSelectedColorChar());

    }

    @Test
    public void testIsNotSelectedKidsPants() {
        setCurrentLevel(2);
        setOptionsSelect(1);

        assertFalse(customizeMenu.isSelectedKidsPants());
        assertNotEquals('(', customizeMenu.getSelectedColorChar());

    }

    @Test
    public void testIsSelectedKidsBackpack() {
        setCurrentLevel(1);
        setOptionsSelect(3);

        assertTrue(customizeMenu.isSelectedKidsBackpack());
        assertEquals(')', customizeMenu.getSelectedColorChar());

    }

    @Test
    public void testIsNotSelectedKidsBackpack() {
        setCurrentLevel(2);
        setOptionsSelect(1);

        assertFalse(customizeMenu.isSelectedKidsBackpack());
        assertNotEquals(')', customizeMenu.getSelectedColorChar());

    }

    @Test
    public void testIsSelectedKidsShoes() {
        setCurrentLevel(1);
        setOptionsSelect(4);

        assertTrue(customizeMenu.isSelectedKidsShoes());
        assertEquals('&', customizeMenu.getSelectedColorChar());

    }

    @Test
    public void testIsNotSelectedKidsShoes() {
        setCurrentLevel(2);
        setOptionsSelect(1);

        assertFalse(customizeMenu.isSelectedKidsShoes());
        assertNotEquals('&', customizeMenu.getSelectedColorChar());

    }

    @Test
    public void testIsSelectedCarsCustomize() {
        assertFalse(customizeMenu.isSelectedCarsCustomize());
    }

    @Test
    public void testIsNotSelectedCarsCustomize() {
        setCurrentLevel(2);
        assertTrue(customizeMenu.isSelectedCarsCustomize());
    }

    @Test
    public void testIsSelectedCarsBody() {
        setCurrentLevel(2);
        setOptionsSelect(1);

        assertTrue(customizeMenu.isSelectedCarsBody());
        assertEquals('@', customizeMenu.getSelectedColorChar());

    }

    @Test
    public void testIsNotSelectedCarsBody() {
        setCurrentLevel(3);
        setOptionsSelect(1);

        assertFalse(customizeMenu.isSelectedCarsBody());
        assertNotEquals('@', customizeMenu.getSelectedColorChar());
    }

    @Test
    public void testGetColorPaletteMenu() {
        assertNotNull(customizeMenu.getColorPaletteMenu());
    }


    @Test
    public void testGetDefinedColors() {
        assertFalse(customizeMenu.getDefinedColors().isEmpty());
    }

    @Test
    public void testIsColorPaletteSelected() {
        setColorPaletteSelected(true);

        assertTrue(customizeMenu.isColorPaletteSelected());
    }

    @Test
    public void testIsColorPaletteNotSelected() {
        setColorPaletteSelected(false);

        assertFalse(customizeMenu.isColorPaletteSelected());
    }

    @Test
    public void testSetColorChange() {

        ColorPaletteMenu paletteMenu = getPaletteMenu();

        setColorPaletteColorIndex(paletteMenu, 2);

        customizeMenu.setColorChange('a', 'b');

        assertEquals(0, getColorPaletteColorIndex(paletteMenu));
    }

    @Test
    public void testGetOldAndGetNewColor() {
        customizeMenu.setColorChange('a', 'b');

        assertEquals('a', customizeMenu.getOldColor());
        assertEquals('b', customizeMenu.getNewColor());
    }

    private boolean booleanCompareOptions(Option a, Option b) {
        return a.position().equals(b.position()) && a.name().equals(b.name()) && Arrays.equals(a.image(), b.image());
    }

    private static Stream<Arguments> provideConstructor() {
        try {
            CustomizeMenu customizeMenu = new CustomizeMenu();
            Field menuLevelsField = CustomizeMenu.class.getDeclaredField("menuLevels");
            menuLevelsField.setAccessible(true);

            List<List<Option>> menuLevels = (List<List<Option>>) menuLevelsField.get(customizeMenu);

            List<Option> Joe = menuLevels.get(0);

            int JOE_X = 80;
            int OPTIONS_Y = 230;

            int KIDS_X = 235;

            List<Option> Kids = menuLevels.get(1);


            int CARS_X = 403;

            List<Option> Cars = menuLevels.get(2);

            Field definedColorsField = CustomizeMenu.class.getDeclaredField("definedColors");
            definedColorsField.setAccessible(true);

            List<Option> definedColors = (List<Option>) definedColorsField.get(customizeMenu);

            return Stream.of(
                    Arguments.of(Joe.get(0), new Option("", new Position(JOE_X - 2, 95), JoeImages.getJoeStandImage())),
                    Arguments.of(Joe.get(1), new Option("Cap", new Position(JOE_X, OPTIONS_Y), new FontImageFactory().getImageRepresentation("Cap"))),
                    Arguments.of(Joe.get(2), new Option("Clothes", new Position(JOE_X, OPTIONS_Y + 30), new FontImageFactory().getImageRepresentation("Clothes"))),
                    Arguments.of(Joe.get(3), new Option("Vest", new Position(JOE_X, OPTIONS_Y + 60), new FontImageFactory().getImageRepresentation("Vest"))),
                    Arguments.of(Joe.get(4), new Option("Shoes", new Position(JOE_X, OPTIONS_Y + 90), new FontImageFactory().getImageRepresentation("Shoes"))),
                    Arguments.of(Kids.get(0), new Option("", new Position(KIDS_X + 5, 115), KidImages.getKidStandImage())),
                    Arguments.of(Kids.get(1), new Option("Shirt", new Position(KIDS_X, OPTIONS_Y), new FontImageFactory().getImageRepresentation("Shirt"))),
                    Arguments.of(Kids.get(2), new Option("Pants", new Position(KIDS_X, OPTIONS_Y + 30), new FontImageFactory().getImageRepresentation("Pants"))),
                    Arguments.of(Kids.get(3), new Option("BackPack", new Position(KIDS_X, OPTIONS_Y + 60), new FontImageFactory().getImageRepresentation("Backpack"))),
                    Arguments.of(Kids.get(4), new Option("Shoes", new Position(KIDS_X, OPTIONS_Y + 90), new FontImageFactory().getImageRepresentation("Shoes"))),
                    Arguments.of(Cars.get(0), new Option("", new Position(CARS_X - 27, 100), CarImage.getCarImage())),
                    Arguments.of(Cars.get(1), new Option("Car", new Position(CARS_X, OPTIONS_Y + 30), new FontImageFactory().getImageRepresentation("CAR"))),
                    Arguments.of(definedColors.get(0), new Option("", new Position(menuLevels.get(0).get(1).position().getX() - 13, menuLevels.get(0).get(1).position().getY()), Shape.RectangleFilledGenerator(16, 16, '<', 1, '$'))),
                    Arguments.of(definedColors.get(1), new Option("", new Position(menuLevels.get(0).get(2).position().getX() - 13, menuLevels.get(0).get(2).position().getY()), Shape.RectangleFilledGenerator(16, 16, '!', 1, '$'))),
                    Arguments.of(definedColors.get(2), new Option("", new Position(menuLevels.get(0).get(3).position().getX() - 13, menuLevels.get(0).get(3).position().getY()), Shape.RectangleFilledGenerator(16, 16, '+', 1, '$'))),
                    Arguments.of(definedColors.get(3), new Option("", new Position(menuLevels.get(0).get(4).position().getX() - 13, menuLevels.get(0).get(4).position().getY()), Shape.RectangleFilledGenerator(16, 16, '*', 1, '$'))),
                    Arguments.of(definedColors.get(4),  new Option("", new Position(menuLevels.get(1).get(1).position().getX() - 13, menuLevels.get(1).get(1).position().getY()), Shape.RectangleFilledGenerator(16, 16, '\'', 1, '$'))),
                    Arguments.of(definedColors.get(5), new Option("", new Position(menuLevels.get(1).get(2).position().getX() - 13, menuLevels.get(1).get(2).position().getY()), Shape.RectangleFilledGenerator(16, 16, '(', 1, '$'))),
                    Arguments.of(definedColors.get(6), new Option("", new Position(menuLevels.get(1).get(3).position().getX() - 13, menuLevels.get(1).get(3).position().getY()), Shape.RectangleFilledGenerator(16, 16, ')', 1, '$'))),
                    Arguments.of(definedColors.get(7), new Option("", new Position(menuLevels.get(1).get(4).position().getX() - 13, menuLevels.get(1).get(4).position().getY()), Shape.RectangleFilledGenerator(16, 16, '&', 1, '$'))),
                    Arguments.of(definedColors.get(8), new Option("", new Position(menuLevels.get(2).get(1).position().getX() - 13, menuLevels.get(2).get(1).position().getY()), Shape.RectangleFilledGenerator(16, 16, '@', 1, '$'))));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private void setCurrentLevel(int currentLevel) {
        try {
            Field currentLevelField = CustomizeMenu.class.getDeclaredField("currentLevel");
            currentLevelField.setAccessible(true);
            currentLevelField.set(customizeMenu, currentLevel);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private int getCurrentLevel() {
        try {
            Field currentLevelField = CustomizeMenu.class.getDeclaredField("currentLevel");
            currentLevelField.setAccessible(true);
            return currentLevelField.getInt(customizeMenu);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private void setOptionsSelect(int selectedOption) {
        try {
            Field optionSelectField = CustomizeMenu.class.getDeclaredField("optionSelected");
            optionSelectField.setAccessible(true);
            optionSelectField.set(customizeMenu, selectedOption);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private int getOptionsSelect() {
        try {
            Field optionSelectField = CustomizeMenu.class.getDeclaredField("optionSelected");
            optionSelectField.setAccessible(true);
            return optionSelectField.getInt(customizeMenu);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private void setColorPaletteSelected(boolean value) {
        try {
            Field colorPaletteSelected = CustomizeMenu.class.getDeclaredField("colorPaletteSelected");
            colorPaletteSelected.setAccessible(true);
            colorPaletteSelected.set(customizeMenu, value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private ColorPaletteMenu getPaletteMenu() {
        try {
            Field colorPaletteMenuField = CustomizeMenu.class.getDeclaredField("colorPaletteMenu");
            colorPaletteMenuField.setAccessible(true);

            return  (ColorPaletteMenu) colorPaletteMenuField.get(customizeMenu);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private void setColorPaletteColorIndex(ColorPaletteMenu paletteMenu, int index) {
        try {
            Field colorPaletteColorIndexField = ColorPaletteMenu.class.getDeclaredField("selectedColorIndex");
            colorPaletteColorIndexField.setAccessible(true);
            colorPaletteColorIndexField.set(paletteMenu, index);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private int getColorPaletteColorIndex(ColorPaletteMenu paletteMenu) {
        try {
            Field colorPaletteColorIndexField = ColorPaletteMenu.class.getDeclaredField("selectedColorIndex");
            colorPaletteColorIndexField.setAccessible(true);
            return colorPaletteColorIndexField.getInt(paletteMenu);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
