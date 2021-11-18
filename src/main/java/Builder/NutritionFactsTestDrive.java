package Builder;

public class NutritionFactsTestDrive {

    public static void main(String[] args) {
        NutritionFacts nutritionFacts =new  NutritionFacts.Builder(12,34).fat(12).calories(34).build();

        System.out.println(nutritionFacts);
    }
}
