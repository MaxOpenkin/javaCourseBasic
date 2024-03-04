package consultations.cons_13.shoppinglist.ui;

import consultations.cons_13.shoppinglist.dto.ResponseForClientForDelete;
import consultations.cons_13.shoppinglist.service.ProductService;
import consultations.cons_13.shoppinglist.service.util.UserInput;

public class DeleteProductMenu implements MenuCommand {

    private final ProductService service;

    public DeleteProductMenu(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        Integer idFroDelete = UserInput.getInt("Please enter product id for delete:");

        ResponseForClientForDelete deleteResult = service.deleteById(idFroDelete);
        System.out.println(deleteResult);

    }

    @Override
    public String getMenuName() {
        return "Delete product";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
