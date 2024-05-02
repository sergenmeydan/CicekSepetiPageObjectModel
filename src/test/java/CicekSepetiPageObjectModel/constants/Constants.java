package CicekSepetiPageObjectModel.constants;

import org.openqa.selenium.By;

public class Constants {

    public static final By CICEK_IMAGE = By.id("com.ciceksepeti.ciceksepeti:id/leftImage");

    public static final By ACCOUNT_BUTTON = By.xpath("(//android.widget.ImageView[@resource-id=\"com.ciceksepeti.ciceksepeti:id/navigation_bar_item_icon_view\"])[5]");

    public static final By SIGN_IN_BUTTON = By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.ciceksepeti.ciceksepeti:id/accountRecyclerView\"]/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.LinearLayout");

    public static final  By EMAIL_TEXT = By.id("com.ciceksepeti.ciceksepeti:id/email");

    public static final By PASSWORD = By.id("com.ciceksepeti.ciceksepeti:id/password");

    public static final By FIRST_LAST_NAME = By.id("com.ciceksepeti.ciceksepeti:id/name");

    public static final By CHECKBOX_1 = By.xpath("(//android.widget.CheckBox[@resource-id=\"com.ciceksepeti.ciceksepeti:id/checkbox\"])[1]");

    public static final By CHECKBOX_2 = By.xpath("(//android.widget.CheckBox[@resource-id=\"com.ciceksepeti.ciceksepeti:id/checkbox\"])[2]");

    public static final By SIGN_IN_FINAL_BUTTON = By.id("com.ciceksepeti.ciceksepeti:id/login");

}
