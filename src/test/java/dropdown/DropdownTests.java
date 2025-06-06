package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectOption() {
     var dropdownPage = homePage.clickDropdown();
     String option="Option 1";
        dropdownPage.selectOption(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selected options");
        assertTrue(selectedOptions.contains(option), "Selected option is not correct");

    }

}
