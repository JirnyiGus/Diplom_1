package prakticum;

import org.junit.Assert;
import org.junit.Test;

import praktikum.Ingredient;
import praktikum.IngredientType;

public class IngredientTests {

    @Test
    public void getNameIngredientTest(){
        String expected = "Бекон";
        Ingredient ingredient = new Ingredient(IngredientType.FILLING,"Бекон", 100f);
        String actual =  ingredient.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getPriceIngredientTest(){
        float expected = 100f;
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE,"Сырный", 100f);
        float actual = ingredient.getPrice();
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void getTypeIngredientTest(){
        Ingredient ingredient = new Ingredient(IngredientType.FILLING,"Бекон", 100f);
        IngredientType expected = IngredientType.FILLING;
        IngredientType actual = ingredient.getType();
        Assert.assertEquals(expected,actual);
    }
}
