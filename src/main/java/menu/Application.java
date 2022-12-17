package menu;

import menu.controller.MainController;
import menu.domain.Coach;
import menu.domain.MenuRecommender;
import menu.domain.RandomCategoryGenerator;
import menu.enums.Category;
import menu.repository.CategoryRepository;
import menu.repository.CoachRepository;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        CoachRepository coachRepository = new CoachRepository();
        MainController mainController = new MainController();
        mainController.run();


//        String s = menuRecommender.selectMenu(coach, Category.JAPANESE);
//        System.out.println(s);


////        System.out.println(Category.ASIAN.getMenus());
//
//
//        System.out.println(menuRecommender.validateMenu("빵", coach));
    }
}
