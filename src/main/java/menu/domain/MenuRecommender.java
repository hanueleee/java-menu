package menu.domain;

import menu.enums.Category;
import menu.repository.CoachRepository;

public class MenuRecommender {
    private CoachRepository coachRepository = new CoachRepository();
    private RandomCategoryGenerator randomCategoryGenerator = new RandomCategoryGenerator();
    public MenuRecommender(CoachRepository coachRepository) {
        this.coachRepository = coachRepository;
    }

    public void run() {
        int cnt = 0;
        while (cnt < 5) {
            Category category = randomCategoryGenerator.create();
            cnt++;
        }
    }
}
