package consultations.cons_13.shoppinglist.ui;


import consultations.cons_13.shoppinglist.dto.ResponseForClientFindByIdProduct;
import consultations.cons_13.shoppinglist.service.ProductService;
import consultations.cons_13.shoppinglist.service.util.UserInput;

public class FindByIdProductMenu implements MenuCommand{

    private final ProductService service;

    public FindByIdProductMenu(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        Integer idForSearch = UserInput.getInt("Please enter product id for search:");

        ResponseForClientFindByIdProduct findByIdResult = service.findById(idForSearch);
        System.out.println(findByIdResult);

    }

    @Override
    public String getMenuName() {
        return "Find product by ID";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
