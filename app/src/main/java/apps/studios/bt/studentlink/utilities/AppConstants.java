package apps.studios.bt.studentlink.utilities;

import android.content.Context;
import android.widget.Toast;

/**
 * Convince class constant properties
 */
public class AppConstants {

    public static final String RU_EMAIL = "campus.ru.ac.za";
    public static final String UP_EMAIL = "campus.up.ac.za";
    public static final String UCT_EMAIL = "campus.uct.ac.za";

    public static void toast_alert(String msg, Context ctx) {
        Toast.makeText(ctx, msg, Toast.LENGTH_LONG).show();
    }
}
